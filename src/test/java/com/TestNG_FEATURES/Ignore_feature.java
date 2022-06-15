package com.TestNG_FEATURES;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_feature {

	@Test (groups = "veg")						//(enabled = false)			//1st type to ignore
	public void friedrice() {
		
		System.out.println("this is fried rice");

	}
	
	@Test (groups = "non-veg")	
	public void eggrice() {
		
		System.out.println("this is egg rice");

	}
	
						//@Ignore							//2nd type to ignore
	@Test (groups = "non-veg")	
	public void chickenrice() {
		
		System.out.println("this is chicken rice");

	}
	
	@Test (groups = "veg")	
	public void paneerrice() {
		
		System.out.println("this is paneer rice");

	}
	
	@Test (groups = "cars")
	public void bmw() {
		
		System.out.println("this is bmw car");

	}
	
	@Test (groups = "cars")
	public void benz() {
		
		System.out.println("this is benz car");

	}
	
	@Test (groups = "bikes")
	public void honda() {
		
		System.out.println("this is honda bike");

	}
	
	@Test (groups = "bikes")
	public void hero() {
		
		System.out.println("this is hero bike");

	}
}
