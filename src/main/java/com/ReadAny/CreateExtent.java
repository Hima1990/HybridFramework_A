package com.ReadAny;

import java.io.FileInputStream;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Manager.ExtentManger;

public class CreateExtent {
	
	static ExtentReports ER = new ExtentReports();
	
public static void CreateRep () {
		
	ExtentSparkReporter ESR = new ExtentSparkReporter(System.getProperty("user.dir")+ "/Extent-Report/index.html" );
	ESR.config().setTheme(Theme.DARK);
	ESR.config().setDocumentTitle("This is a report!!!");
	ESR.config().setReportName("Extent Repor");
	ER.attachReporter(ESR);
	
	
}

public static void flushReport() {
	
	ER.flush();
}

public static void CreateTest(String test) {
	
	ExtentManger.set(ER.createTest(test));
	
}

public static void Pass(String messageP) {
	
	ExtentManger.get().pass(messageP);
}

public static void Fail(String messageP) {
	
	ExtentManger.get().fail(messageP);
}
public static void skip(String messageP) {
	
	ExtentManger.get().skip(messageP);
}

}
