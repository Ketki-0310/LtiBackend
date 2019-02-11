package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.training.entity.Admin;
import com.lti.training.service.AdminService;

@RestController
@CrossOrigin
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(path = "/admin/add", method = RequestMethod.POST)
	public String add(@RequestBody Admin admin) {
		adminService.add(admin);
		return "Admin created successfully";
	}

	@RequestMapping(path = "/admin/verify", method = RequestMethod.POST)
	public String verify(@RequestBody Admin admin) {
	
	boolean flag=adminService.verify(admin);
	
	//checking the boolean received from the verify method 
	String flag1=Boolean.toString(flag);
	System.out.println("user is verified");
	return flag1;
	}

	/*@RequestMapping(path = "/admin/{id}", method = RequestMethod.GET)
	public Movie fetch(@PathVariable("id") int id) {
		return movieService.fetch(id);
	}*/

}
