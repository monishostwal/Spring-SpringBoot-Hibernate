package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;


public class Student {
	
	public ArrayList<String> choices;
	public HashMap<String,String> availableOptions;
	

	public HashMap<String, String> getAvailableOptions() {
		availableOptions=new HashMap<>();
		availableOptions.put("Python", "Python");
		availableOptions.put("Java", "Java");
		availableOptions.put("PHP", "PHP");
		return availableOptions;
	}

	public ArrayList<String> getChoices() {
		
		return choices;
	}

	public void setChoices(ArrayList<String> choices) {
		this.choices = choices;
		
	}
	
	

}
