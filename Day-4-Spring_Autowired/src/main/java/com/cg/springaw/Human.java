package com.cg.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	//dependency in terms of object
	private Heart heart;
	//Achieving di usinig setter
	@Autowired
	@Qualifier("animalheart")
	
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	//default constructor
	public Human() {
		this.heart=heart;
		
	}

	//Achieng using constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	
	public void pumping()
	{
		heart.pump();
		System.out.println("Name of the Animal is:"+heart.getNameofAnimal()+" "+"No.of heart is:"+heart.getNameofAnimal());
		
	}
	

}
