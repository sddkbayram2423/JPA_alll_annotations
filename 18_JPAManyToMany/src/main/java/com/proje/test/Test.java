package com.proje.test;

import java.util.Calendar;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Student;
import com.proje.model.University;





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
		University university=new University("Hava Harp Okulu");
		University university2=new University("Yýldýz Teknik");
		Student student=new Student("Ali", "Kara", "Konya");
		student.addUniversity(university2);
		student.addUniversity(university);
		
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
	}
	
	
}
