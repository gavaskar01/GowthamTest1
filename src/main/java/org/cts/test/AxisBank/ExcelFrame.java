package org.cts.test.AxisBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFrame {
	public static void main(String[] args) throws IOException {
		File loc=new File("E:\\Selenium\\gowtham01\\AxisBank\\testdata\\Gowtham.xlsx");
		FileInputStream s=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(s);
		Sheet s1=w.getSheet("Sheet1");
		Row r = s1.getRow(0);
		Cell c = r.getCell(0);
	//to fine the celltype
			int cellType = c.getCellType();
		System.out.println(cellType);
	}

}
