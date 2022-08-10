package com.base_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class {

	public static WebDriver driver;
	public static Select s;
	public static Actions ac;

	public static WebDriver Browserlaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (browsername.equalsIgnoreCase("edge")) {

			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}

		else if (browsername.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		return driver;

	}

	// sendkeys_method

	public static void input(WebElement element, String value) {

		element.sendKeys(value);

	}
	// click_method

	public static void click(WebElement element) {

		element.click();

	}
	// close_method

	public static void close() {

		driver.close();

	}
	// get_url_method

	public static void geturl(String url) {

		driver.get(url);

	}
	// getcurrenturl

	public static void currenturl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}
	// gettitle

	public static void title() {

		String title = driver.getTitle();
		System.out.println(title);

	}
	// gettext

	public static void text(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}

	// getattribute

	public static void attri(WebElement element, String attributename) {

		String attribute = element.getAttribute(attributename);
		System.out.println(attribute);

	}

	
	// navigateto

	public static void nato(String url) {

		driver.navigate().to(url);

	}
	// navigateback

	public static void naback() {

		driver.navigate().back();

	}
	// navigateforward

	public static void nafor() {

		driver.navigate().forward();

	}
	// navigaterefresh

	public static void naref() {

		driver.navigate().refresh();

	}
	
	
	// isenabled

	public static void isenab(WebElement element) {

		element.isEnabled();

	}
	// isdisplayed

	public static void isdis(WebElement element) {

		element.isDisplayed();

	}
	// isselected

	public static void issel(WebElement element) {

		element.isSelected();

	}
	// selectbyvalue

	public static void svalue(WebElement element, String value) {

		s = new Select(element);

		s.selectByValue(value);

	}
	// selectbyindex

	public static void sindex(WebElement element, int option) {

		s = new Select(element);

		s.selectByIndex(option);

	}
	// selectbytext

	public static void stext(WebElement element, String text) {

		s = new Select(element);

		s.selectByVisibleText(text);

	}
	// Deselectbyindex

	public static void Dei(WebElement element, int number) {

		s = new Select(element);

		s.deselectByIndex(number);

	}
	// Deselectbyvalue

	public static void Dev(WebElement element, String value) {

		s = new Select(element);

		s.deselectByValue(value);
	}
	// Deselectbyvalue

	public static void Det(WebElement element, String text) {

		s = new Select(element);

		s.deselectByVisibleText(text);

	}
	// get_all_options
	public static void allopt(WebElement element) {

		s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (WebElement alloptions : options) {

			String alloptns = alloptions.getText();

			System.out.println(alloptns);
		}

	}
	// is_multiple
	public static void ismulti(WebElement element) {

		s = new Select(element);

		boolean multiple = s.isMultiple();

		System.out.println(multiple);

	}
	// is_all_selected

	public static void getselopt(WebElement element) {

		s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement getallsel : allSelectedOptions) {

			String text = getallsel.getText();

			System.out.println(text);
		}
	}
	// is_first_selected

	public static void getfirstsel(WebElement element) {

		s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		System.out.println(firstSelectedOption.getText());
	}

	
	// screenshot
		public static void screenshot(String location) throws Throwable {

			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);

			File destination = new File(location);

			FileUtils.copyFile(source, destination);

		}
		
		
	// click_and_hold
	public static void hold(WebElement element) {

		ac = new Actions(driver);

		ac.clickAndHold().build().perform();

	}
	// drag_and_drop

	public static void drdr(WebElement source_element, WebElement target_element) {

		ac.dragAndDrop(source_element, target_element).build().perform();

	}
	// double_click

	public static void doclick() {

		ac.doubleClick().build().perform();

	}
	// right_click

	public static void rightclick(WebElement element, WebElement target_element) {

		ac.contextClick(element).build().perform();
		ac.moveToElement(target_element).build().perform();
		click(target_element);

	}
	
	
	// alert_accept

	public static void alacpt() {

		driver.switchTo().alert().accept();

	}
	// alert_dismiss

	public static void aldis() {

		driver.switchTo().alert().dismiss();

	}
	// alert_sendkeys

	public static void alsend(String input) {

		driver.switchTo().alert().sendKeys(input);
	}
	// enter_key

	public static void enterkey() throws Throwable {		//AWT EXCEPTION

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);

	}
	
	
	// frame_index
	public static void inframe(int index) {

		driver.switchTo().frame(index);

	}
	// frame_string
	public static void stframe(String name) {

		driver.switchTo().frame(name);

	}
	
	//frame_ID
	public void idframe(String id) {

		driver.switchTo().frame(id);
	}
	
	// frame_web
	public static void webframe(WebElement frameelement) {

		driver.switchTo().frame(frameelement);

	}
	// back_frame
	public static void backframe() {

		driver.switchTo().parentFrame();

	}
	// close_frame
	public static void closeframe() {

		driver.switchTo().defaultContent();

	}
	// total_no_of_frames
	public static void totalframe() {

		List<WebElement> noofframes = driver.findElements(By.tagName("iframe"));

		int totalframes = noofframes.size();

		System.out.println(totalframes);

	}
	
	public static void allwindowshand() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String ids : windowHandles) {
			
			String titles = driver.switchTo().window(ids).getTitle();
			
			System.out.println(titles);
		}

	}
	
	
	
	
	
	
	

}
