/**
 * 
 */
package com.madhu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madhu.demo.dao.CustomerDAO;
import com.madhu.demo.entity.Customer;

/**
 * @author 15197
 * This is implementation class of CustomerService Interface.
 * @Service � It is used for Service Facade implementations. 
 * Through component-scanning, Spring will register this component.  
 * 
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject the DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	// Mark for transactional. 
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// return results
		return customerDAO.getCustomers();
	}
}
