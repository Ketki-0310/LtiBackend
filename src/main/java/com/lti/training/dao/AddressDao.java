package com.lti.training.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import com.lti.training.entity.Address;


@Repository
public class AddressDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void add(Address address) {
		entityManager.persist(address);
	}

	public Address fetch(int id) {
		return entityManager.find(Address.class, id);
	}

	/*public List<Customer> fetchAll() {
		Query q = entityManager.createQuery("select obj from Customer as obj");
		return q.getResultList();
	}*/
}
