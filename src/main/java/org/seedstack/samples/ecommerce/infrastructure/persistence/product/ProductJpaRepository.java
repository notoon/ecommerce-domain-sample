/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.persistence.product;

import org.seedstack.samples.ecommerce.domain.category.Category;
import org.seedstack.samples.ecommerce.domain.product.Product;
import org.seedstack.samples.ecommerce.domain.product.ProductRepository;
import org.seedstack.business.jpa.BaseJpaRepository;

import javax.persistence.Query;

/**
 * JPA Repository implementation.
 */
public class ProductJpaRepository extends BaseJpaRepository<Product, Long> implements ProductRepository {

    private static final int MAX_ID = 90000;

    @Override
    public Product saveProduct(Product product) {
        if (product.getEntityId() == null) {
            product.setEntityId(generateID());
        }
        return super.save(product);
    }

    @Override
    public void persistProduct(Product product) {
        if (product.getEntityId() == null) {
            product.setEntityId(generateID());
        }
        super.persist(product);
    }

    @Override
    public long count() {
        return (Long) entityManager.createQuery("SELECT count(*) FROM Product p").getSingleResult();
    }

    @Override
    public long deleteAll() {
        return entityManager.createQuery("DELETE FROM Product").executeUpdate();
    }

    // TODO replace this with identity strategy
    private long generateID() {
        long id = 0;
        Query query = entityManager.createQuery("select max(p.entityId) from Product p");
        if (query.getSingleResult() != null) {
            id = Math.max(MAX_ID, (Long) query.getSingleResult());
        }
        return id + 1;
    }
}
