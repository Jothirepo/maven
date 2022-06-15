package com.TestNG_FEATURES;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Data_provider {
	
	//passing different set of data to same parameters

	@Test (dataProvider = "input")
	public void login(String username, String password) {
		
		System.out.println("username : " + username);
		
		System.out.println("password : " + password);

	}
	
	@DataProvider
	public Object[][] input() {
		
	return new Object [][] {
		
		{"jothi", "131"},
		{"rama", "1114"}
	};
	}
	
	//hardassert //Validation
	
	@Test
	public void logout() {
		
		String a = "1234";
		String b = "1234";
		
		Assert.assertEquals(a, b);

	}
	
	//softassert //Verification
	
	@Test
	public void credent() {
		
		String a = "jothi";
		String b = "joth";
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(a, b);
	}
	
	
	
	
	
}

