package com.fleetain.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fleetain.TestBase.TestBase;

public class ExcelSheetRead extends TestBase {

	public static final Logger logger  = Logger.getLogger(ExcelSheetRead.class.getName());
	
	static Workbook wbook;
	static Sheet sheet;
	
	public static Object[][] getXlsTestData(String excelPath,String sheetName){
		
		FileInputStream file=null;
		try {
			file=new FileInputStream(excelPath);
		
		}catch(FileNotFoundException filenot){
			filenot.printStackTrace();
		}
		
		try {
			wbook= WorkbookFactory.create(file);
		}catch(InvalidFormatException ine) {
			ine.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
		sheet=wbook.getSheet(sheetName);
		Object[][] data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];    // Data Read From Excel Sheet
		for(int i=0;i<sheet.getLastRowNum();i++) {                                      
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		
	}
	
	
	//*************Read Excel Sheet Data Using Apache POI****************************** 
	
	public static Object[][] getXlsxTestData(String excellocation, String sheetName) {
		try {
			logger.info("Creating excel object:-"+excellocation);
			String dataSets[][] = null;
			
			FileInputStream file = new FileInputStream(new File(excellocation));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheet(sheetName);
			// count number of active tows
			int totalRow = sheet.getLastRowNum() + 1;
			// count number of active columns in row
			int totalColumn = sheet.getRow(0).getLastCellNum();
			// Create array of rows and column
			dataSets = new String[totalRow-1][totalColumn];
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();

			int i = 0;
			int t = 0;
			
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (i++ != 0) {
					int k = t;
					t++;
					// For each row, iterate through all the columns
					Iterator<Cell> cellIterator = row.cellIterator();
					int j = 0;
					while (cellIterator.hasNext()) {

						Cell cell = cellIterator.next();
						// Check the cell type and format accordingly
						switch (cell.getCellType()) {
						case Cell.CELL_TYPE_NUMERIC:
							System.out.print(k+",");
							System.out.print(j+",");
							dataSets[k][j++] = cell.getStringCellValue();
							System.out.println(cell.getNumericCellValue());
							break;
						case Cell.CELL_TYPE_STRING:
							System.out.print(k+",");
							System.out.print(j+",");
							dataSets[k][j++] = cell.getStringCellValue();
							System.out.println(cell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_BOOLEAN:
							System.out.print(k+",");
							System.out.print(j+",");
							dataSets[k][j++] = cell.getStringCellValue();
							System.out.println(cell.getStringCellValue());
							break;
						case Cell.CELL_TYPE_FORMULA:
							System.out.print(k+",");
							System.out.print(j+",");
							dataSets[k][j++] = cell.getStringCellValue();
							System.out.println(cell.getStringCellValue());
							break;
						}
					}
					System.out.println("");
				}
			}

			file.close();
			return dataSets;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
