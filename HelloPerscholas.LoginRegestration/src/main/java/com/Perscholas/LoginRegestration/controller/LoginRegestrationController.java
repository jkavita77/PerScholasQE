package com.Perscholas.LoginRegestration.controller;

import java.time.LocalDateTime;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginRegestrationController {

	@GetMapping("/")
	public String showLogin() {
		return "Login";
	}
	@RequestMapping("/Register")
	public String Register() {
		return "Registration";
	}
	
	@PostMapping("/LoginUser")
	public String loginUser(@RequestParam String username, @RequestParam String password) {
		System.out.println("Name: "+ username + "password: " + password);
		return "Login";
	}
	
	@PostMapping("/RegisterUser")
	public String RegisterUser(@RequestParam String first_name, @RequestParam String last_name, @RequestParam String username,  @RequestParam String password, @RequestParam String address) {
		System.out.println("FirstName: "+ first_name + "LastName: "+ last_name  + "Username: "+ username  + "password: " + password +"Address: "+ address);
		return "Registration";
	}
}
