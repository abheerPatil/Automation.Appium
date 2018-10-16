import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import pageObjects.HomePage;
import pageObjects.Property_Menu;
import pageObjects.Property_Repair;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class demo {
	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	Property_Repair ob = new Property_Repair(driver);
	Property_Menu ob1 = new Property_Menu(driver);
	HomePage ob2 = new HomePage(driver);
	
	@Test
	public void x(){
		ob2.cards.get(0).click();
		ExtraFunctionalityCheck.waitForElement(ob1.repairsCell, driver, 10000);
		ob1.repairsText.click();
		ExtraFunctionalityCheck.waitImplicit(5000);
		ob.swipe(ob.addedFeaturesLabel, "up");
		ob.insertAdditionalFeatures(1, "3", "4", "5", "6");
		ob.insertAdditionalFeatures(2, "3", "4", "5", "6");
		
	}
	
	@Test
	public void x1(){
		
	}
	
}
