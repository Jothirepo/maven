package com.TestNG_FEATURES;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Simple_annot_feature {

	//write the statements within methods
	//just remember the hierarchy
	//only gonna use @test method
	//priority goes from -ve to 0 to +ve
	//default value will be 0 if no priority is set and will be executed in ASCII FORMAT
	
	
	@BeforeSuite
	public void propset() {
		
		System.out.println("set property");

	}
	
	@BeforeTest
	public void browserlaunch() {
		
		System.out.println("browser launch");

	}
	
	@BeforeClass
	public void urllaunch() {
		
		System.out.println("url is launched");

	}
	
	@BeforeMethod 
	@Ignore
	public void signin() {
		
		System.out.println("this is signIN");

	}
	
	@Test (priority = 0, invocationCount = 2)
	public void men() {

		System.out.println("this is men's section");

	}
	
	@Test (priority = -1)
	public void women() {

		System.out.println("this is women's section");

	}

	@Test (priority = +1)
	public void kids() {

		System.out.println("this is kids' section");

	}
	
	@AfterMethod
	public void signout() {
		
		System.out.println("this is signOUT");

	}
	
	@AfterClass
	public void homepage() {
		
		System.out.println("home page is here");

	}
	
	@AfterTest
	public void clearcookies() {
		
		System.out.println("clear the cookies");

	}
	
	@AfterSuite
	public void close() {
		
		System.out.println("close the page");
	}
	
	
	
	
}
