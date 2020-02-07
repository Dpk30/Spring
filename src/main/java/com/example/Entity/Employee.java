package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Id
	int id;
	String Name;
	String Course;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public Employee(int id, String name, String course) {
		super();
		this.id = id;
		Name = name;
		Course = course;
	}
	
	
	
}
