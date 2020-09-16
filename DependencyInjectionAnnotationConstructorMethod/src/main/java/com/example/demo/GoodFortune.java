package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune {

	@Override
	public String fortune_getter() {
		return "You will have a good day today.";
	}

}
