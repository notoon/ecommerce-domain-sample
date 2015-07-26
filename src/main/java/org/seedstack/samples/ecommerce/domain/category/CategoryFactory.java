/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.domain.category;

import org.seedstack.business.api.domain.GenericFactory;

/**
 * Category Factory interface.
 */
public interface CategoryFactory extends GenericFactory<Category> {
    /**
     * Factory create method.
     *
     * @param id     the category id
     * @param name   the category name
     * @param urlImg the image URL
     * @return the category
     */
    Category createCategory(Long id, String name, String urlImg);

}
