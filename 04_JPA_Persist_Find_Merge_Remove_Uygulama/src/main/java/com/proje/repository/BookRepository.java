package com.proje.repository;

import com.proje.jpaFactory.JPAFactory;
import com.proje.jpaFactoryImp.JPAFactoryImp;
import com.proje.model.Book;

public interface BookRepository {
	
	final static JPAFactory jpaFactory = new JPAFactoryImp();

	void save(Book book);

	void delete(Book book);

	Book find(int bookID);

	Book update(Book book);
	
	

}
