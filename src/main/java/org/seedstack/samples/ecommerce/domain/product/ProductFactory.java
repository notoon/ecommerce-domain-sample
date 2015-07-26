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


import org.seedstack.business.api.domain.GenericFactory;

/**
 * Product Factory interface of {@link Product}.
 */
public interface ProductFactory extends GenericFactory<Product> {
	/**
	 * Create a product.
	 * 
	 * @param id the id
	 * @param designation the designation
	 * @param summary the summary
	 * @param details the details
	 * @param picture the picture
	 * @param price the price
	 * @param categoryId the categoryId
	 * @return product
	 */
	Product createProduct(Long id, String designation, String summary, String details, String picture, Double price, Long categoryId);

}
