package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_sp_data {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\DD_sample\\SampleData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("SalesOrders");
		
		//specific cell data

		Row row = sheet.getRow(3);

		Cell cell = row.getCell(3);

		CellType cellType = cell.getCellType();

		if (cellType.equals(cellType.STRING)) {

			String stringCellValue = cell.getStringCellValue();

			System.out.println(stringCellValue);
		}

		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int num = (int) numericCellValue;
			
			System.out.println(num);

		}
	}

}
