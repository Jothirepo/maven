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

public class Read_sp_col {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\jovin\\Pictures\\Screenshots\\Maven_project_sneha\\DD_sample\\SampleData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheetAt(1);

		int noofrows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < noofrows; i++) {

			Row row = sheet.getRow(i);

			Cell cell = row.getCell(1);

			CellType cellType = cell.getCellType();

			switch (cellType) {
			case STRING:

				String stringCellValue = cell.getStringCellValue();

				System.out.println(stringCellValue);
				break;

			case NUMERIC:

				double numericCellValue = cell.getNumericCellValue();

				System.out.println(numericCellValue);
				break;

			default:
				break;
			}
		}

	}

}