package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.base.User;

public class UpdateUser2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * When i do a query in a transactional context to a Object, this object will be in a synchronized state.
		 * Synchronized state is when the JPA identifies any change in that object's data.
		 * In that state, the JPA will do the update same that you don't call the merge()
		 */
		em.getTransaction().begin();
		
		User u = em.find(User.class, 1L);
		System.out.println(u.getName());
		
		u.setName("Ricardo Barbosa");
				
		//em.merge(u);
		em.getTransaction().commit();
		
		System.out.println(u.getName());
		
		em.close();
		emf.close();
	}
}
