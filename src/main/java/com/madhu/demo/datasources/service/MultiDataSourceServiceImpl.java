/**
 * 
 */
package com.madhu.demo.datasources.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.madhu.demo.datasources.dao.CustomerDAO;
import com.madhu.demo.datasources.entity.Customer;
import com.madhu.demo.datasources.dao.EmployeeDAO;
import com.madhu.demo.datasources.entity.Employee;

/**
 * @author 15197
 * This is implementation class of CustomerService Interface.
 * @Service – It is used for Service Facade implementations. 
 * Through component-scanning, Spring will register this component.  
 * 
 */
@Service
public class MultiDataSourceServiceImpl implements MultiDataSourceService {

	// need to inject the DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	// Mark for transactional. 
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// return results
		return customerDAO.getCustomers();
	}

	@Override
	public List<Employee> getEmployees() {
		// return results
		return employeeDAO.getEmployees();
	}
}
