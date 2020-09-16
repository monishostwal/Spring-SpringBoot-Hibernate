package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionAnnotationConstructorMethodApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionAnnotationConstructorMethodApplication.class, args);
		Coach c=context.getBean("cricketCoach",Coach.class);
		System.out.println(c.get_activity());
		System.out.println(c.get_fortune());
		
		Coach d=context.getBean("cricketCoach",Coach.class);
		System.out.println(c==d);
	}

}
