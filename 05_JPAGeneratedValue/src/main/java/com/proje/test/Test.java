package com.proje.test;



import java.util.Calendar;



import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.proje.model.Student;



public class Test {

	public static void main(String[] args) {
		studentTest();
		
		
	}

	public static Date createDate(int year,int month,int day) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		Date date=calendar.getTime();
		
		return date;
		
	}
	public static void studentTest() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Student student=new Student("N", "Atak", createDate(1991, 4, 3));
		Student student1=new Student("B", "Baran", createDate(1992, 3, 30));
		Student student2=new Student("O", "Baran", createDate(1991, 8, 30));
		
		entityTransaction.begin();
		
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityTransaction.commit();

		
		
	}
	
}
