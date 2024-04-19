package Manager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentManger {
	
	static ThreadLocal<ExtentTest> TLE = new ThreadLocal<>();
	
	public static  void set(ExtentTest test) {
		
		TLE.set(test);
	}
	
	public static ExtentTest get() {
		
		return TLE.get();
	}
}
