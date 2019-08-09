package org.cts.test.AxisBank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFrame2 {
	public static void main(String[] args) throws IOException {
		File loc=new File("E:\\Selenium\\gowtham01\\AxisBank\\testdata\\Gowtham.xlsx");
		FileInputStream s=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(s);
		Sheet s1=w.getSheet("Sheet1");
		for(int i=0;i<s1.getPhysicalNumberOfRows();i++) {
			Row r = s1.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c = r.getCell(j);
				int Type = c.getCellType();
				//string cell type 1
				if(Type==1) {
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);
				}
				//datecell value type 0
				else if(Type==0) {
					if(DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat si=new SimpleDateFormat("dd-mmm-yy");
				String format = si.format(dateCellValue);
				System.out.println(format);
				
			}
	}
}
	}
	}
	}