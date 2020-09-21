package com.example.company.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructor_detail_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InstructorDetail getInstructor_detail_id() {
		return instructor_detail_id;
	}
	public void setInstructor_detail_id(InstructorDetail instructor_detail_id) {
		this.instructor_detail_id = instructor_detail_id;
	}
	
	
	
	

}
