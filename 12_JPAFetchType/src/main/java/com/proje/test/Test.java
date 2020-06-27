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
		
		testPersonel();
	
	}

	public static Date createDate(int year,int month,int day) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		Date date=calendar.getTime();
		
		return date;
		
	}
	public static void testPersonel() {
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		
		Personel personel=new Personel("B", "Baran", createDate(2015, 3, 1));
		personel.addPhoneNumber(PhoneType.CELL, "5452424");
		personel.addPhoneNumber(PhoneType.HOME, "4654646");
		personel.addPhoneNumber(PhoneType.WORK, "2131321");
		personel.addEmail("bbaran@email.com");
		personel.addEmail("bba123@hotmail.com");
		
		Personel personel1=new Personel("N", "Atak", createDate(2011, 3, 21));
		personel1.addPhoneNumber(PhoneType.CELL, "111111");
		personel1.addPhoneNumber(PhoneType.HOME, "222222");
		personel1.addPhoneNumber(PhoneType.WORK, "31111111");
		personel1.addEmail("natak@email.com");
	
		
		
		transaction.begin();
		entityManager.persist(personel);
		entityManager.persist(personel1);
		transaction.commit();
//		System.out.println(entityManager.find(Personel.class, 2));
		
	}
	
}
