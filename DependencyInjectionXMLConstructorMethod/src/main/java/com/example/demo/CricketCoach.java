package com.example.demo;

public class CricketCoach implements Coach {
	private Fortune fortune;
	public CricketCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}
	@Override
	public String getActivity() {
		
		return "Practice Cricket for 5 minutes.";
	}
	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}

}
