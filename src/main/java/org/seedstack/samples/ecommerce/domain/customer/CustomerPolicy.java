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

import org.seedstack.business.api.domain.DomainPolicy;

/**
 * DomainPolicy for Customer.
 */
@DomainPolicy
public interface CustomerPolicy {

    /**
     * Test is the customer is valid accordingly to its entityId and its password.
     *
     * @param customer the customer to check
     * @return true if the customer is valid
     */
    boolean isValidCustomer(Customer customer);
}
