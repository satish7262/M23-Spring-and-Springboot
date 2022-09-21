package com.cg.di;
//1,dependancy in terms of litterl
public class Student {
	private String StudentName;
	private int rollno;
	//DI using Studentname;
	
	//public Student(String StudentName,int rollno) {
		//super();
		//this.rollno = rollno;
	//getter an d setter
	//public String getStudentName() {
		//return StudentName;
			
		//}
	//DI using constructor

		public Student() {
			super();
			StudentName = studentName;
			this.rollno = rollno;
		}

	
	/*// DI using seters method
	public void setStudentName(String StudentName) {
		StudentName = getStudentName();
		
	}

	public int getRollno() {
		return rollno;
	}*/
	/*public void setRollno() {
		this.rollno=rollno;
	}*/

	public void display() {
	System.out.println("StudentName is :"+StudentName+" "+"and Roll No is :"+roll no);

	}


	public void cheating() {
		// TODO Auto-generated method stub
		
	}
		
	}
	


