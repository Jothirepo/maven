package com.TestNG_FEATURES;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_feature {

	@Test
	@Parameters({"username", "password"})
	public void loginpage(String username, String password) {
		
		System.out.println("username : " + username);
		
		System.out.println("password : " + password);

	}
}
