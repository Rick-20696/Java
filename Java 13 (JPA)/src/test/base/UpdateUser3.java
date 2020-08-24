package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.base.User;

public class UpdateUser3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * An Object only is in a synchronized state when you to do a query in a transactional context.
		 * A new Object is not in this state. this is dangerous cause not have a security that it will only be changed when i call the merge()
		 * 
		 * To take this sync you can call the method detach(Object) passing the Object that not will more be synchronized.
		 */
		em.getTransaction().begin();
		
		User u = em.find(User.class, 1L);
		em.detach(u);
		System.out.println(u.getName());
		
		u.setName("Ricardo Barbosa de Sousa");
				
		em.merge(u);
		em.getTransaction().commit();
		
		System.out.println(u.getName());
		
		em.close();
		emf.close();
	}
}
