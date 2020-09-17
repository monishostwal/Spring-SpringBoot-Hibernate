package com.example.demo;

import java.util.HashMap;

public class Student {
	
	public String gender;
	public HashMap<String, String> genders ;

	public HashMap<String, String> getGenders() {
		genders=new HashMap<String,String>();
		genders.put("Male", "Male");
		genders.put("Female", "Female");
		System.out.println(genders);
		return genders;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
