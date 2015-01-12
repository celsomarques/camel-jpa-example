package com.crmsoft.cameljpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.crmsoft.cameljpa.domain.Person;

public class PersonDao {

	public void create(String name) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("camel");
        EntityManager entityManager = factory.createEntityManager();
        
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();

        Person person = new Person();
        person.name = name;
        
        entityManager.persist(person);
        tx.commit();

        entityManager.close();
        factory.close();
	}
}