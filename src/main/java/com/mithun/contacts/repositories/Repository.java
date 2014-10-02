package com.mithun.contacts.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.mithun.contacts.entities.Address;

public class Repository<E> {
	 
	private final EntityManager entityManager = Persistence.createEntityManagerFactory("training").createEntityManager();
	
	public E save(E entity){
		entityManager.getTransaction().begin();
		entity =entityManager.merge(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
	
	public void delete(E entity) {
		entityManager.getTransaction().begin();
		entityManager.remove(entity);
		entityManager.getTransaction().commit();
	}
	
	//Address.class cannot be converted to E.class
	//at run time the class is converted to object
	//bytecode does not have generic types
	//we need some kind of constructor or abstract class
	
	//the above problem can be handled as follows
	
	public final Class<E> entityClass;
	//using constructor we convert the generic type into a class
	public Repository(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
	}

	public E find(long id) {
		return entityManager.find(entityClass, id);
	}
	
	public List<E> findAll(){
		return entityManager.createQuery("from " + entityClass.getSimpleName(), entityClass).getResultList();
	}

}
