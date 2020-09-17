package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {
	
	@RequestMapping("/")
	public String form_data() {
		return "form.jsp";
	}
	
	@RequestMapping("generate_homepage")
	public String generate_home(Model model,@RequestParam("username") String username,@RequestParam("tech") String technology) {
	
		username=username.toUpperCase();

		model.addAttribute("message", username);
		model.addAttribute("tech",technology);
		return "hello.jsp";
		
	}

}
