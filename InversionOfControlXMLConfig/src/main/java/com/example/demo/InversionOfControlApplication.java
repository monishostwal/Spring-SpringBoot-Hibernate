package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InversionOfControlApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
		Coach coach=context.getBean("mycoach",Coach.class);
		System.out.println(coach.getWorkout());
		
	}

}
