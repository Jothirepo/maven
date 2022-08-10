package com.pom_mgr;

import org.openqa.selenium.WebDriver;

import com.pom_class.Booking_page;
import com.pom_class.Login_page;
import com.pom_class.Search_hotel;
import com.pom_class.Select_hotel;

public class Pom_mgr {

	// Collecting all the POM_CLASS objects & store it in a separate class & make it private
	// private datatype variable ---> storing variable
	// private webeelement refna ---> storing webelement
	// private classname object ---> storing object

	
	
	public WebDriver driver;

	public Pom_mgr(WebDriver driver2) {

		this.driver = driver2;

	}
	
//SYNTAX
//access-modifier POM_PAGE Ref_name;

	private Login_page lp;			//calling login_page here and making it private & get using getters
	private Search_hotel sh;		
	private Select_hotel ssh;
	private Booking_page bp;

	public Login_page getLp() {

		if (lp == null) {

			lp = new Login_page(driver);
		}

		return lp;
	}

	public Search_hotel getSh() {

		if (sh == null) {

			sh = new Search_hotel(driver);

		}

		return sh;
	}

	public Select_hotel getSsh() {

		if (ssh == null) {

			ssh = new Select_hotel(driver);
		}

		return ssh;
	}

	public Booking_page getBp() {

		if (bp == null) {

			bp = new Booking_page(driver);
		}

		return bp;

	}
}
