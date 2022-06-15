package com.April_Demo;

import org.openqa.selenium.WebDriver;

import com.base_class.Base_class;
import com.pom_mgr.Pom_mgr;
import com.properties.File_reader;

public class Runner_class extends Base_class {

	public static WebDriver driver = Browserlaunch("edge");				 // will be considered as class variable without static

	public static Pom_mgr pomr = new Pom_mgr(driver);

	public static void main(String[] args) throws Throwable {

		// base-class
		String url = File_reader.Fr().datareader().url();
		geturl(url);
		
		String screenshotloc = File_reader.Fr().datareader().screenshotloc();
		screenshot(screenshotloc);

						// pom-classs
		// login_page

		attri(pomr.getLp().getLogin(), "login");
		
		String username = File_reader.Fr().datareader().username();
		input(pomr.getLp().username(), username);					 // singleton design pattern
		
		String password = File_reader.Fr().datareader().password();
		input(pomr.getLp().getPassword(), password);
		
		click(pomr.getLp().getLogin());
		
	
		// search_hotel_page

		svalue(pomr.getSh().getLocation(), "Melbourne");
		stext(pomr.getSh().getHotels(), "Hotel Sunshine");
		stext(pomr.getSh().getRoom_type(), "Standard");
		sindex(pomr.getSh().getRoom_nos(), 3);
		
		issel(pomr.getSh().getRoom_nos());
		isenab(pomr.getSh().getHotels());
		isdis(pomr.getSh().getHotels());
		allopt(pomr.getSh().getRoom_type());
		ismulti(pomr.getSh().getHotels());
		getfirstsel(pomr.getSh().getHotels());
		getselopt(pomr.getSh().getHotels());
		
		String datepick = File_reader.Fr().datareader().Datepick();
		input(pomr.getSh().getDatepick_in(), datepick);
		String datepick_out = File_reader.Fr().datareader().Datepick_out();
		input(pomr.getSh().getDatepick_out(), datepick_out);
		text(pomr.getSh().getDatepick_out());
		
		sindex(pomr.getSh().getAdult_room(), 2);

		pomr.getSh().getSubmit().click();

		
		// select_hotel_page
		pomr.getSsh().selecthotel().click();
		pomr.getSsh().continu().click();
		
		
		// booking_page
		String first_name = File_reader.Fr().datareader().First_name();
		input(pomr.getBp().getFirst_name(), first_name);
		
		String last_name = File_reader.Fr().datareader().Last_name();
		input(pomr.getBp().getLast_name(), last_name);
		
		String address = File_reader.Fr().datareader().Address();
		input(pomr.getBp().getAddress(), address);
		
		String creditcard = File_reader.Fr().datareader().Creditcard();
		input(pomr.getBp().getCreditcard(), creditcard);
		
		sindex(pomr.getBp().getCardtype(), 3);
		sindex(pomr.getBp().getExpirymonth(), 3);
		sindex(pomr.getBp().getExpiryyear(), 9);
		
		String cvvnumber = File_reader.Fr().datareader().Cvvnumber();
		input(pomr.getBp().getCvvnumber(), cvvnumber);
		
		pomr.getBp().getBook().click();
		pomr.getBp().getLogout().click();
		
		currenturl();
		title();
		nato("https://studio.youtube.com/channel/UCz7rhMaDgfyOZuBNtwZTKjw/videos/upload?filter=%5B%5D&sort=%7B%22columnType%22%3A%22date%22%2C%22sortOrder%22%3A%22DESCENDING%22%7D");
		naref();
		naback();
		nafor();
		
		allwindowshand();
		
		

	}

}
