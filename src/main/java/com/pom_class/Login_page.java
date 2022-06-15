package com.pom_class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	public WebDriver driver;

	@FindBy(id = "username")		//findElement(By replaced by FindBy
	private WebElement username;

	@FindBy(id= "password")
	private WebElement password;
		
	@FindBy(id= "login")
	private WebElement login;

		//use getters 

	public Login_page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
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
