package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyInjectionXmlSetterMethodApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionXmlSetterMethodApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Coach coach=context.getBean("mycoach", Coach.class);
		System.out.println(coach.getworkout());
		System.out.println(coach.get_player_fortune());
	}

}
