package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketClass implements Coach {
	@Autowired
	@Qualifier("badFortune")
	private Fortune fortune;
	@Override
	public String get_activity() {
		
		return "Play Cricket my boi!!";
	}

	@Override
	public String get_fortune() {

		return fortune.get_fortune();
	}

}
