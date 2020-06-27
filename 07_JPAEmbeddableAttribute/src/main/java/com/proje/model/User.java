package com.proje.model;



import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="phoneNumber",column=@Column(name="telefonNo",length=11)),
		@AttributeOverride(name="link",column=@Column(name="baglanti")),
		@AttributeOverride(name="email",column=@Column(name="kullaniciEmail",unique=true,length=25,nullable=true))
	})
	private Contact contact;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, Contact contact, Date creationDate) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.creationDate = creationDate;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", contact=" + contact
				+ ", creationDate=" + creationDate + "]";
	}
	

}
