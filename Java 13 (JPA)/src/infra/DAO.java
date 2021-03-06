package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {
	//The EMF will be static because i want only one factory to all instances; so i don't close the factory
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
	private EntityManager em;
	private Class<E> c;

	//I have two constructors because i need do operations with type of class and without type
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
	
	public DAO<E> insertAuto(E entity){
		beginTransaction().insert(entity).commitTransaction();
		return this;
	}

	public DAO<E> commitTransaction() {
		em.getTransaction().commit();
		
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
	
	//I need a method that will receive the named query String and a va_arg of Object (Object array)
	public List<E> namedQuery(String nameQuery, Object... parameters){
		TypedQuery<E> query = em.createNamedQuery(nameQuery, c);
		
		//The arguments that i'll pass are key-value type
		for(int i = 0; i < parameters.length; i += 2) {
			query.setParameter(parameters[i].toString(), parameters[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public List<E> query(){
		return query(10, 0);
	}
	
	public E getById(Long id){
		return em.find(c, id);
	}

	public void closeDAO() {
		em.close();
	}
}
