package com.lti.training.service;

import java.util.List;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.Repository.AdminRepo;

import com.lti.training.entity.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;

	@Transactional
	public void add(Admin admin) {
		adminRepo.add(admin);
	}

	public Admin fetch(int id) {
		return adminRepo.fetch(id);
	}

	// to verify the admin credentials
	public boolean verify(Admin admin) {
		String email = admin.getEmail();
		String password = admin.getPassword();

		List<Admin> adminList = adminRepo.fetchAll();

		for (Admin x : adminList) {
			if (email.equals(x.getEmail())) {
				if (password.equals(x.getPassword())) {
					boolean flag = true;
					return flag;
				}
			}
		}
		return false;
	}

}
