/**
 * 
 */
package com.madhu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 15197
 * Customer Controller
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {
	@RequestMapping("/list")
	public String listCustomers(Model theModel)	{
		return "list-customers";
	}
}
