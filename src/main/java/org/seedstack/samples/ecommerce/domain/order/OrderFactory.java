/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.domain.order;

import org.javatuples.Triplet;
import org.seedstack.business.api.domain.GenericFactory;

import java.util.Date;
import java.util.List;

/**
 * Order Factory interface of order.
 */
public interface OrderFactory extends GenericFactory<Order> {

    /**
     * Create an order.
     *
     * @param customerId        the order customerId
     * @param checkoutDate      the order checkoutDate
     * @param price             the order price
     * @param orderItemTriplets the order orderItemTriplets
     * @return the order
     */
    Order createOrder(String customerId, Date checkoutDate, double price, List<Triplet<Integer, Double, Long>> orderItemTriplets);
}
