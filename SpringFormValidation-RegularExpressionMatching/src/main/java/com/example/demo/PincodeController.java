package com.example.demo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PincodeController {

	@RequestMapping("form")
	public String form(Model model) {
		model.addAttribute("pincode",new Pincode());
		return "form.jsp";
	}
	
	@RequestMapping("result")
	public String result(@Valid @ModelAttribute("pincode") Pincode pincode,BindingResult br) {
		if(br.hasErrors()){
			return "form.jsp";
		}
		return "result.jsp";
		
	}
}
