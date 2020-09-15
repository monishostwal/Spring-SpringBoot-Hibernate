package com.example.demo;

public class BaseballCoach implements Coach {
	private Fortune fortune;

	public BaseballCoach(Fortune fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getActivity() {
		
		return "BaseBall 5 minutes practice.";
	}

	@Override
	public String getFortune() {
		
		return fortune.getFortune();
	}
	
	

}
