	package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Employee;

public class EmployeeDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void insert(Employee employee) {
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}

	public String delete(int id) {
		System.out.println("dao  " + id);
		Employee e1 = entityManager.find(Employee.class, id);
		if (e1 != null) {
			entityTransaction.begin();
			entityManager.remove(e1);
			entityTransaction.commit();

			return "data deleted";
		} else {
			return "no data found";
		}
	}

	public Employee fetch(int id) {
		Employee e2 = entityManager.find(Employee.class, id);
		

			return e2;

		

	}

	public List<Employee> fetchall() {
		Query q = entityManager.createQuery("select a from Employee a");
		List<Employee> j = q.getResultList();

		return j;

	}

	public String deleteall() {
		Query q = entityManager.createQuery("select a from Employee a");
		List<Employee> j = q.getResultList();

		for (Employee x : j) {
			int id = x.getId();
			Employee e1 = entityManager.find(Employee.class, id);

			entityTransaction.begin();
			entityManager.remove(e1);
			entityTransaction.commit();

		}
		return "data deleted";

	}
	
	public void update(Employee e1)
	{
		entityTransaction.begin();
		entityManager.merge(e1);
		entityTransaction.commit();
	}

}
