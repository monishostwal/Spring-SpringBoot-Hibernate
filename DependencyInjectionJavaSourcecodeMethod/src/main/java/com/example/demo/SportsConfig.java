package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
	
	@Bean
	public Fortune fortune() {
		
		return new GoodFortune();
	}
	
	
	@Bean
	public Coach coach() {
		return new CricketCoach(fortune());
	}
}
