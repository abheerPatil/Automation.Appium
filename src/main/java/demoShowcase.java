import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_ComparableMap;
import pageObjects.Property_Comparables;
import pageObjects.Property_HouseDetails;
import pageObjects.Property_Menu;
import pageObjects.Property_Seller;
import pageObjects.Property_TopBar;
import utility.ExtraFunctionalityCheck;

public class demoShowcase {

	public static IOSDriver<MobileElement> driver = null;
	
	public void setup () throws IOException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.3");
        caps.setCapability("deviceName","Admin’s iPad");
        caps.setCapability("udid", "4e9d674970ddf0f3245628d4172d98924445783f");
        caps.setCapability("noReset", "true");
        caps.setCapability("app","/Users/kiwitech/Downloads/ValueChek.ipa");
        caps.setCapability("xcodeOrgId", "Q3HXH3MWZ2");
        caps.setCapability("xcodeSigningId", "iPhone Developer");
        caps.setCapability("newCommandTimeout", 60*300);				
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        System.out.println("STARTED");
	}
	
	
	
	public boolean checkIflogin(){
		try{
			LoginPage ob = new LoginPage(driver);
			ob = new LoginPage(driver);
			ob.usernameLabel.isDisplayed();
			ob.passwordLabel.isDisplayed();
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean login(){
		try{
			LoginPage ob = new LoginPage(driver);
			HomePage ob1 = new HomePage(driver);
			if(checkIflogin()==true){
			ob.usernameField.clear();	
			ob.usernameField.sendKeys("kiwitech2");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob.passwordField.sendKeys("hvavc2");
			ob.loginBtn.click();
			ExtraFunctionalityCheck.wait(ob1.homePageHeading, driver);
			}
			ob1.homePageHeading.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.out.println("Exception in login"+e);
			return false;
		}
	}
	
	public boolean createNewProperty(){
	//	HomePage ob1 = new HomePage(driver);
		Property_Seller ob2 = new Property_Seller(driver);
		try{
			//ob1.addPropertyBtn.click();
//1			ob1.findPropByIndex(200, 0).click();
			ExtraFunctionalityCheck.wait(ob2.topBar, driver);
			ob2.heading1.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.out.println("Exception in createNewProperty"+e);
			return false;
		}
	}
	
	public boolean addSellerInfo(){
		
		Property_Seller ob2 = new Property_Seller(driver);
		Property_TopBar ob3 = new Property_TopBar(driver);
		try{
			ob2.nameTextField.click();
			driver.getKeyboard().sendKeys("10906 Jardin Way");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob2.appointmentField.click();
			ob2.selectPicker(1, "next");
			ob2.selectPicker(1, "next");
			ob2.selectPicker(1, "next");
			ob2.selectPicker(1, "next");
			ob2.selectPicker(2, "next");
			ob2.selectPicker(2, "next");
			ob2.selectPicker(2, "next");
			ob2.selectPicker(2, "next");
			ob2.teamField.click();
			ob2.teamField.click();
			driver.findElement(MobileBy.AccessibilityId("Kiwi1 Tech")).click();
			ob2.redBellIDTextField.sendKeys("20596923-5");
			ob2.importPropertyBtn.click();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name = 'OK']")).click();
			ob2.firstNameTextField.sendKeys("John");
			ob2.lastNameTextField.sendKeys("Carter");
			ob2.streetAddressTextField.sendKeys("10906 Jardin Way");
			ob2.cityTextField.sendKeys("Charlotte");
			ob2.stateTextField.sendKeys("NC");
			ob2.zipCodeTextField.sendKeys("28215");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
//2			ob2.swipe("up");
			ob2.mobilePhoneTextField.sendKeys("7183954794");
			ob2.emailTextField.sendKeys("johncater@hva.com");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob2.notesTextField.sendKeys("This one-of-a-kind, waterfront mansion with 4 stories and gated entrance is a California inspired oasis.");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob3.clickSaveChangesBtn();
			ExtraFunctionalityCheck.wait(ob2.heading1, driver);
			return true;
		}
		catch(Exception e){
			System.out.println("Exception in addSellerInfo"+e);
			return false;
		}
	}
	
	
	public boolean addHouseDetails(){
		
		Property_TopBar ob3 = new Property_TopBar(driver);
		Property_HouseDetails ob4 = new Property_HouseDetails(driver);
		Property_Menu ob5 = new Property_Menu(driver);
		try{
			ob5.houseDetailsText.click();
			ExtraFunctionalityCheck.wait(ob4.zillowLabel, driver);
			ob4.addOnTextField.sendKeys("100");
			ob4.addOnClassDropDown.click();
			ob4.Class2.click();
			ob4.homeStyleDropDown.click();
			ob4.Story3.click();
			ob4.exteriorStyleDropDown.click();
			ob4.frameAluminiumSiding.click();
			ob4.garageSizeDropDown.click();
			ob4.oneCar.click();
			ob4.detachedCheckBox.click();
			ob4.garageConversionTextField.sendKeys("50");
			ob4.garageConversionDropDown.click();
			ob4.Class3.click();
			ob4.acDropDown.click();
			ob4.centralAC.click();
			ob4.poolDropDown.click();
			ob4.Class3.click();
			ob4.hotTubDropDown.click();
			ob4.Class3.click();
			ob4.addFeaturesBtn.click();
//3			ob4.swipe("up");
			ob4.fillAdditionalFeatures(1, "2", " ", "3");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob4.pricingProfileDropDown.click();
			ob4.selectPricingProfile("now");
			ob4.notesTextView.sendKeys("No storage Building and We are not inserting house dimensions");
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).click();
			ob3.clickSaveChangesBtn();
			ExtraFunctionalityCheck.wait(ob5.houseDetailsCell, driver);
			if(ob5.houseDetailsTick.isDisplayed()){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.out.println("Exception in addHouseDetails"+e);
			return false;
		}
	}
	
	
	public boolean checkComparables(){
		Property_Menu ob5 = new Property_Menu(driver);
		Property_Comparables ob6 = new Property_Comparables(driver);
		try{
			ob5.comparablesText.click();
			boolean a = true;
			a = a && ob6.verifyCheckBoxIsSeleceted(ob6.comparable1CheckBox);
			a = a && ob6.verifyCheckBoxIsSeleceted(ob6.comparable2CheckBox);
//4			ob6.swipeTillComparable(4);
			a = a && ob6.verifyCheckBoxIsSeleceted(ob6.comparable3CheckBox);
			ob6.comparable3CheckBox.click();
			ob6.comparable4checkBox.click();
			a = a && ob6.verifyCheckBoxIsSeleceted(ob6.comparable4checkBox);
			if((a == true) && (ob5.comparablesAmount.equals("$109.69"))){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.out.println("Exception in checkComparables"+e);
			return false;
		}
	}
	
	public boolean comparableMap(){	//NEED TO CHECK
		try{
			Property_Menu ob5 = new Property_Menu(driver);
			Property_ComparableMap ob7 = new Property_ComparableMap(driver);
			ob5.comparablesMapText.click();
			ob7.subjectPropertyPin.click();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeMap'")).click();		//NOT Working
			ob7.zoom(ob7.subjectPropertyPin);
			ob7.mapButton.click();
			ob7.satelliteButton.click();
			if(ob7.isSelectedBtn(ob7.satelliteButton)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.out.println("Exception in comparableMap"+e);
			return false;
		}
	}
	
/*	
	public boolean neigborhood(){	//NEED TO CHECK
		Property_Menu ob5 = new Property_Menu(driver);
		Property_NeighborhoodClass ob8 = new Property_NeighborhoodClass(driver);
		try{
			ob5.neighbourhoodClassText.click();
			ob8.zoomOrPinch("zoom");
			ob8.zoomOrPinch("zoom");
			ob8.dropPinByCoordinates(573, 396);
			ob8.goodPin.click();
			ob8.dropPinByCoordinates(749, 400);
			ob8.commercialPin.click();
			ob8.dropPinByCoordinates(853, 305);
			ob8.schoolPin.click();
			ob8.tapOnCoordinate(749, 400);
			ob8.arrowButton.click();
			ob8.removeBtn.click();
			ob8.dropDown.click();
			ob8.selectItem(5);
			ob8.dragAndMove(20, 30, 60, 50);
			ob8.dropPin.click();
			ob8.excellentPin.click();
			return true;
		}
		catch(Exception e){
			System.out.println("Exception in neigborhood"+e);
			return false;
		}
	}
*/	
	public boolean fillRepairs(){
		try{
			return true;
		}
		catch(Exception e){
			System.out.println("Exception in fillRepairs"+e);
			return false;
		}
	}
	
	public String result(boolean a){
		if(a == true){
			return "Pass";
		}
		else{
			System.exit(0);
			return "Fail";
		}
	}
	
	public static void main(String ar[]) throws IOException, InterruptedException{
		demoShowcase obj = new demoShowcase();
		obj.setup();
		HomePage ob1 = new HomePage(driver);
		ob1.menuButton.click();
		ob1.swipe("up");
		ob1.swipe("up");
		ob1.swipe("up");
	}
	
}
