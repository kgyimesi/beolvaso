package com.laszloz.apartment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory;
		EntityManager entityManager; 
		

		entityManagerFactory = Persistence.createEntityManagerFactory("beolvaso");
		entityManager = entityManagerFactory.createEntityManager();

//		entityManager.getTransaction().begin();
//
//		entityManager.persist new ServerNode(firstName: "Test", lastName: "Server");
//
//		entityManager.getTransaction().commit();
		
		
		System.out.println("start");
		System.out.println("start");
	}

}
