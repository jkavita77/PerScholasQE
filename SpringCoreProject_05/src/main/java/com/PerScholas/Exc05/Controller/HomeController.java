package com.PerScholas.Exc05.Controller;

import java.security.Principal;

import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class HomeController {

	@RequestMapping("/")
	public String ContactPage() {
		return "Contact";
	}

	@RequestMapping("/AboutmePage")
	public String Test1() {
		return "AboutmePage";
	}

	@PostMapping("/ContactUser")
	public String loginMember(@RequestParam String username, @RequestParam String question, HttpSession session,
			Model model) {
		System.out.println("Name: " + username + "Question: " + question);
		session.setAttribute("currentUserName", username);
		return "Welcome";
	}

}
