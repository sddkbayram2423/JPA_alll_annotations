package com.proje.test;

import java.util.Calendar;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Product;
import com.proje.model.User;



public class Test {

	public static void main(String[] args) {
		addTest();
		
		
	}

	public static Date createDate(int year,int month,int day) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		Date date=calendar.getTime();
		
		return date;
		
	} 
	public static void addTest() {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		Product product=new Product("Ipone 7", 3500, createDate(2018, 8, 8));
		Product product1=new Product("Lenova", 3840, createDate(2019, 6, 4));
		
		User user=new User("S", "Atak", "Ankara");
		user.addProduct(product1);
		user.addProduct(product);
		
		transaction.begin();
		entityManager.persist(user);
		transaction.commit();
		
		}
	
	
	
	
}
