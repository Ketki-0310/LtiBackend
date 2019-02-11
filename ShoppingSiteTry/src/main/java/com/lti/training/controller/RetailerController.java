package com.lti.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.entity.Retailer;
import com.lti.training.entity.RetailerDto;
import com.lti.training.service.RetailerService;

@CrossOrigin
@RestController
public class RetailerController {

	@Autowired
	private RetailerService RetailerService;

	@RequestMapping(path = "/loginRetailer", method = RequestMethod.POST)
	public String login(@RequestBody RetailerDto retailerDto) {
		
		boolean flag=RetailerService.verify(retailerDto);
		String flagS=Boolean.toString(flag);
		return flagS;
	}
	
	@RequestMapping(path = "/addRetailer", method = RequestMethod.POST)
	public String add(@RequestBody Retailer retailer) {
		RetailerService.add(retailer);
		return "Movie recor";
	}
	@RequestMapping(path = "/allRetailer", method = RequestMethod.GET)
	public List<Retailer> fetchAll() {
		return RetailerService.fetchAll();
	}
	@RequestMapping(path = "/DeleteRetailer", method = RequestMethod.POST)
	public String delete(@RequestBody Retailer retailer) {
		RetailerService.delete(retailer);
		return "Deleted";
	}
	
	
}
