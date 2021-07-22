package com.example.TestApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


public class getHashedPassword {
	
	
//	public void printHashedPassword() {
//		System.out.print("Encoded Password"+ passwordEncoder.encode("manal"));
//		
//	}
	public static void main(String[] args) {
		BCryptPasswordEncoder ep = new BCryptPasswordEncoder();
		String password = ep.encode("ammus");
		System.out.println(password);
	}
}
