package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LiteralValuesInjectionXmlApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LiteralValuesInjectionXmlApplication.class, args);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Coach coach=context.getBean("mycoach",Coach.class);
		System.out.println(coach.get_team_of_user());
		System.out.println(coach.getmail_id_of_user());
	}

}
