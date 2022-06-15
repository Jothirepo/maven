package com.TestNG_FEATURES;

import org.testng.annotations.Test;

public class Dependency_timeout_expexcept_feature {

	//dependency feature
	
	@Test			//if we use @ignore, nlu_method will also fail
	public void asr() {
		
		System.out.println("this is asr");

	}
	
	@Test (dependsOnMethods = "asr")
	public void nlu() {
		
		System.out.println("this is nlu");

	}
	
	
	//timeout feature
	
	@Test (timeOut = 7000)
	public void timeout_method() throws Throwable {
		
		Thread.sleep(2000);
		System.out.println("browser launch");
		
		Thread.sleep(2000);
		System.out.println("url launch");
		
		Thread.sleep(2000);
		System.out.println("login page");

	}
	
	
	//expected_exception
	
	@Test (expectedExceptions = ArithmeticException.class)
	public void Expectedexception () {
		
		int a = 10;
		System.out.println(a/0);

	}
}
