package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_dd {

	public static void main(String[] args) throws Throwable {
		
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

	}

}
