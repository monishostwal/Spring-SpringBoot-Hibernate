package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class SportsConfig {
	@Bean
	public Coach cricketCoach() {
		CricketCoach c=new CricketCoach();
		return c;
	}

}
