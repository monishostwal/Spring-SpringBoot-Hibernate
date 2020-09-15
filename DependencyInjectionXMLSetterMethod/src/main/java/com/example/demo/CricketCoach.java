package com.example.demo;

public class CricketCoach implements Coach {

	@Override
	public String getworkout() {
		
		return "Play cricket for 5 minutes.";
	}
	
	private Fortune fortune;

	public Fortune getFortune() {
		return fortune;
	}

	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String get_player_fortune() {
		
		return fortune.getFortune();
	}
	

}
