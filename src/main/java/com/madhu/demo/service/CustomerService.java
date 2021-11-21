/**
 * 
 */
package com.madhu.demo.service;

import java.util.List;

import com.madhu.demo.entity.Customer;

/**
 * @author 15197
 *
 */
public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
