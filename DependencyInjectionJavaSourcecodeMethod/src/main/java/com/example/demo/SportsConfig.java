package com.example.demo;

import org.springframework.context.annotation.Bean;

public class SportsConfig {
	
	public Fortune fortune() {
		
		return new GoodFortune();
	}
	
	
	@Bean
	public Coach coach() {
		return new CricketCoach(fortune());
	}
}
