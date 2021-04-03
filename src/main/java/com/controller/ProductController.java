package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;
import com.dao.ProductDao;

//servlet 
@Controller // jsp
//@RestController //json 
public class ProductController {

	@Autowired
	ProductDao productDao;
    
	
	
	
	@GetMapping("/newproduct")
	public String newProduct(Model model) {
		model.addAttribute("product", new ProductBean());
		return "NewProduct";
	}

	@PostMapping("/saveproduct")
	public String saveProduct(@ModelAttribute("product") @Valid ProductBean productBean, BindingResult result,
			Model model) {

		if (result.hasErrors()) {
			model.addAttribute("product", productBean);
			return "NewProduct";// json
		} else {
			// db insert
			productDao.insertProduct(productBean);
			return "Home";
		}

	}

}
