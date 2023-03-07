package br.com.gastomensal.JPA;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryUtil {
	
	private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SmartDB");
	
	 public EntityManager createEntityManager() {
		return entityManagerFactory.createEntityManager();
	 }

}
