/**
 * Copyright (c) 2013-2015 by The SeedStack authors. All rights reserved.
 *
 * This file is part of SeedStack, An enterprise-oriented full development stack.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.samples.ecommerce.infrastructure.data.category;

import org.seedstack.business.api.interfaces.assembler.BaseAssembler;
import org.seedstack.samples.ecommerce.domain.category.Category;

/**
 * @author adrien.lauer@mpsa.com
 */
public class CategoryDTOAssembler extends BaseAssembler<Category, CategoryDTO> {
    @Override
    protected void doAssembleDtoFromAggregate(CategoryDTO targetDto, Category sourceAggregate) {
        targetDto.setId(sourceAggregate.getEntityId());
        targetDto.setName(sourceAggregate.getName());
        targetDto.setImg(sourceAggregate.getUrlImg());
    }

    @Override
    protected void doMergeAggregateWithDto(Category targetAggregate, CategoryDTO sourceDto) {
        targetAggregate.setEntityId(sourceDto.getId());
        targetAggregate.setName(sourceDto.getName());
        targetAggregate.setUrlImg(sourceDto.getImg());
    }
}
