package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CollegeService {
	
	//it will create object using Autowired concepts
			@Autowired
			private CollegeRepository repo;
			
			//to retrieve all the data of college class
			public List<College> listAll()
			{
				return repo.findAll();
			}

			//insert/ create data
			public void create(College c)
			{
				repo.save(c);
			}
			
			//to retrieve a single record
			public College retrieve(Integer id)
			{
				return repo.findById(id).get();
			}
			
			//to delete data
			public void delete (Integer id)
			{
				repo.deleteById(id);
			}

}


