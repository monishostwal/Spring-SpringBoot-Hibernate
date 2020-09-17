package com.example.demo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("form")
	public String show_form(Model model) {
		model.addAttribute("customer",new Customer());
		return "form.jsp";
	}
	
	@RequestMapping("result")
	public String show_result(@Valid @ModelAttribute("customer") Customer customer,BindingResult bd) {
		if (bd.hasErrors()){
			return "form.jsp";
		}
		return "result.jsp";
	}
	
	@InitBinder
	public void removeWhitespace(DataBinder db) {
		StringTrimmerEditor ste=new StringTrimmerEditor(true);
		db.registerCustomEditor(String.class, ste);
	}
}
