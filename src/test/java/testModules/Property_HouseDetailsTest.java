package testModules;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import pageObjects.HomePage;
import pageObjects.Property_HouseDetails;
import pageObjects.Property_Menu;
import pageObjects.Property_TopBar;
import testListners.SuiteDriverListner;

public class Property_HouseDetailsTest {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	Property_HouseDetails ob2 = new Property_HouseDetails(driver);
	Property_TopBar ob3 = new Property_TopBar(driver);
	Property_Menu ob4 = new Property_Menu(driver);
	
}
