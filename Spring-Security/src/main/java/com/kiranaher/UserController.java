package com.kiranaher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@RequestMapping("/patient")
	public String patientLogin() {
		return ("<h1>Welcome </h1>");
	}
	
	@RequestMapping("/physician")
	public String physicanLogin() {
		return ("<h1>Welcome </h1>");
	}
	
	@RequestMapping("/nurse")
	public String nurseLogin() {
		return ("<h1>Welcome </h1>");
	}
	
	@RequestMapping("/admin")
	public String adminLogin() {
		return ("<h1>Welcome Admin</h1>");
	}
	
}
