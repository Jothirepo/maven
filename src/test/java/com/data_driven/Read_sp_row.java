package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.print.DocFlavor.STRING;

import org.apache.poi.hpsf.NoFormatIDException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_sp_row {

	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\DD_sample\\SampleData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(1);

		Row row = sheetAt.getRow(2);

		int noofcells = row.getPhysicalNumberOfCells();
		
		for (int i = 0; i <noofcells; i++) {
			
			Cell cell = row.getCell(i);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(cellType.STRING)) {
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
				
				System.out.println("***********");
			}
			
			
			else if (cellType.equals(cellType.NUMERIC)) {
				
				double numericCellValue = cell.getNumericCellValue();
				
				int num = (int) numericCellValue;
				
				System.out.println(num);
				
			}
		}

	}
}
