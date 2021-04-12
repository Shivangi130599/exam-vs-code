package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.User;

@Component
public class UserDao {
	
	@PersistenceContext
	
	private EntityManager entityManager;
	
	@Transactional
	public void save(User user) {
		entityManager.persist(user);
	}
}
