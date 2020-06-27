package com.proje.test;

import java.util.Calendar;


import java.util.Date;

import com.proje.model.Book;
import com.proje.repository.BookRepository;
import com.proje.repositoryImp.BookRepositoryImp;


public class Test {

	public static void main(String[] args) {
		
		BookRepository bookRepository=new BookRepositoryImp();
		
		System.out.println(bookRepository.find(4));

		
		
	}

	public static Date createDate(int year,int month,int day) {
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);

		Date date=calendar.getTime();
		
		return date;
		
	}
	public static void bookTest() {
		
BookRepository bookRepository=new BookRepositoryImp();
		
		Book book=new Book(1, "A", "a", 850, createDate(1925, 5, 23));
		Book book2=new Book(2, "B", "b", 300, createDate(1955, 4, 14));
		Book book3=new Book(3, "J", "j", 275, createDate(1925, 11, 12));
		Book book4=new Book(4, "O", "o", 341, createDate(1925, 9, 17));
		Book book5=new Book(5, "S", "s", 157, createDate(1925, 1, 12));
		
		
		bookRepository.save(book);
		bookRepository.save(book2);
		bookRepository.save(book3);
		bookRepository.save(book4);
		bookRepository.save(book5);
		

		Book book6=new Book(3, "U", "u", 423, createDate(2007, 3, 12));
		
		
		bookRepository.update(book6);
		
		System.out.println(bookRepository.find(4));
		
	}
	
}
