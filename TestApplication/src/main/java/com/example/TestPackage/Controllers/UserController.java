package com.example.TestPackage.Controllers;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.TestApplication.TestClass;
@Controller
public class UserController {
	@Autowired
	private TestClass testclass;
	@GetMapping("/encrypt")
	public void PasswordEncoding() {
		testclass.printHashedPassword();
	}
	
}
