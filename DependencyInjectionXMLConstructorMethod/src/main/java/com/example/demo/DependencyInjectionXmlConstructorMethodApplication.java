package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionXmlConstructorMethodApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionXmlConstructorMethodApplication.class, args);
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Coach c=context.getBean("mycoach",Coach.class);
		System.out.println(c.getActivity());
		System.out.println(c.getFortune());
		
	}

}
