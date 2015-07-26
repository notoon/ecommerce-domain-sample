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


import org.seedstack.business.api.domain.BaseFactory;

/**
 * Product Factory implementation.
 */
public class ProductFactoryDefault extends BaseFactory<Product> implements ProductFactory {

	@Override
	public Product createProduct(Long id, String designation, String summary, String details, String picture, Double price, Long categoryId) {

		Product product = new Product();
		product.setEntityId(id);
		product.setDesignation(designation);
		product.setSummary(summary);
		product.setDetails(details);
		product.setPicture(picture);
		product.setPrice(price);
		product.setCategoryId(categoryId);
		return product;
	}
}
