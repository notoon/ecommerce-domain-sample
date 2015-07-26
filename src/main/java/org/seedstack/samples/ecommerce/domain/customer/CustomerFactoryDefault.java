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


import org.seedstack.business.api.domain.BaseFactory;

/**
 * Customer Factory implementation.
 */
public class CustomerFactoryDefault extends BaseFactory<Customer> implements CustomerFactory {

	@Override
	public Customer createCustomer(String email ,String firstName,
			String lastName,String password, String address, String deliveryAddress) {

		Customer customer = new Customer();
		customer.setEntityId(new CustomerId(email));
		customer.setFirstName(firstName);
		customer.setPassword(password);
		customer.setLastName(lastName);
        customer.setAddress(address);
		customer.setDeliveryAddress(deliveryAddress);
		return customer;
	}

	@Override
	public Customer createCustomer(String email) {
		CustomerId id = new CustomerId(email);
		Customer customer = new Customer();
		customer.setEntityId(id);

		return customer;
	}
	
	@Override
	public Customer createCustomer(String email ,String firstName,
			String lastName) {

		Customer customer = new Customer();
		customer.setEntityId(new CustomerId(email));
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		return customer;
	}

    @Override
    public CustomerId createCustomerId(String customerId) {
        return new CustomerId(customerId);
    }
}
