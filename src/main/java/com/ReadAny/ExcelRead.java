package com.ReadAny;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;



public class ExcelRead {
	
	
	public static String ReadE(int i, int j) {
		
		String Value1 = null;
		try {
			FileInputStream FISE = new FileInputStream("C:\\Users\\hirallabandi\\eclipse-workspace\\Brushing_Selenium\\automationSample\\src\\test\\resources\\Data.xls");
			
			try {
				Workbook eb = new HSSFWorkbook(FISE);
				Sheet WS = eb.getSheetAt(0);
				Row RW = WS.getRow(i);
				Cell CL = RW.getCell(j);
				Value1 = WS.getRow(i).getCell(j).toString();
			
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Value1;
		
	}
	

}
