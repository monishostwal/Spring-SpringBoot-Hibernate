package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune
{

	@Override
	public String get_fortune() {
	
		return "Good day!!";
	}

}
