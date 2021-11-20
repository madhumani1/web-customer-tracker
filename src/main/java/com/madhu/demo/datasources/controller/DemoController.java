/**
 * 
 */
package com.madhu.demo.datasources.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madhu.demo.dao.CustomerDAO;
import com.madhu.demo.datasources.entity.Customer;
import com.madhu.demo.datasources.entity.Employee;
import com.madhu.demo.datasources.service.MultiDataSourceService;

/**
 * @author 15197
 * Customer Controller
 * With Autowired, Spring will scan for a component that implements CustomerDAO interface
 * no more RequestMapping. use GetMapping or PostMapping.
 * With Service in place now, we no longer need to use DAO in controller. We will use Service layer instead
 * 
 */
@Controller
public class DemoController {
	/**
	 * With Service in place now, we no longer need to use DAO in controller. 
	 * We will use Service layer instead
	 * comment @AutoWired private CustomerDAO customerDAO;
	 */
	// need to inject the customer DAO
	//@Autowired
	//private CustomerDAO customerDAO;
	// need to inject the customer service
	@Autowired
	private MultiDataSourceService multiDataSourceService;
	
	/* @RequestMapping("/list") */
	@GetMapping("/")
	public String listCustomers(Model theModel)	{
		// get customer from the DAO
		//List<Customer> theCustomers = customerDAO.getCustomers();
		// get customers from the Service
		List<Customer> theCustomers = multiDataSourceService.getCustomers();
		// add the customer to my Spring MVC model
		theModel.addAttribute("customers", theCustomers);	// customers name and theCustomers value
		// get employees from the Service
		List<Employee> theEmployees = multiDataSourceService.getEmployees();
		
		// add the employee to my Spring MVC model
		theModel.addAttribute("employees", theEmployees);	// employee name and theEmployees value
		
		return "display-results";
	}
}
