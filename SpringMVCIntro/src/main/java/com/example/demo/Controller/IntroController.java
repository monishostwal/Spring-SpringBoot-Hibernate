package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IntroController {
	
	
	@RequestMapping("/")
	public String show_message() {
		return "helloworld.jsp";
		
	}
	

}
