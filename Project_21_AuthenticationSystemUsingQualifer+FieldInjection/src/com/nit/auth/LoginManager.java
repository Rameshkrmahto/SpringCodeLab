package com.nit.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.service.AuthService;

@Component("lm")
public class LoginManager {
	
	@Autowired
	@Qualifier("otp")
	AuthService authService;
	
	
	public void loginDetails()
	{
		authService.authenticate();
	}

}
