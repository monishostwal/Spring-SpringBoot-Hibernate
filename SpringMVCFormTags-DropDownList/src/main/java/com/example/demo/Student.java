package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student {

	public String techOption;
	public HashMap<String, String> countryOptions;

	public HashMap<String, String> getCountryOptions() {
		countryOptions=new HashMap<String, String>();
		countryOptions.put("Python", "Python");
		countryOptions.put("Java", "Java");
		countryOptions.put("PHP", "PHP");
		countryOptions.put("C++", "C++");
		return countryOptions;
	}

	public String getTechOption() {
		return techOption;
	}

	public void setTechOption(String techOption) {
		this.techOption = techOption;
	}
	
}
