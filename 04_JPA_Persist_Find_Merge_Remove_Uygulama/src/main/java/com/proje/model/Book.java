package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Book {
	
	@Id
	private int bookID;
	
	private String name;
	
	private String topic;
	
	private int pageCount;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	public Book() {
	}

	public Book(int bookID, String name, String topic, int pageCount, Date addDate) {
		super();
		this.bookID = bookID;
		this.name = name;
		this.topic = topic;
		this.pageCount = pageCount;
		this.addDate = addDate;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", name=" + name + ", topic=" + topic + ", pageCount=" + pageCount
				+ ", addDate=" + addDate + "]";
	}
	

}
