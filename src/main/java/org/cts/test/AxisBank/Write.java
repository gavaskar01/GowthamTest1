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

public class Write {

	public static void main(String[] args) throws IOException {
		File  loc=new File("E:\\Selenium\\gowtham01\\AxisBank\\testdata\\Gowtham.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.createSheet("Gowtham");
		Row r = s.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("Gowtham");
		FileOutputStream o =new FileOutputStream(loc);
		w.write(o);
		System.out.println("Done");
	}

}
