/**
 * 
 */
package com.madhu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madhu.demo.dao.CustomerDAO;
import com.madhu.demo.entity.Customer;

/**
 * @author 15197
 * Customer Controller
 * With Autowired, Spring will scan for a component that implements CustomerDAO interface
 * no more RequestMapping. use GetMapping or PostMapping
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
	// need to inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	/* @RequestMapping("/list") */
	@GetMapping("/list")
	public String listCustomers(Model theModel)	{
		// get customer from the DAO
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		// add the customer to my Spring MVC model
		theModel.addAttribute("customers", theCustomers);	// customers name and theCustomers value
		
		return "list-customers";
	}
}
