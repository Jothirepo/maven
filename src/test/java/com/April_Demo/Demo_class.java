package com.April_Demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base_class.Base_class;

public class Demo_class extends Base_class {

	public static WebDriver driver = Browserlaunch("edge");

	public static void main(String[] args) {

		geturl("http://demo.automationtesting.in/Alerts.html");

		WebElement alert = driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']"));

		alert.click();

		WebElement alert2 = driver
				.findElement(By.xpath("//button[text() = 'click the button to demonstrate the prompt box ']"));

		alert2.click();

		alsend("jothi");
		alacpt();

	}
}
