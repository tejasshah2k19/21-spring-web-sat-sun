package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.MailService;

@Controller
public class MailController {
	@Autowired
	MailService mailService;
	
	@GetMapping("getemaildetail")
	public String sendMailDetail() {
		return "MailSendMail";
	}

	@PostMapping("sendmail")
	public String sendMail(@RequestParam("email") String email, @RequestParam("subject") String subject,
			@RequestParam("body") String body) {
		System.out.println(email);
		System.out.println(subject);
		System.out.println(body);
		mailService.sendMail(email, subject, body);
		return "MailSendMail";
	}
}
