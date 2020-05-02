package com.in28minutes.springmvc.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login")
	public String getValue() {
		return "Hello World";
	}

}
