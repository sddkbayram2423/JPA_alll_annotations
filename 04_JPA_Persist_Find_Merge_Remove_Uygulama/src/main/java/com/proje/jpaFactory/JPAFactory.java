package com.proje.jpaFactory;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;


public interface JPAFactory {
	
	
	public EntityManager getEntityManager();
	public EntityTransaction getEntityTransaction();
}
