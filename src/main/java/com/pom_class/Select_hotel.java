package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_hotel {

	public WebDriver driver;
	
	@FindBy(name = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(name = "continue")
	private WebElement conti;
	
	public WebElement continu() {
		return conti;
	}

	public Select_hotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement selecthotel() {
		return radiobutton_0;
	}
	
}
