/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.domain.customer;


import org.seedstack.business.api.domain.GenericRepository;

/**
 * Repository interface.
 */
public interface CustomerRepository extends GenericRepository<Customer, CustomerId> {

    /**
     * Delete all products
     *
     * @return number of products deleted
     */
    long deleteAll();

    /**
     * Count the number of products in the repository.
     *
     * @return product count
     */
    long count();

}
