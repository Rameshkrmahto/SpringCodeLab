package com.nit.service;

import org.springframework.stereotype.Component;

@Component("password")
public class PasswordAuthService implements AuthService{

	@Override
	public void authenticate() {

       System.out.println("PasswordAuthService.authenticate()");
		
	}

}
