package com.TestNG_FEATURES;


import  org.testng.Assert;
import org.testng.annotations.Test;

public class Login_demo_assert {
	
	
			//actual class to be run
	@Test (retryAnalyzer = Rerun.class)
	public void login() {
		
		String a = "jothi";
		String b = "jothe";
		
		Assert.assertEquals(a, b);

	}
	
}
 