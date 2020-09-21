package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.model.Student;
import com.example.demo.repository.LaptopRepo;
import com.example.demo.repository.StudentRepo;

@RestController
public class ControllerClass {
	@Autowired
	StudentRepo sr;
	@Autowired
	LaptopRepo lr;
	
	@GetMapping("/users/all")
	public List<Student> get_all_students(){
		return sr.findAll();
	}
	
	@GetMapping("user/{id}")
	public Student get_single_student(@PathVariable("id") int id) {
		return sr.getOne(id);
	}
	
	@GetMapping("user/{id}/laptops")
	public List<Laptop> get_single_student_laptop_detail(@PathVariable("id") int id) {
		return sr.getOne(id).getLaptops();
	}
	
	@GetMapping("laptop/{id}")
	public Laptop laptop_detail(@PathVariable("id") int id) {
		return lr.getOne(id);
	}
	
	@PostMapping("user/add")
	public Student add_student(@RequestBody Student student) {
		System.out.println(student.getLaptops());
		List<Laptop> laptops=student.getLaptops();
		lr.saveAll(laptops);
		student.setLaptops(laptops);
		sr.save(student);
		return student;
	}
	
	@GetMapping("/laptops/all")
	public List<Laptop> get_all_laptops(){
		return lr.findAll();
	}
	
	

}
