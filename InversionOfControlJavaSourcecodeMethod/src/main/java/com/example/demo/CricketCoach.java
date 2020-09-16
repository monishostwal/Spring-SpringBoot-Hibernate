package com.example.demo;

import org.springframework.stereotype.Component;

public class CricketCoach implements Coach {

	@Override
	public String get_activity() {
		
		return "Cricket is good game.";
	}

}
