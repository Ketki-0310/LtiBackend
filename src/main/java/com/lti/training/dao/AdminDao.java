package com.lti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.Admin;

@Repository
public class AdminDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void add(Admin admin) {
		entityManager.persist(admin);
	}

	public Admin fetch(int id) {
		return entityManager.find(Admin.class, id);
	}

	public List<Admin> fetchAll() {
		Query q = entityManager.createQuery("select obj from Admin as obj");
		return q.getResultList();
	}
}
