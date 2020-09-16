package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConfigurationsWithAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringConfigurationsWithAnnotationsApplication.class, args);
		Coach c=context.getBean("cricket_coach",Coach.class);
		System.out.println(c.getWorkout());
		
		Coach a=context.getBean("footballCoach",Coach.class);
		System.out.println(a.getWorkout());
			
		}

}
