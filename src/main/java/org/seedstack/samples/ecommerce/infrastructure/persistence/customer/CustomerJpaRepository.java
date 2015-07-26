/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.persistence.customer;

import org.seedstack.samples.ecommerce.domain.customer.Customer;
import org.seedstack.samples.ecommerce.domain.customer.CustomerId;
import org.seedstack.samples.ecommerce.domain.customer.CustomerRepository;
import org.seedstack.business.jpa.BaseJpaRepository;
import org.seedstack.samples.ecommerce.domain.product.Product;

/**
 * JPA Repository implementation.
 */
public class CustomerJpaRepository extends BaseJpaRepository<Customer, CustomerId> implements CustomerRepository {
    @Override
    public long count() {
        return (Long) entityManager.createQuery("SELECT count(*) FROM Customer c").getSingleResult();
    }

    @Override
    public long deleteAll() {
        return entityManager.createQuery("DELETE FROM Customer").executeUpdate();
    }
}