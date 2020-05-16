package com.in28minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@Autowired
	private UserValidationService service;

	@RequestMapping(value = "/login", method = RequestMethod.GET)	
	public String showLoginPage() {
		return "login";
	}

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)	
	public String handleLoginPage(@RequestParam String name, 
			@RequestParam String password,ModelMap model) {
		
		if (!service.isUserValid(name, password)) {
			model.put("ErrorMsg", "Invalid Credentials !!!!");
			return "login";
		}
		
		System.out.println(name);		
		model.put("name",name);
		model.put("password",password);
		return "welcome";
	}
	
}
