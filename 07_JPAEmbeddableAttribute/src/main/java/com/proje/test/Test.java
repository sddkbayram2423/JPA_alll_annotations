package com.proje.test;

import java.util.Calendar;




import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Contact;
import com.proje.model.User;



public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Contact contact=new Contact("abc@gmail.com", "abc.com", "5464654654");
		User user=new User("ab", "2134564", contact, createDate(2019, 11, 2));
				
	
		entityTransaction.begin();
		entityManager.persist(user);
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
