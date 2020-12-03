package com.in28minutes.springboot.app.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("akshat") && password.equalsIgnoreCase("bhatt");
	}
}
