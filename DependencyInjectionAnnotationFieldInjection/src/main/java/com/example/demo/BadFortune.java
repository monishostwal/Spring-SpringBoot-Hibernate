package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune {

	@Override
	public String get_fortune() {

		return "Bad Mood today!!";
	}

}
