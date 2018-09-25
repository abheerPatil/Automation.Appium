package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class DriverClass {
	
  public static IOSDriver<MobileElement> driver = null;
  
  public DriverClass() {
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("automationName", "XCUITest");
      caps.setCapability("platformName", "iOS");
      caps.setCapability("platformVersion", "11.3");
      caps.setCapability("deviceName","Admin’s iPad");
      caps.setCapability("udid", "4e9d674970ddf0f3245628d4172d98924445783f");
      caps.setCapability("noReset", "true");
      caps.setCapability("bundleId","com.homevestors.valuechek2");
      caps.setCapability("xcodeOrgId", "Q3HXH3MWZ2");
      caps.setCapability("xcodeSigningId", "iPhone Developer");
      //caps.setCapability("newCommandTimeout", 60*30);
      caps.setCapability("autoDismissAlerts", true);
      try {
		driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}
  
  public static IOSDriver<MobileElement> set(){
	  new DriverClass();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  return driver;
	  
  }
  
  
}
