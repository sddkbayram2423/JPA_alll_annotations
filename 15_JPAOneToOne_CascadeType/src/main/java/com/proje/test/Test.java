package com.proje.test;

import java.util.Calendar;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Adress;
import com.proje.model.Customer;

public class Test {

	public static void main(String[] args) {

			removeCustomerTest(1);
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
		
		Adress adress=new Adress("pervane", "mesai cad.", "selçuklu", "konya");
		Customer customer=new Customer("S", "Bayram", createDate(1992, 8, 15));
		customer.setAdress(adress);

		
		Adress adress1=new Adress("C", "millet cad.", "fatih", "istanbul");
		Customer customer1=new Customer("B", "Baran", createDate(1992, 3, 30));
		customer1.setAdress(adress1);
		
		transaction.begin();
		entityManager.persist(customer);
		entityManager.persist(customer1);
		transaction.commit();
		
		
	}
	public static void findTest() {
		
		
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();

		
		transaction.begin();
		System.out.println(entityManager.find(Adress.class, 1));
		System.out.println(entityManager.find(Adress.class, 1).getCustomer());
		transaction.commit();
		
		
	}
	public static void removeCustomerTest(int id) {
		EntityManagerFactory managerFactory=Persistence.createEntityManagerFactory("persistence-unit");
		EntityManager entityManager=managerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();

		Customer customer=entityManager.find(Customer.class, id);
		transaction.begin();
		entityManager.remove(customer);
		transaction.commit();
		
	}
	
	
}
