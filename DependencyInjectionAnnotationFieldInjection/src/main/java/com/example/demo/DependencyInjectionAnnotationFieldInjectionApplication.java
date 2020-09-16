package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionAnnotationFieldInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DependencyInjectionAnnotationFieldInjectionApplication.class, args);
		Coach c=context.getBean("cricketClass",Coach.class);
		System.out.println(c.get_activity());
		System.out.println(c.get_fortune());
		}

}
