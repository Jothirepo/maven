package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;

public class Write_dd {

	public static void main(String[] args) throws IOException  {
		
		WebDriver driver = new ChromeDriver();
		
		File f = new File ("C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\DD_sample\\SampleData.xlsx");
		
		FileInputStream fis  = new FileInputStream(f);				//read the file
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.createSheet("alexa");
		
		Row row = sheet.createRow(0);
		
		Cell cell1 = row.createCell(0);
		
		cell1.setCellValue("1");
		
		wb.getSheet("alexa").getRow(0).createCell(1).setCellValue("hho");
		
		wb.getSheet("alexa").createRow(1).createCell(0).setCellValue("2");
		
		wb.getSheet("alexa").getRow(1).createCell(1).setCellValue("firetv");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		
		File fs = new File ("//qq/qfq");
		
		FileUtils.copyFile(screenshotAs, fs);

	}

}
