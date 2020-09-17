package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Number {
	
	@NotNull
	@Min(value = 0,message = "Enter between 0 and 10")
	@Max(value = 10,message = "Enter between 0 and 10")
	public Integer num;

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	

}
