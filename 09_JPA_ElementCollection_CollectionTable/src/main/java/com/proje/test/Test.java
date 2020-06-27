package com.proje.test;

import java.util.Calendar;


import java.util.Date;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Personel;


public class Test {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		
	
		
		Personel personel=new Personel("A", "Kara", new Date());
		Personel personel1=new Personel("N", "Atak", createDate(2014, 4, 12));
		
		personel.addPhoneNumber("12313545");
		personel.addPhoneNumber("45646546");
		personel.addPhoneNumber("7897654654");
		personel1.addPhoneNumber("45643132");
		personel1.addPhoneNumber("48464546");
		personel1.removePhoneNumber("45643132");
		personel1.removePhoneNumber("48464546");
		
		
		transaction.begin();
		entityManager.persist(personel);
		entityManager.persist(personel1);
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
