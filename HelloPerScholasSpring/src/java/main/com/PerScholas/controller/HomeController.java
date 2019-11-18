package com.PerScholas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String helloPerScholas() {
		return "Hello";
	}
	@RequestMapping("/helloPerScholasQa")
	public String hello() {
		return "HelloQa";
	}
	
}
