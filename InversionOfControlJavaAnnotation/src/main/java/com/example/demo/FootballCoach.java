package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

	@Override
	public String getWorkout() {
		
		return "Practice Football for 5 hours.";
	}

}
