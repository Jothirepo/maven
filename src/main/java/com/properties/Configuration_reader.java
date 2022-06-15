package com.properties;


import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Configuration_reader {

	public static Properties p;

	public Configuration_reader() throws Throwable {			//constructor_method invoked since below statements are to be executed before calling methods

		File f = new File(
				"C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\src\\main\\java\\com\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);			//read the inputs from file
		p = new Properties();									//to read a property file
		p.load(fis);											//load data from file
	}

	

	public String url() {

		String url = p.getProperty("url");						//get the data

		return url;

	}

	public String username() {

		String username = p.getProperty("username");
		return username;

	}
	
	public String password () {

		String password = p.getProperty("password");
		return password;

	}

	public String Datepick () {

		String Datepick = p.getProperty("Datepick");
		return Datepick;

	}
	
	public String Datepick_out () {

		String Datepick_out = p.getProperty("Datepick_out");
		return Datepick_out;

	}
	
	public String First_name () {

		String First_name = p.getProperty("First_name");
		return First_name;

	}
	
	public String Last_name () {

		String Last_name = p.getProperty("Last_name");
		return Last_name;

	}
	
	
	public String Address () {

		String Address = p.getProperty("Address");
		return Address;

	}
	
	public String Creditcard () {

		String Creditcard = p.getProperty("Creditcard");
		return Creditcard;

	}
	
	public String Cvvnumber () {

		String Cvvnumber = p.getProperty("Cvvnumber");
		return Cvvnumber;

	}
	
	public String screenshotloc() {
		
		String sshot = p.getProperty("Screenshotloc");
		
		return sshot;
		

	}
	
	
	
	
	
}
