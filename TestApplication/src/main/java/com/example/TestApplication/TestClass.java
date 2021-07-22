package com.example.TestApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
@Component
public class TestClass {
	@Autowired
	private  BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public  void printHashedPassword() {
		 
		System.out.print("Encoded Password"+ bCryptPasswordEncoder.encode("manal"));
		
	}
}
