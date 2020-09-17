package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("student-form")
	public String show_form(Model model) {
		
		model.addAttribute("student",new Student());
		return "form.jsp";
	}
	
	@RequestMapping("process_form")
	public String process(@ModelAttribute("student") Student student) {
		
		return "home.jsp";
		
	}

}
