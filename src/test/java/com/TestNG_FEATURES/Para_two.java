package com.TestNG_FEATURES;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para_two {

	@Test
	@Parameters({"Username", "password"})
	public void logout(@Optional("ramalingam")String username, String password) {

		System.out.println("username : " + username);
		System.out.println("password : " + password);

	}
}
