
package com.automationSample;

import Initializer.Launch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FirstTest extends Launch {
	
	 Logger Log =  LogManager.getLogger();
	
	@Test
	public  void test1() {

		Log.info("Pass");
		
	}

public  void test2() {
		
		Log.info("Pass");
		
	}
}
