package com.Perscholas.datetime.controller;

import java.time.LocalDateTime;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateTimeController {

	@GetMapping("/")
	public String showWelcome(Model model) {
		model.addAttribute("datetime", LocalDateTime.now());
		//Session.setAttribute("currentUser", "James");
		return "Welcome";
	}
}
