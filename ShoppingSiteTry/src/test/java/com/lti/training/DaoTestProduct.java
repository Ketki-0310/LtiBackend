package com.lti.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.Repository.ProductRepo;
import com.lti.training.Repository.RetailerRepo;
import com.lti.training.entity.Product;
import com.lti.training.entity.Retailer;
import com.lti.training.entity.enums.Category;


@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(false)
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class DaoTestProduct {

		@Autowired
		private ProductRepo productRepo;
		@Autowired
		private RetailerRepo RRepo;
		
		@Test
		@Transactional
		public void addProduct() {
			Product p=new Product();
			p.setName("IPhone");
			p.setQuantity(15);
			p.setDescription("fdf.");
			p.setImagePath("yetreywtreywtryew");
			p.setPrice(70000);
			p.setCategory(Category.MOBILE);
			Retailer retailer = RRepo.fetch(277);
			
		
			p.setRetailer(retailer);
			
			productRepo.add(p);
		
		}
/*
		@Test
		@Transactional
		public void GetAllRetailer() {
			List<Retailer> all=productRepo.fetchAll();
			assertNotNull(all);
			System.out.println(all.size());
		
		}*/

	}

	

