package com.proje.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product {
	
	@Id
	private int productID;
	
	private	String name;
	
	private double unitPrice;
	
	private int avaible;
	
	@Temporal(TemporalType.DATE)
	private Date addDate;
	
	@Temporal(TemporalType.DATE)
	private Date updateDate;
	
	public Product() {
	}

	public Product(int productID, String name, double unitPrice, int avaible, Date addDate, Date updateDate) {
		super();
		this.productID = productID;
		this.name = name;
		this.unitPrice = unitPrice;
		this.avaible = avaible;
		this.addDate = addDate;
		this.updateDate = updateDate;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getAvaible() {
		return avaible;
	}

	public void setAvaible(int avaible) {
		this.avaible = avaible;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Product [productID=" + productID + ", name=" + name + ", unitPrice=" + unitPrice + ", avaible="
				+ avaible + ", addDate=" + addDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
