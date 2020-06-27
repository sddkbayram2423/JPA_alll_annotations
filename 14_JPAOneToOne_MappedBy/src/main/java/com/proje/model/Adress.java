package com.proje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adressID;
	
	private String street;
	
	private String road;
	
	private String district;
	
	private String city;
	
	@OneToOne(mappedBy="adress")
	private Customer customer;
	
	public Adress() {
	}

	public Adress(String street, String road, String district, String city) {
		super();
		this.street = street;
		this.road = road;
		this.district = district;
		this.city = city;
	}

	public int getAdressID() {
		return adressID;
	}

	public void setAdressID(int adressID) {
		this.adressID = adressID;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Adress [adressID=" + adressID + ", street=" + street + ", road=" + road + ", district=" + district
				+ ", city=" + city + "]";
	}
	

}
