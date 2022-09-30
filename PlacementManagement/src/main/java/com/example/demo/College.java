package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class College 
{
	@Id
	private Integer id;
	private String name;
	private String location;
	
	//Default Constructor
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parametrized Constructor
	public College(Integer id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	//getters and setters
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}

