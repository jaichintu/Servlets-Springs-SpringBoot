package mock.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import mock.dto.Employer;


@Component
public class Employerdao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	
	public void insert(Employer d1)
	{
		
		et.begin();
		em.persist(d1);
		et.commit();
		
	}

}
