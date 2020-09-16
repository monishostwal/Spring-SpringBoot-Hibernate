package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionOfControlJavaSourcecodeMethodApplication {

	public static void main(String[] args) {
//		SpringApplication.run(InversionOfControlJavaSourcecodeMethodApplication.class, args);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach c=context.getBean("cricketCoach",Coach.class);
	
		System.out.println(c.get_activity());
	}
	

}
