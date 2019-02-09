package com.lti.training.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lti.training.dao.AdminDao;
import com.lti.training.entity.Admin;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;

	@Transactional
	public void add(Admin admin) {
		adminDao.add(admin);
	}

	public Admin fetch(int id) {
		return adminDao.fetch(id);
	}

	// to verify the admin credentials
	public boolean verify(Admin admin) {
		String email = admin.getEmail();
		String password = admin.getPassword();

		List<Admin> adminList = adminDao.fetchAll();

		for (Admin x : adminList) {
			if (email.equals(x.getEmail())) {
				//System.out.println("if1");
				if (password.equals(x.getPassword())) {
					//System.out.println("if2");
					boolean flag = true;
					return flag;
				}
			}
		}
		return false;
	}

}
