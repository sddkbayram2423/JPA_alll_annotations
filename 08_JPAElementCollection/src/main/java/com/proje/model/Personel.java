package com.proje.model;

import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Personel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personelID;
	
	private String firstname;

	private String lastname;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@ElementCollection
	private List<String> phoneNumbers;
	
	public Personel() {
	}

	
	
	public Personel(String firstname, String lastname, Date birthDate, List<String> phoneNumbers) {
	
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.phoneNumbers = phoneNumbers;
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

	@Override
	public String toString() {
		return "Personel [personelID=" + personelID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + "]";
	}
	
	
}
