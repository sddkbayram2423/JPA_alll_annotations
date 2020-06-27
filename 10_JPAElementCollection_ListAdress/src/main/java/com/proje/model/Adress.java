package com.proje.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	
	private String city;
	private String district;
	private String street;
	private String road;
	public Adress() {
	}
	public Adress(String city, String district, String street, String road) {
		super();
		this.city = city;
		this.district = district;
		this.street = street;
		this.road = road;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
	@Override
	public String toString() {
		return "Adress [city=" + city + ", district=" + district + ", street=" + street + ", road=" + road + "]";
	}
	

}
