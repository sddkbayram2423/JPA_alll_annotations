package com.proje.test;

import java.util.Calendar;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.Enum.PhoneType;
import com.proje.model.Personel;


public class Test {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		Personel personel=new Personel("B", "Baran", createDate(2015, 3, 1));
		personel.addPhoneNumber(PhoneType.CELL, "5452424");
	
		transaction.begin();
		entityManager.persist(personel);
		transaction.commit();
		System.out.println(entityManager.find(Personel.class, 2));
	
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
