package com.proje.test;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Product;

public class Test {

	public static void main(String[] args) {
		
		
	}
	public static void removeTest() {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager=factory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Product product=entityManager.find(Product.class, 1);
		
		if(product!=null) {
			
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
		}
		else {
			System.out.println("Urun zaten mevcut degil");
		}
	
	}
	
	
	public static void persistTest() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager=factory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Product product=new Product(1, "Ford Fiesta", 55020, 1, createDate(2017,11,24) , new Date());
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();


	}

	public static void findTest(int productID) {

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager=factory.createEntityManager();
		
		Product product=entityManager.find(Product.class, productID);
		
		if(product!=null) {
			System.out.println(product);
		}
		else {
			System.out.println("Urun mevcut degil");
		}
		
		
		
	}

	public static void mergeTest() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager=factory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Product product=entityManager.find(Product.class, 1);
		
		if(product!=null) {
			product.setUnitPrice(6000);
			product.setAddDate(createDate(2011, 10, 14));
		}
		else {
			System.out.println("Urun mevcut degil");
		}
		
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
		
		
	}
	
	public static Date createDate(int year,int month,int day) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		Date date=calendar.getTime();
		
		return date;
		
	}
	
}
