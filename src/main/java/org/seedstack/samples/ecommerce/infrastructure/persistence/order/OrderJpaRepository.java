/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.persistence.order;


import org.seedstack.samples.ecommerce.domain.order.Order;
import org.seedstack.samples.ecommerce.domain.order.OrderRepository;
import org.seedstack.business.jpa.BaseJpaRepository;

/**
 * JPA Repository implementation.
 */
public class OrderJpaRepository extends BaseJpaRepository<Order, Long> implements OrderRepository {
}