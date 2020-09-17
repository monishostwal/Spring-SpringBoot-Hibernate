package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	
	@RequestMapping("form")
	public String showform(Model model) {
		model.addAttribute("student",new Student());
		
		return "form.jsp";
	}

	@RequestMapping("result")
	public String showresult(@ModelAttribute("student") Student student) {
		
		return "home.jsp";
	}
}
