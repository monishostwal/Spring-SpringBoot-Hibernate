package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
	private Fortune fortune;
	
	
	@Autowired
	public CricketCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String get_activity() {
		
		return "Play cricket with virat kohli.";
	}

	@Override
	public String get_fortune() {
		// TODO Auto-generated method stub
		return fortune.fortune_getter();
	}

}
