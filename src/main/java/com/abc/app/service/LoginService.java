package com.abc.app.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String username, String password) {
		return username.equalsIgnoreCase("ivan") && password.equals("1234");
	}
}
