package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.StudentBean;
import com.dao.SessionDao;

@Controller
public class SessionController {

	@Autowired
	SessionDao sessionDao;

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	@PostMapping("/authenticate")
	public String authenticate(@RequestParam("email") String email, @RequestParam("password") String password,
			Model model, HttpSession session) {

		StudentBean student = sessionDao.authenticate(email, password);

		if (student == null) {
			model.addAttribute("error", "Invalid credentials..");
			return "Login";
		} else {
			session.setAttribute("student", student);
			return "StudentHome";
		}
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "Login";
	}

}
