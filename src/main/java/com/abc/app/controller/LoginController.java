package com.abc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.abc.app.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		boolean loginStatus = loginService.validateUser(username, password);
		
		if(!loginStatus){
			model.put("errorMessage", "Invalid credentials!");
			return "login";
		}
		
		model.put("username", username);
		model.put("password", password);
		
		return "home";
	}
}