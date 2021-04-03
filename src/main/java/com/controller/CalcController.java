package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.CalcBean;

@Controller
public class CalcController {

	@GetMapping("/calc")
	public String calc() {

		return "Calc";
	}

	@GetMapping("/addition")
	public String Addition(CalcBean calc,Model model) {

		int ans = calc.getN1() + calc.getN2();
		model.addAttribute("ans",ans);
		
		return "Calc";
	}
}
