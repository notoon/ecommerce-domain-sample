/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.data.product;

import org.seedstack.business.api.interfaces.assembler.BaseAssembler;
import org.seedstack.samples.ecommerce.domain.category.Category;
import org.seedstack.samples.ecommerce.domain.product.Product;

/**
 * @author adrien.lauer@mpsa.com
 */
public class ProductDTOAssembler extends BaseAssembler<Product, ProductDTO> {
    @Override
    protected void doAssembleDtoFromAggregate(ProductDTO targetDto, Product sourceAggregate) {
        targetDto.setId(sourceAggregate.getEntityId());
        targetDto.setDesignation(sourceAggregate.getDesignation());
        targetDto.setDetails(sourceAggregate.getDetails());
        targetDto.setPicture(sourceAggregate.getPicture());
        targetDto.setPrice(sourceAggregate.getPrice());
        targetDto.setSummary(sourceAggregate.getSummary());
        targetDto.setCategoryId(sourceAggregate.getCategoryId());
    }

    @Override
    protected void doMergeAggregateWithDto(Product targetAggregate, ProductDTO sourceDto) {
        targetAggregate.setEntityId(sourceDto.getId());
        targetAggregate.setDesignation(sourceDto.getDesignation());
        targetAggregate.setDetails(sourceDto.getDetails());
        targetAggregate.setPicture(sourceDto.getPicture());
        targetAggregate.setPrice(sourceDto.getPrice());
        targetAggregate.setSummary(sourceDto.getSummary());
        targetAggregate.setCategoryId(sourceDto.getCategoryId());
    }
}
