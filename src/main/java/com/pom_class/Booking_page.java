package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page {

	public WebDriver driver;
	
	@FindBy (name = "first_name")
	private WebElement first_name;
	
	@FindBy (name = "last_name")
	private WebElement last_name;
	
	@FindBy (name = "address")
	private WebElement address;

	@FindBy (xpath = "(//input[@type ='text'])[13]")
	private WebElement creditcard;
	
	@FindBy (name = "cc_type")
	private WebElement cardtype;
	
	@FindBy (name = "cc_exp_month")
	private WebElement expirymonth;
	
	@FindBy (name = "cc_exp_year")
	private WebElement expiryyear;
	
	@FindBy (name = "cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy (name = "book_now")
	private WebElement book;
	
	@FindBy (xpath = "(//input[@type='button'])[3]")
	private WebElement logout;
	
	public Booking_page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getLogout() {
		return logout;
	}

	@FindBy (id = "jothi")
	private WebElement jothi;

	public WebElement getJothi() {
		return jothi;
	}
	
}
