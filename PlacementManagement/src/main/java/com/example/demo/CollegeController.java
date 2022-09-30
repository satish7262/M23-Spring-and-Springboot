package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController 
{
	@Autowired

	private CollegeService service;
	
	//creation
	@PostMapping("/college")
	public void add(@RequestBody College c)
	{
		service.create(c);
	}
	
	//deletion
	@DeleteMapping("/placement/{id}")
	public void remove(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
	//retrieve with all the records
	@GetMapping("/college")
	public List<College>List()
	{
		return service.listAll();
		
	}
	//Retrive with specific id
	@GetMapping("/college/{id}")
	public ResponseEntity<College>get(@PathVariable Integer id)
	{
		try {
			College c=service.retrieve(id);
			return new ResponseEntity<College>(c,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	
	//updation
	@PutMapping("/college/{id}")
	public ResponseEntity<College>update(@RequestBody Placement p, @PathVariable Integer id)
	{
		try {
			@SuppressWarnings("unused")
			College c1=service.retrieve(id);
			service.create(c1);
			return new ResponseEntity<College>(c1,HttpStatus.OK);
		}
		catch(NoSuchElementException e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	

}