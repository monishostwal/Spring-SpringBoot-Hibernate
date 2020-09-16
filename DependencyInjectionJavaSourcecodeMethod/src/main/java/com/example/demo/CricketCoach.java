package com.example.demo;

public class CricketCoach implements Coach {
	
	private Fortune fortune;

	public CricketCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String get_activity() {
	
		return "Play Cricket for 5 minutes";
	}

	@Override
	public String get_fortune() {
		return fortune.fortune_maker();
	}

}
