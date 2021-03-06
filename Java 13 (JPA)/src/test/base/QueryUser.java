package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.base.User;

public class QueryUser {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		//In a query, i need not to do a Transaction. Transaction is only for sharing of data
		
		//In "find()" i need pass the type of Class that i want query, after i pass the ID			
		User user = em.find(User.class, 1L);
		System.out.println(user.getName());				
		
		em.clear();
		emf.close();
	}
}
