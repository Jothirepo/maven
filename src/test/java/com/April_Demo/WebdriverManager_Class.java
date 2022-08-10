package com.April_Demo;

import com.base_class.Base_class;

public class WebdriverManager_Class extends Base_class {

	public static void main(String[] args) {

		Browserlaunch("edge");
		geturl("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.0.3");
		nato("https://www.youtube.com/watch?v=IFz9YaH-3As");
	}

	private void fummy() {

		System.out.println("own object");
	}
	
	public static void funny() {
		
		WebdriverManager_Class wb = new WebdriverManager_Class();
		
		wb.fummy();
		

	}
}
