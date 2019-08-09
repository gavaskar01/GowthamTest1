package org.cts.test.AxisBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpDate {

	public static void main(String[] args) throws IOException  {
		File  loc=new File("E:\\Selenium\\gowtham01\\AxisBank\\testdata\\Gowtham.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet("Gowtham");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String s1 = c.getStringCellValue();
		if(s1.equals("Gowtham")) {
			c.setCellValue("Karthik");
		}
		FileOutputStream o =new FileOutputStream(loc);
		w.write(o);
		System.out.println("Done");
	}

}
