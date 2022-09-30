package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class StudentService {
	@Autowired
	
	private StudentRepository repo;
	//TO RETRIEVE ALL THE DATA OF STUDENT CLASS
	public List<Student>ListAll()
	{
		return repo.findAll();
	}
	//INSERT OR CREATE OR UPDATE A DATA
	public void craete(Student s)
	{
		 repo.save(s);
	}
	//TO RETRIVE A SINGLE RECORD
	public Student retrieve(Integer id)
	{
		return repo.findById(id).get();
	}
	//TO DELETE A DATA
	public void delete(Integer id)
	{
		repo.deleteById(id);
	}

}
