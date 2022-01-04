package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public String login_page() {
		return "/login";
	}
	
}
