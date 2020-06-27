package com.proje.model;

import java.util.ArrayList;
import java.util.Date;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.proje.Enum.PhoneType;
@Entity
public class Personel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int personelID;
	
	private String firstname;

	private String lastname;
	
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name="personel_emails" ,joinColumns=@JoinColumn(name="personelID"))
	@Column(name="emails")
	private List<String> emails=new ArrayList<String>();
	
	@ElementCollection(fetch=FetchType.LAZY)
	@CollectionTable(name="personel_phoneNumbers",joinColumns=@JoinColumn(name="personelID"))
	@MapKeyColumn(name="phoneType")
	@MapKeyEnumerated(EnumType.ORDINAL)
	@Column(name="TELEFONLAR")
	private Map<PhoneType, String> phoneNumbers=new HashMap<PhoneType, String>();
	
	
	public void addEmail(String email) {
		this.emails.add(email);
	}
	public void removeEmail(String email) {
		this.emails. remove(email);
	}
	
	public void addPhoneNumber(PhoneType phoneType,String number) {
		this.phoneNumbers.put(phoneType, number);
	}
	public void removePhoneNumber(PhoneType phoneType,String number) {
		this.phoneNumbers.remove(phoneType, number);
	}
	
	
	public Personel() {
		// TODO Auto-generated constructor stub
	}


	public Personel(String firstname, String lastname, Date birthDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
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


	
	public Map<PhoneType, String> getPhoneNumbers() {
		return phoneNumbers;
	}


	public void setPhoneNumbers(Map<PhoneType, String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	@Override
	public String toString() {
		return "Personel [personelID=" + personelID + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + "\n\t emails=" + emails + "\n\t phoneNumbers=" + phoneNumbers + "]";
	}


	
	
	
}
