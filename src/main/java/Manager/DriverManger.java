package Manager;

import org.openqa.selenium.WebDriver;

public class DriverManger {
	
	static ThreadLocal<WebDriver> TLDriver = new ThreadLocal<>();
	
	public static void  set(WebDriver driver) {
		
		TLDriver.set(driver);
		
	}
	
	public static WebDriver get() {
		
		return TLDriver.get();
	}

}
