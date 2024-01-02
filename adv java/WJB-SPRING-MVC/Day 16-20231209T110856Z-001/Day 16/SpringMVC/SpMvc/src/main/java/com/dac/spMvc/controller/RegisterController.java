package com.dac.spMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dac.spMvc.model.User;

@SuppressWarnings("unused")
@Controller
//@RequestMapping("/reg")
public class RegisterController {
	
	@ModelAttribute
	public void showTitle(Model m) {
		System.out.println("ModelAttribute");
		m.addAttribute("inst","Soft Polynomials Pvt Ltd");
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute User user) {
		return "success";
	}
	
	
	
//	@RequestMapping(path = "/register", method = RequestMethod.POST)
//	public String register(@RequestParam("name")String n,
//			@RequestParam("city")String ct,
//			@RequestParam("email")String em,Model m) {
//		
//		User user=new User(n, ct, em);
//		m.addAttribute("user",user);
//		
//		System.out.println(user);
//		return "success";
//	}
//	@RequestMapping(path = "/register", method = RequestMethod.POST)
//	public String register(HttpServletRequest req) {
//		String name=req.getParameter("name");
//		System.out.println(name);
//		return "success";
//	}
}
