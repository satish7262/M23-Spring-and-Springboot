package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class Day5SpringStarterProjectApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext c=SpringApplication.run(Day5SpringStarterProjectApplication.class, args);
		Student s=c.getBean(Student.class);
		
		s.display();
	}

}
