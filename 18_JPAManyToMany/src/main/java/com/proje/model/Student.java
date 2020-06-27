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
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentID;
	
	private String fistname;
	
	private String lastname;
	
	private String city;
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(name="student_university", joinColumns=@JoinColumn(name="studendID"),inverseJoinColumns=@JoinColumn(name="univercityId"))
	private List<University> universities=new ArrayList<University>();
	
	public Student() {
	}

	public Student(String fistname, String lastname, String city) {
		super();
		this.fistname = fistname;
		this.lastname = lastname;
		this.city = city;
	}
	public void addUniversity(University university) {
		this.universities.add(university);		
	}
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
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

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fistname=" + fistname + ", lastname=" + lastname + ", city="
				+ city + ", universities=" + universities + "]";
	}
	

}
