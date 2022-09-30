package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	@Id
	private Integer id;
	private String name;
	private Integer roll;
	private String course;
	private String Qualification;
	private Integer hallticketno;
	
	
	//default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrized constructor
	public Student(Integer id, String name, Integer roll, String course, String qualification, Integer hallticketno) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
		this.course = course;
		Qualification = qualification;
		this.hallticketno = hallticketno;
	}

	//setter and getter method
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public Integer getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(Integer hallticketno) {
		this.hallticketno = hallticketno;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + ", course=" + course + ", Qualification="
				+ Qualification + ", hallticketno=" + hallticketno + "]";
	}
	
	
	

}
