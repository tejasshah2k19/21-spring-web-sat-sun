package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class UserController {

	// instead of class we are suppose to map methods....
	// method --> load signup page

	@GetMapping("/signup")
	public String loadSignup() {
		return "Signup";// this line will tell ioc to render Signup.jsp
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean user) {
		// set param
		// user.setFirstName(request.getParameter("firstName")) ;

		System.out.println("Save user Called..........");
		System.out.println(user.getEmail());
		System.out.println(user.getFirstName());
		return "Home";
	}

	// insert method => map

	// delete method => map

	// list method => map

}

//class
//extends HttpServlet 
//map servlet with some url in web.xml 

//servlet --> service | doGet | doPost ==>  1 features 

//addservlet 
//remove servlet 
//list servlet 
