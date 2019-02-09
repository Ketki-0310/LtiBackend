package com.lti.training;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import com.lti.training.dao.AdminDao;
import com.lti.training.entity.Admin;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace = Replace.NONE)

public class AdminTest {

	@Autowired
	private AdminDao adminDao;

	@Transactional
	@Test
	public void addAdmin() {
		// System.out.println("test case started");

		Admin admin = new Admin();
		admin.setEmail("Titanic");
		admin.setPassword("1995");
		adminDao.add(admin);
	}

	@Test
	public void verifyAdmin() {
		// System.out.println("test case started");
		boolean flag=false;
		Admin admin = new Admin();
		String email = "melissa";
		String password = "1996melissa";

		List<Admin> adminList = adminDao.fetchAll();

		for (Admin x : adminList) {
			if (email.equals(x.getEmail())) {
				// System.out.println("if1");
				if (password.equals(x.getPassword())) {
					// System.out.println("if2");
					 flag = true;
				}
			} 

		}
		String flag1=Boolean.toString(flag);
		if(flag1.equals("true"))
			System.out.println("user is verified");
		else
			System.out.println("user is not verified" );

	}

}
