package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.User;
import com.lti.entity.UserAnswer;

public class UserAnswerDao {
	public List<UserAnswer> fetchanswers(int id) {
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql="Select ua.answerGiven,qb.question from UserAnswer ua inner join ua.questionBank qb where ua.user.id=: id";
			Query q = em.createQuery(jpql);
			q.setParameter("id",id);
			List<UserAnswer> list = q.getResultList();
			return list;
		}
			finally {
			em.close();
			emf.close();
		}	
		
	}

}
