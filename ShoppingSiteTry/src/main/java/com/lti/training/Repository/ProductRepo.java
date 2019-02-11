package com.lti.training.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.lti.training.entity.enums.Category;
import org.springframework.stereotype.Repository;

import com.lti.training.entity.Product;

@Repository
public class ProductRepo {
	@PersistenceContext
	private EntityManager entityManager;

	public void add(Product product) {
		entityManager.persist(product);

	}
	
	public List<Product> byCategory(Category category ){
		Query q = entityManager.createQuery("select obj from Product as obj where category=:cat");
		q.setParameter("cat", category);
		q.setMaxResults(5);
		return q.getResultList();
	}
	
	
	public void delete(Product product) {
		entityManager.remove(product);
}
	
	


	
}
