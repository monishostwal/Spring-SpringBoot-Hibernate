package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	Fortune fortune;
	
	
	public CricketCoach() {
		super();
	}

	
	public Fortune getFortune() {
		return fortune;
	}
	@Autowired
	public void setFortune(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String get_activity() {
		
		return "Play cricket 8 times a day";
	}

	@Override
	public String get_fortuner() {
	
		return fortune.fortune_getter();
	}
	
	@PostConstruct
	public void PreBean() {
		System.out.println("Init Method Called");
	}
	@PreDestroy
	public void PostBean() {
		System.out.println("Destroy Method Called");
	}	
}
