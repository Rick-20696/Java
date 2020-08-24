package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import models.base.User;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		
		//All operation that need to generate impact on database, it must be in a transactional context 
		
		em.getTransaction().begin();
		
		User user = em.find(User.class, 3L);
		
		em.remove(user);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
