package com.proje.test;

import java.util.Calendar;



import java.util.Date;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Adress;
import com.proje.model.User;



public class Test {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		Adress adress=new Adress("Konya", "Selcuklu", "Pervane", "Mesai"); 
		Adress adress1=new Adress("Istanbul", "Fatih", "Cýkmaz", "Millet"); 
		
		User user=new User("sbayram", "123145", createDate(2019, 2, 3));
		
		user.addAdress(adress1);
		user.addAdress(adress);
		
		transaction.begin();
		entityManager.persist(user);
		transaction.commit();
		
	
	
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
