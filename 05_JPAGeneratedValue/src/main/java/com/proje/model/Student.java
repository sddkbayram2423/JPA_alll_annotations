package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Student {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy=GenerationType.TABLE)
//	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentID;
	
	private String firstname;
	
	private String lastname;
	
	@Temporal(TemporalType.DATE)
	private Date bithDate;
	
	public Student() {
	}

	public Student(String firstname, String lastname, Date bithDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bithDate = bithDate;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstname=" + firstname + ", lastname=" + lastname + ", bithDate="
				+ bithDate + "]";
	}
	
	
}
