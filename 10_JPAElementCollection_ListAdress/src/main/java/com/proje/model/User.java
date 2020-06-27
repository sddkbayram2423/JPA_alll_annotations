package com.proje.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;
	
	private String username;
	
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	

	@ElementCollection
	@CollectionTable(name="user_adresses", joinColumns=@JoinColumn(name="userID"))
	@AttributeOverrides({
		@AttributeOverride(name="street", column=@Column(name="sokak",length=20,nullable=false)),
		@AttributeOverride(name="district", column=@Column(name="ilce",length=20,nullable=false)),
		@AttributeOverride(name="city", column=@Column(name="sehir",length=20,nullable=false)),
		@AttributeOverride(name="road", column=@Column(name="cadde",length=20,nullable=false))
	})
	private List<Adress> adresses=new ArrayList<Adress>();
	
	public User() {
	}

	public User(String username, String password, Date creationDate) {
		super();
		this.username = username;
		this.password = password;
		this.creationDate = creationDate;
	}
	public void addAdress(Adress adress) {
		this.adresses.add(adress);
	}
	public void removeAdress(Adress adress) {
		this.adresses.remove(adress);
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

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Adress> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adress> adresses) {
		this.adresses = adresses;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", password=" + password + ", creationDate="
				+ creationDate + ", adresses=" + adresses + "]";
	}
	
}
