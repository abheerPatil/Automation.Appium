package testListners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import utility.DriverClass;

public class SuiteDriverListner implements ISuiteListener{
	
	public static IOSDriver<MobileElement> driver = DriverClass.set();
	
	public void onStart(ISuite suite) {
		
	}

	public void onFinish(ISuite suite) {
	
	}

}
