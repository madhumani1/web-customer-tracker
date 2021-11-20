/**
 * 
 */
package com.madhu.demo.datasources.service;

import java.util.List;

import com.madhu.demo.datasources.entity.Customer;
import com.madhu.demo.datasources.entity.Employee;

/**
 * @author 15197
 *
 */
public interface MultiDataSourceService {
	public List<Customer> getCustomers();
	public List<Employee> getEmployees();
}
