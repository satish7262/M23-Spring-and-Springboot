package com.cg.diadv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {
	public static void main(String[]args) {
		ApplicationContext c=new  ClassPathXmlApplicationContext("bean.xml");
		StudentNew s=c.getBean("s",StudentNew.class);
		s.cheating();
}
}
