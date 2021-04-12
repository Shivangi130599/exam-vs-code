package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.lti.entity.User;

public class SearchDao extends GenericDao{
	public List<User> fetchresults(int id , String state , String city , float score){
		EntityManagerFactory emf = null;
		EntityManager em = null;
		try {
			emf = Persistence.createEntityManagerFactory("oracleTest");
			em = emf.createEntityManager();
			String jpql="Select u.firstName,u.email,u.phoneNo,a.state,a.city "
					+ "from User u inner join u.address a "
					+ "inner join u.results r "
					+ "inner join r.subject s"
					+ " where r.subject.id= :id "
					+ "and a.state =:state"
					+ " and a.city =:city"
					+ " and r.score =:score";
			Query q = em.createQuery(jpql);
			q.setParameter("id",id);
			q.setParameter("state",state);
			q.setParameter("city",city);
			q.setParameter("score",score);
			List<User> list = q.getResultList();
			return list;
		}
		finally {
			em.close();
			emf.close();
		}	
		}
}
