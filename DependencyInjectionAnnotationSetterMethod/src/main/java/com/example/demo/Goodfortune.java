package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Goodfortune implements Fortune{

	@Override
	public String fortune_getter() {
		
		return "Good day ahead!!";
	}
	
	

}
