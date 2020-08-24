package test.base;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import models.base.User;

public class InsertUser {
	public static void main(String[] args) {
		/*
		 * EntityManager is the Interface responsible by do the CRUD, connection with database, convert from Java to SQL, etc
		 * EntityManagerFactory is the factory responsible by to create the EntityManagers.
		 * I need to separate cause, if i want create a new connection with other database, i need of other EntityManager
		 */
		
		//The implementation this Interface comes from Persistence, for this method i need pass the name of persistence unit: name from project. After i can create a EntityManager for this unit
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Curso java 13 (JPA)");
		EntityManager em = emf.createEntityManager();
		User newUser = new User("Aline", "alineteixeira.at.at@gmail.com");
		
		//The persist() only will work if it's in transaction.
		
		/*
		 *Like i not set the "ID", i need set manually or not, the transaction will give exception cause i need set before of call the "save()"
		 *I need put a @GenerateValue passing with parameter a strategy(Identity, Auto, Sequence, Table)
		 *I'll use Identity cause i can create for only the table that the Class is mapping 
		 */
		
		//I need start the Transaction and after effect the Transaction
		em.getTransaction().begin();
		em.persist(newUser);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
