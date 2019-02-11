package com.lti.training.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.training.dao.CustomerDao;
import com.lti.training.entity.Customer;


@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public void add(Customer customer) {
		customerDao.add(customer);
	}

	public Customer fetch(int id) {
		return customerDao.fetch(id);
	}
/*
	// to verify the customer credentials
	public boolean verify(Customer customer) {
		String email = customer.getEmail();
		String password = customer.getPassword();

		List<Customer> customerList = customerDao.fetchAll();

		for (Customer x : customerList) {
			if (email.equals(x.getEmail())) {
				if (password.equals(x.getPassword())) {
					boolean flag = true;
					return flag;
				}
			}
		}
		return false;
	}
*/
}
