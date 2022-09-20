package com.cg.springioc;
import org.springframework.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
public class Mobile {


	public static void main (String[] args)
	{
		/*Sim s=new Airtel();
		s.calling();
		s.data();
		Sim s1=new Jio();
		s1.calling();
		s1.data();*/
		ApplicationContext a=new ClassPathXmlApplicationContext("bean.xml");
        System.out.println("Application run succesfully");
        Airtel obj=(Airtel)a.getBean("airtel");
        obj.calling();
        obj.data();
        Jio obj1=(Jio)a.getBean("jio");
        obj1.calling();
        obj1.data();
        
        
	}

}
