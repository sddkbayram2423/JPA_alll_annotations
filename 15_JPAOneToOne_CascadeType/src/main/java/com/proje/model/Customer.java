package com.proje.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerID;
	
	private String firstname;
	
	private String lastname;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	

//	@OneToOne(cascade=CascadeType.PERSIST)
//	@OneToOne(cascade=CascadeType.REMOVE)
	@OneToOne(cascade= {CascadeType.REMOVE,CascadeType.REMOVE})
	@JoinColumn(name="adressID")
	private Adress adress;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstname, String lastname, Date birthDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
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

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + "]";
	}

	

}
