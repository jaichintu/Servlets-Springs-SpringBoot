package springmvc_basics.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


import springmvc_basics.dto.MvcDto;



@Component
public class MvcDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insert(MvcDto d2)
	{
		entityTransaction.begin();
		entityManager.persist(d2);
		entityTransaction.commit();
		
	}
	
	public String delete(int id) {
		System.out.println("dao  " + id);
		MvcDto e1 = entityManager.find(MvcDto.class, id);
		if (e1 != null) {
			entityTransaction.begin();
			entityManager.remove(e1);
			entityTransaction.commit();

			return "data deleted";
		} else {
			return "no data found";
		}
	}
	
	public List<MvcDto> fetchall() {
		Query q = entityManager.createQuery("select a from MvcDto a");
		List<MvcDto> list = q.getResultList();

		return list;

	}
	
	public MvcDto fetch(int id) {
		MvcDto e2 = entityManager.find(MvcDto.class, id);
		

			return e2;

		

	}
	public String deleteall() {
		Query q = entityManager.createQuery("select a from MvcDto a");
		List<MvcDto> j = q.getResultList();

		if(j.isEmpty()) {
			return "no data";
		}
		else {
			for(MvcDto y:j) {
				entityTransaction.begin();
				entityManager.remove(y);
				entityTransaction.commit();
			}
			return "data deleted";
		}

	}

}
