package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
	private EntityManager em;
	private Class<E> c;
	
	public DAO() {
		em = emf.createEntityManager();
	}
	
	public DAO(Class<E> c) {
		em = emf.createEntityManager();
		this.c = c;
	}
	
	public  DAO<E> beginTransaction() {
		em.getTransaction().begin();
		
		return this;
	}
	
	public DAO<E> insert(E entity){
		em.persist(entity) ;
		return this;
	}
	
	public List<E> query(int limit, int offSet){
		if(c == null) {
			throw new UnsupportedOperationException("The Class is null");
		}
		
		String jpql = "select e from " + c.getName() + " e";
		TypedQuery<E> tq = em.createQuery(jpql, c);
		tq.setMaxResults(limit);
		tq.setFirstResult(offSet);
		
		return tq.getResultList();
	}
	
	public List<E> query(){
		return query(10, 0);
	}
	
	public DAO<E> commitTransaction() {
		em.getTransaction().commit();
		
		return this;
	}
	

	public void closeDAO() {
		em.close();
	}
}
