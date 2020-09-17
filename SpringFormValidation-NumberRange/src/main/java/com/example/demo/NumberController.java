package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {
	
	@RequestMapping("form")
	public String form(Model model) {
		model.addAttribute("numbers",new Number());
		return "form.jsp";
	}
	
	@RequestMapping("result")
	public String result(@Valid @ModelAttribute("numbers") Number number,BindingResult br) {
		if (br.hasErrors()){
			return "form.jsp";
		}
		return "result.jsp";
	}

}
