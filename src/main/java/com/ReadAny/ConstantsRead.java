package com.ReadAny;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.automationSample.EnumConstants;

public class ConstantsRead {
	
	public static String ReadC(EnumConstants key) {
		 String Value1 = null;
		try {
			FileInputStream FI = new FileInputStream("C:\\Users\\hirallabandi\\eclipse-workspace\\Brushing_Selenium\\automationSample\\src\\main\\resources\\Constants");
			Properties Prop = new Properties();
			try {
				Prop.load(FI);
				Value1 = Prop.getProperty(key.name().toUpperCase());
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
