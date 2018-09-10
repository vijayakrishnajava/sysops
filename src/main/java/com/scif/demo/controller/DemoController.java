package com.scif.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String getCourses(Model model) {
		model.addAttribute("list", "devops");
		return "index";
	}
}
