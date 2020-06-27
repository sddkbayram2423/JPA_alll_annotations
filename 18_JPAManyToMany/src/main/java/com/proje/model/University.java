package com.proje.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class University {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int univercityId;
	
	private String name;
	@ManyToMany(mappedBy="universities")
	private List<Student> students=new ArrayList<Student>();
	
	
	
	public University() {
	}



	public University(String name) {
		super();
		this.name = name;
	}



	public int getUnivercityId() {
		return univercityId;
	}



	public void setUnivercityId(int univercityId) {
		this.univercityId = univercityId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Student> getStudents() {
		return students;
	}



	public void setStudents(List<Student> students) {
		this.students = students;
	}



	@Override
	public String toString() {
		return "University [univercityId=" + univercityId + ", name=" + name + ", students=" + students + "]";
	}
	

}
