package test.base;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.base.User;

public class QueryUsers {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		//JPQL is Java Persistence Query Language, the language that is passed to JPA and converted to SQL
		String jpql = "select u from User u";
		
		//By Query i can define many things to my query, a example is define the max of results from query
		List<User> users = em.createQuery(jpql, User.class).setMaxResults(5).getResultList();	
		
		for(User u: users) {
			System.out.println(u.getId() + " " + u.getName() + " " + u.getEmail());
		}
		
		emf.close();
		em.clear();
	}
}
