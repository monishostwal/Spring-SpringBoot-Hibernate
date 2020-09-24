package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll_no;
	private String name;
	@OneToMany(targetEntity = Laptop.class,fetch =  FetchType.EAGER)
	@JoinColumn(name = "fk",referencedColumnName = "roll_no")
	
	private List<Laptop> laptops;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Laptop> getLaptops() {
		System.out.println("MONISh");
		System.out.println(laptops);
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		
		
		this.laptops = laptops;
	}
	
	
	
}
