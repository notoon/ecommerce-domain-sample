/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.domain.product;

import org.seedstack.business.api.domain.GenericRepository;

/**
 * Repository interface of {@link Product}.
 */
public interface ProductRepository extends GenericRepository<Product, Long> {
    /**
     * Saves the product.
     *
     * @param product the product to save
     * @return the product
     */
    Product saveProduct(Product product);

    /**
     * Persists the product.
     *
     * @param product the product to persist
     */
    void persistProduct(Product product);

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
