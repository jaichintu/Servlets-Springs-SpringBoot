package servlets_basics.dao;




import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import servlets_basics.dto.Employee;

public class EmployeeDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	public void insert(Employee employee)
	{
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
	}


}
