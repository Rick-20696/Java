package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.base.User;

public class UpdateUser1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * Like i want take a User that and change the name i need find in database.
		 * After i'll using the "merge" that is responsible by take a instance and change any data.
		 */
		em.getTransaction().begin();
		
		User u = em.find(User.class, 1L);
		System.out.println(u.getName());
		
		u.setName("Ricardo Barbosa de Sousa");
				
		em.merge(u);
		em.getTransaction().commit();
		
		System.out.println(u.getName());
		
		em.close();
		emf.close();
	}
}
