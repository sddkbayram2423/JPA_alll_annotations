package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contact {
	
	private String email;
	
	private String link;
	
	private String phoneNumber;
	
	public Contact() {
	}

	public Contact(String email, String link, String phoneNumber) {
		super();
		this.email = email;
		this.link = link;
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [email=" + email + ", link=" + link + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
