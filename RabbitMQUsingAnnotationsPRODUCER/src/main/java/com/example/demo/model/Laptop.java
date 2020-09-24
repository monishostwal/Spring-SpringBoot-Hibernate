package com.example.demo.model;

import java.io.Serializable;

public class Laptop implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String brand;
	private String laptop_owner_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLaptop_owner_name() {
		return laptop_owner_name;
	}
	public void setLaptop_owner_name(String laptop_owner_name) {
		this.laptop_owner_name = laptop_owner_name;
	}

}
