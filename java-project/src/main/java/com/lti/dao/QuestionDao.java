package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.entity.QuestionBank;

public class QuestionDao extends GenericDao{

	public List<QuestionBank> fetchQuestions(int id){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql = "select q.question,q.option1, q.option2, q.option3, q.option4, q.marks "
					+ "from QuestionBank q inner join q.subjects s where s.id = :id ";
			Query q = em.createQuery(jpql);
			q.setParameter("id",id);
			System.out.println(q.getResultList().size());
			List<QuestionBank> list = q.getResultList();
			
			return list;
		}
		finally {
			em.close();
			emf.close();
		}	
}
}