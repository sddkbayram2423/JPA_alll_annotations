package com.proje.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="personel")
public class Personel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID",unique=true,nullable=false,length=10)
	private int personelID;
	
	@Column(name="firstname",updatable=true,length=25)
	private String firstname;
	
	private String lastname;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DogumTarihi")
	private Date birthDate;
	
	@Column(name="personelNumber",updatable=false,length=11)
	private String personelNumber;
	
	
	@Lob  //uzun veri acilmalari giri�i icin kullanilir
	private String about;
	
	
	@Transient //veri tabani tablosunda column olarak goz�kmez
	private double salary;
	
	public Personel() {
		// TODO Auto-generated constructor stub
	}


	public Personel(int personelID, String firstname, String lastname, Date birthDate, String personelNumber) {
		super();
		this.personelID = personelID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.personelNumber = personelNumber;
	}


	public int getPersonelID() {
		return personelID;
	}


	public void setPersonelID(int personelID) {
		this.personelID = personelID;
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


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getPersonelNumber() {
		return personelNumber;
	}


	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
	


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Personel [personelID=" + personelID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + ", personelNumber=" + personelNumber + "]";
	}
	
}
