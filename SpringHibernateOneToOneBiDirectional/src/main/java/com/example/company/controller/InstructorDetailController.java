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

import com.example.company.model.InstructorDetail;
import com.example.company.repository.InstructorDetailRepo;
import com.example.company.repository.InstructorRepo;

@RestController
@RequestMapping("detail")
public class InstructorDetailController {
	
	@Autowired
	InstructorDetailRepo idr;
	
	@GetMapping("all") 
	public List<InstructorDetail>  show_all_detail(){
		System.out.println(idr.count());
		System.out.println(idr.findAll());
		return idr.findAll();
	}
	
	@PostMapping("add")
	public InstructorDetail add_ins_detail(@RequestBody InstructorDetail istd) {
		idr.save(istd);
		return istd;
	}

	@DeleteMapping("del/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id){
		idr.deleteById(id);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
}
