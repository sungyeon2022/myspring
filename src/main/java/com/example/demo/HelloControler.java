package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControler {
	
	@RequestMapping(value = "/hello")
	public String home() {
		return "index.html";
	}
}
