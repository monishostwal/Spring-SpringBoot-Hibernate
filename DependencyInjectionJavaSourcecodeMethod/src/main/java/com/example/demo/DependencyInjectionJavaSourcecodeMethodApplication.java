package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;

@SpringBootApplication
public class DependencyInjectionJavaSourcecodeMethodApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionJavaSourcecodeMethodApplication.class, args);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportsConfig.class);
		Coach c=context.getBean("coach",Coach.class);
		System.out.println(c.get_activity());
		System.out.println(c.get_fortune());
	}

}
