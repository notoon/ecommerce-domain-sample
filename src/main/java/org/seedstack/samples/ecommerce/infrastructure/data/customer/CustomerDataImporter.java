/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.data.customer;

import org.seedstack.business.api.interfaces.assembler.FluentAssembler;
import org.seedstack.samples.ecommerce.domain.customer.Customer;
import org.seedstack.samples.ecommerce.domain.customer.CustomerRepository;
import org.seedstack.seed.core.spi.data.DataImporter;
import org.seedstack.seed.core.spi.data.DataSet;
import org.seedstack.seed.persistence.jpa.api.JpaUnit;
import org.seedstack.seed.transaction.api.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.HashSet;
import java.util.Set;

/**
 * @author adrien.lauer@mpsa.com
 */
@DataSet(group = "ecommerce-domain", name = "customers")
public class CustomerDataImporter implements DataImporter<CustomerDTO> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDataImporter.class);

    @Inject
    private CustomerRepository customerRepository;

    private Set<CustomerDTO> staging = new HashSet<CustomerDTO>();

    @Inject
    private FluentAssembler fluentAssembler;

    @Transactional
    @JpaUnit("ecommerce-domain")
    @Override
    public boolean isInitialized() {
        return customerRepository.count() != 0;
    }

    @Override
    public void importData(CustomerDTO data) {
        staging.add(data);
    }

    @Transactional
    @JpaUnit("ecommerce-domain")
    @Override
    public void commit(boolean clear) {
        if (clear) {
            LOGGER.info("Clearing customers");
            customerRepository.deleteAll();
        }

        LOGGER.info("staging size: " + staging.size());

        for (CustomerDTO customerDTO : staging) {
            customerRepository.persist(fluentAssembler.merge(customerDTO).into(Customer.class).fromFactory());
        }

        LOGGER.info("Import of customers completed");
        staging.clear();
    }

    @Override
    public void rollback() {
        staging.clear();
        LOGGER.warn("Rollback occurred during customer import");
    }
}
