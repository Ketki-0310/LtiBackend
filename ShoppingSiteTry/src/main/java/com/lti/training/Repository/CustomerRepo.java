package com.lti.training.Repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.lti.training.entity.Customer;

@Repository
public class CustomerRepo {

	@PersistenceContext
	private EntityManager entityManager;

	public void add(Customer customer) {
		entityManager.persist(customer);
	}

	public Customer fetch(int id) {
		return entityManager.find(Customer.class, id);
	}

	public List<Customer> fetchAll() {
		Query q = entityManager.createQuery("select obj from Customer as obj");
		return q.getResultList();
	}
}
