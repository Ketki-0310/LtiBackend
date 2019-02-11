package com.lti.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.Repository.RetailerRepo;
import com.lti.training.entity.Retailer;
import com.lti.training.entity.RetailerDto;


@Service("mS")
public class RetailerService {
	
	@Autowired
	private RetailerRepo retailerRepo;
	
	@Transactional
	public void add(Retailer retailer) {
		retailerRepo.add(retailer);

	}
	public boolean verify(RetailerDto retailerDto) {
		List<Retailer> list =fetchAll();
		System.out.println(list.size());
		boolean flag=false;
		for(Retailer re:list) {
			if(retailerDto.getEmail().equals(re.getEmail()))
				if(retailerDto.getPassword().equals(re.getPassword()))
					System.out.println("true");
					flag=true;
		}
		return flag;
		
	}
	
	public Retailer fetch(int id) {
		return retailerRepo.fetch(id);
	}
	
	public List<Retailer> fetchAll() {
		return retailerRepo.fetchAll();
	}
	
	public void delete(Retailer r) {
		retailerRepo.delete(r);
}
	
	
}
