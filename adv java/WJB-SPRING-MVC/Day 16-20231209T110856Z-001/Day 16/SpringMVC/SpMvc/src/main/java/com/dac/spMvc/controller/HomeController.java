package com.dac.spMvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("city", "Nagpur");
		List<String> myStuds=Arrays.asList("Mihir","Akshay","Raman","Pranav");
		model.addAttribute("studs", myStuds);
		return "home";
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("name", "Anup");
		mv.setViewName("contact");
		return mv;
	}
}
