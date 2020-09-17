package com.example.demo;

import javax.validation.constraints.Pattern;

public class Pincode {

	@Pattern(regexp = "^[0-9]{6}",message = "Please enter 6 digit pincode")
	public String pincode_no;

	public String getPincode_no() {
		return pincode_no;
	}

	public void setPincode_no(String pincode_no) {
		this.pincode_no = pincode_no;
	}
	
	
}
