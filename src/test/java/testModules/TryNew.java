package testModules;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_Seller;
import testListners.SuiteDriverListner;

public class TryNew {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	LoginPage ob2 = new LoginPage(driver);
	Property_Seller ob3 = new Property_Seller(driver);
	
	@Test
	public void something(){
		ob1.menuButton.click();
		System.out.println(ob1.checkHeaderOpened(1));
		System.out.println(ob1.checkHeaderOpened(2));
		ob1.swipe("up");
		System.out.println(ob1.checkHeaderOpened(3));
		System.out.println(ob1.checkHeaderOpened(4));
		ob1.swipe("up");
		System.out.println(ob1.checkHeaderOpened(5));
		ob1.swipe("down");
		System.out.println(ob1.checkHeaderOpened(4));
		System.out.println(ob1.checkHeaderOpened(3));
		ob1.swipe("down");
		System.out.println(ob1.checkHeaderOpened(2));
		System.out.println(ob1.checkHeaderOpened(1));
		ob1.propertyPhasesCell.click();
		System.out.println(ob1.checkHeaderOpened(1));
		ob1.loanPhasesCell.click();
		System.out.println(ob1.checkHeaderOpened(2));
		ob1.dateAddedCell.click();
		System.out.println(ob1.checkHeaderOpened(3));
		ob1.teamCell.click();
		System.out.println(ob1.checkHeaderOpened(4));
		ob1.settingsCell.click();
		System.out.println(ob1.checkHeaderOpened(5));
		
		
	}
	
}
