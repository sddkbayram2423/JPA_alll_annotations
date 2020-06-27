package com.proje.jpaFactoryImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.jpaFactory.JPAFactory;

public class JPAFactoryImp implements JPAFactory{
	private EntityManager entityManager=null;

	@Override
	public EntityManager getEntityManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		this.entityManager=factory.createEntityManager();
		return this.entityManager;
	}

	@Override
	public EntityTransaction getEntityTransaction() {
		EntityTransaction entityTransaction=this.entityManager.getTransaction();
		return entityTransaction;
	}

}
