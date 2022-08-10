package com.pom_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;

	//POJO	
	@FindBy(id = "username")		//findElement(By replaced by FindBy
	private WebElement username;

	@FindBy(id= "password")
	private WebElement password;
		
	@FindBy(id= "login")			//id's att value
	private WebElement login;		//reference name

		//use getters 

	public Login_page(WebDriver driver2) {
	
	//CURRENT DRIVER = DRIVER FROM PAGE OBJECT MANAGER
		
		 this.driver = driver2;
		 PageFactory.initElements(driver, this);
		 
	//Initialise all webelements with the current driver	 
	
	}

	public WebElement username() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
