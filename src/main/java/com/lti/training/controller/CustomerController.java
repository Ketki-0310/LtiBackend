package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.training.entity.Customer;
import com.lti.training.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(path = "/customer/add", method = RequestMethod.POST)
	public String add(@RequestBody Customer customer) {
		customerService.add(customer);
		return "Customer created successfully";
	}

	/*@RequestMapping(path = "/customer/verify", method = RequestMethod.POST)
	public String verify(@RequestBody Customer customer) {

		boolean flag = customerService.verify(customer);
		String flag1 = Boolean.toString(flag);
		System.out.println("customer is verified");
		return flag1;
	}
*/
	/*
	 * @RequestMapping(path = "/admin/{id}", method = RequestMethod.GET) public
	 * Movie fetch(@PathVariable("id") int id) { return movieService.fetch(id); }
	 */

}
