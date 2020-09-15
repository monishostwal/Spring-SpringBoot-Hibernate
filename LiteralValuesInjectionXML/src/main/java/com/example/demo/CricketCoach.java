package com.example.demo;

public class CricketCoach implements Coach {

	
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getmail_id_of_user() {
		return getEmail();
	}

	@Override
	public String get_team_of_user() {

		return getTeam();
	}

}
