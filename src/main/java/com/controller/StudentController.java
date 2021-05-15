package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bean.StudentBean;
import com.dao.StudentDao;
import com.service.ImageService;

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;

	@Autowired
	ImageService imageService;

	@GetMapping("/newstudent")
	public String newStudent(Model model) {

		model.addAttribute("student", new StudentBean());
		return "NewStudent";
	}

	@PostMapping("/savestudent")
	public String saveStudent(@ModelAttribute("student") StudentBean student) {

		// find user by email ->

		studentDao.insertStudent(student);//
		return "Login";
	}

	@GetMapping("/uploadstudentprofile")
	public String uploadProfile() {
		return "AddStudentProfilePic";
	}

	// commons-fileupload
	// commons-io
	@PostMapping("/savestudentprofile")
	public String saveProfilePic(@RequestParam("profilepic") MultipartFile file, Model model, HttpSession session) {
		StudentBean student = (StudentBean) session.getAttribute("student");
		System.out.println("student==> "+ student);
		System.out.println("sid 53 => "+student.getStudentId());
		String path = imageService.uploadStudentImage(file, student.getStudentId()+"");
	
		student.setProfilePicPath(path);
	
		session.setAttribute("student", student);
		
		model.addAttribute("msg", "File uploaded....");
	
		studentDao.updateProfilePath(student.getStudentId(),path);
		return "StudentHome";
	}

}






