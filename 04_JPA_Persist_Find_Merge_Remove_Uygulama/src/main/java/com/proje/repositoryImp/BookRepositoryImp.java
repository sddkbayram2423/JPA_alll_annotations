package com.proje.repositoryImp;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.proje.model.Book;
import com.proje.repository.BookRepository;

public class BookRepositoryImp implements BookRepository {
	
	private EntityManager entityManager=jpaFactory.getEntityManager();
	private EntityTransaction transaction=jpaFactory.getEntityTransaction();
	
	@Override
	public void save(Book book) {
	
	this.transaction.begin();
	this.entityManager.persist(book);
	this.transaction.commit();
		
	}

	@Override
	public void delete(Book book) {
		this.transaction.begin();
		this.entityManager.remove(book);
		this.transaction.commit();
	}

	@Override
	public Book find(int bookID) {
		
		Book book=this.entityManager.find(Book.class, bookID);
		
		if(book!=null) {
			return book;
		}else {
			System.out.println("Kitap bulunmadi");
			return null;
		}
	
		
	}

	@Override
	public Book update(Book book) {

		this.transaction.begin();

		Book book1 = this.entityManager.merge(book);

		this.transaction.commit();

		return book1;

	}

}
