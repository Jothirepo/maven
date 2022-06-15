package com.data_driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_all_data {

	public static void main(String[] args) throws Throwable {
		
	File f = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\DD_sample\\SampleData.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet sheet = wb.getSheet("SalesOrders");
	
	int noofrows = sheet.getPhysicalNumberOfRows();
	
	//iterate all data
	
	for (int i = 0; i < noofrows; i++) {
		
		Row row = sheet.getRow(i);
		
		int noofcells = row.getPhysicalNumberOfCells();
		
		for (int j = 0; j < noofcells; j++) {
			
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			
			switch (cellType) {
			case STRING:
				
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
				break;
				
			case NUMERIC:
				
				double numericCellValue = cell.getNumericCellValue();
				int num = (int) numericCellValue;
				
				System.out.println(num);
				
				break;

			default:
				break;
			}
			
		}
	}
		
	}
}
