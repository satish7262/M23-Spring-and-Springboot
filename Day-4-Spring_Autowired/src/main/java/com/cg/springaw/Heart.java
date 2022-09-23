package com.cg.springaw;

public class Heart {
	private String nameofAnimal;
	
	private int noofHeart;
	public void pump()
	{
		System.out.println("your are heart is pumping and your alive");
	}
	 public String getNameofAnimal() {
		return nameofAnimal;
	}
	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}
	public int getNoofHeart() {
		return noofHeart;
	}
	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}

}
