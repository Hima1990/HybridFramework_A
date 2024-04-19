package Initializer;

import Manager.DriverManger;
import com.ReadAny.ConstantsRead;
import com.automationSample.EnumConstants;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ReadAny.ConstantsRead;

public  class Launch {

	@BeforeMethod
	public static void init() {
		
		WebDriver driver = new ChromeDriver();
		DriverManger.set(driver);
		DriverManger.get().get(ConstantsRead.ReadC(EnumConstants.URL));
		DriverManger.get().manage().window().maximize();
		DriverManger.get().manage().timeouts().implicitlyWait(Duration.ofMillis(120));
		
	

}
	@AfterMethod
	public static void CloseBrowser() {
		
		DriverManger.get().quit();
	}
}