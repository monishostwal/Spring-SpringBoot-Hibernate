package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	public String firstName;
	
	@NotNull(message = "is Required")
	@Size(min = 1,message = "is Required")
	public String mail;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
