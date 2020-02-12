package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name="ID")
	int id;
	@Column(name="NAME")
	String Name;
	@Column(name="COURSE")
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
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		Name = name;
		Course = course;
	}
	
	
	
}
