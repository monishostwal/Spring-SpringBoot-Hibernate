package com.example.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.company.model.Instructor;
import com.example.company.repository.InstructorRepo;

@RestController
@RequestMapping("user")
public class InstructorController {
	@Autowired
	InstructorRepo ir;
	
	@GetMapping("all")
	public List<Instructor> show_all(){
		return ir.findAll();
	}
	
	@PostMapping("add")
	public Instructor add_inst(@RequestBody Instructor ins) {
		System.out.println(ins.getFirst_name());
		ir.save(ins);
		return ins;
	}
	
	@DeleteMapping("del/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		System.out.println("OK");
		ir.deleteById(id);
		
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	

}
