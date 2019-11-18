package com.perscholas.software_developer_club.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.perscholas.software_developer_club.dao.MemberDAO;
import com.perscholas.software_developer_club.models.Member;

@Controller
public class MemberController {

	@GetMapping("/")
	public String showLogin() {
		return "LoginPage";
	}

	@PostMapping("/loginMember")
	public String loginMember(@RequestParam String name, @RequestParam String password, HttpSession session,
			Model model) throws ClassNotFoundException, IOException, SQLException {
		System.out.println("inside loginMember method.");
		MemberDAO m_dao = new MemberDAO();
		Member m = m_dao.getMemberByName(name);
		System.out.println(m);
		if (m != null) {
			if (password.equals(m.getPassword())) {
				session.setAttribute("currentMember", m);
				return "Welcome";
			} else {
				model.addAttribute("errorMessage", "Invalid login-password");
				return "LoginPage";
			}
		} else {
			model.addAttribute("errorMessage", "Invalid login-user name");
			return "LoginPage";
		}
	}

	@GetMapping("/showRegistration")
	public String showRegister() {
		return "RegistrationPage";
	}

	@PostMapping("/registerMember")
	public String registerMember(@RequestParam String name, @RequestParam String email, @RequestParam String password,
			@RequestParam String favoriteLanguage) throws ClassNotFoundException, SQLException, IOException {

		Member m = new Member();
		m.setName(name);
		m.setEmail(email);
		m.setPassword(password);
		m.setFavoriteLanguage(favoriteLanguage);

		MemberDAO m_dao = new MemberDAO();
		Integer i = m_dao.registerMember(m);
		System.out.println(i);
		return "redirect:/showProfile";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}