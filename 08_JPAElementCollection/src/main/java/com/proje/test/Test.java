package com.proje.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;





import java.util.Date;
import java.util.List;

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
		
		
		List<String> phoneNumbers=new ArrayList<String>();
		
		phoneNumbers.add("564654654");
		phoneNumbers.add("46546546");
		phoneNumbers.add("131546465");
		Personel personel=new Personel("A", "Kara", new Date(),phoneNumbers);

//		List<String> phoneNumbers2=Arrays.asList("1245367","4564687","13154665465");
		
		Personel personel1=new Personel("N", "Atak", createDate(2014, 4, 12),Arrays.asList("1245367","4564687","13154665465"));
		
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
