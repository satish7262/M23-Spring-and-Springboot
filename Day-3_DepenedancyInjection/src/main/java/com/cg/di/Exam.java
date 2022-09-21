package com.cg.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.diadv.StudentNew;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Student s=new Student();
		s.setStudentName("Satish Surnar");
		s.display();*/
		ApplicationContext c=new  ClassPathXmlApplicationContext("bean.xml");
        Student s=c.getBean("s",Student.class);
        s.display();
	}

}


