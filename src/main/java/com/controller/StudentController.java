package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;
import com.dao.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;

	@GetMapping("/newstudent")
	public String newStudent(Model model) {

		model.addAttribute("student", new StudentBean());
		return "NewStudent";
	}

	@PostMapping("/savestudent")
	public String saveStudent(@ModelAttribute("student") StudentBean student) {
		
		//find user by email -> 
		
		studentDao.insertStudent(student);//
		return "Login";
	}

}
