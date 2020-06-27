package com.proje.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int useId;
	
	private String firstname;
	
	private String lastname;
	
	private String city;
	
	@OneToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="user_product",joinColumns=@JoinColumn(name="userID"),inverseJoinColumns=@JoinColumn(name="productID"))
	private List<Product> products=new ArrayList<Product>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstname, String lastname, String city) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.city = city;
	}
	public void addProduct(Product product) {
		this.products.add(product);
	}
	public void removeProduct(Product product) {
		this.products.remove(product);
	}

	public int getUseId() {
		return useId;
	}

	public void setUseId(int useId) {
		this.useId = useId;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "User [useId=" + useId + ", firstname=" + firstname + ", lastname=" + lastname + ", city=" + city
				+ ", products=" + products + "]";
	}
	
	

}
