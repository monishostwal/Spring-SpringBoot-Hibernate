package com.example.demo;

import org.springframework.stereotype.Component;

@Component("cricket_coach")
public class Cricketcoach implements Coach {

	@Override
	public String getWorkout() {
		
		return "Cricket for 5 min.";
	}

}
