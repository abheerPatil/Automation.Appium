package testModules;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_Menu;
import pageObjects.Property_Seller;
import pageObjects.Property_TopBar;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class New_PropertyTests {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	Property_Seller ob2 = new Property_Seller(driver);
	Property_TopBar ob3 = new Property_TopBar(driver);
	Property_Menu ob4 = new Property_Menu(driver);
	LoginPage ob5 = new LoginPage(driver);
	IOSTouchAction ac = new IOSTouchAction(driver);
	public static int countNew = 0;
	
	@BeforeClass
	public void beforeClass(){
		try{
			try{
				ob1.homePageHeading.isDisplayed();
			}
			catch(Exception e){
				ob5.login("kiwitech2", "hvavc2");
				ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 15000);
			}
			ob1.menuButton.click();
			if(ob1.checkHeaderOpened(1) == false){
				ob1.propertyPhasesCell.click();
			}
			countNew = Integer.parseInt(ob1.newPropCount.getAttribute("name"));
			ob1.menuButton.click();
		}
		catch(Exception e){
			ob1.menuButton.click();
			countNew = Integer.parseInt(ob1.newPropCount.getAttribute("name"));
			ob1.menuButton.click();
		}
	}
	
	@Test
	public void newPropertyBtn(){
		try{
			ob1.addPropertyBtn.click();
			try{
				ob2.heading1.isDisplayed();
				ob3.clickVCBtn();
				Assert.assertEquals(true, true);
			}
			catch(Exception e){
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : newPropertyBtn - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void newPropertyCheck(){
		try{
				try{
					ob2.heading1.isDisplayed();
					ob3.clickVCBtn();
				}
				catch(Exception e){}
				try{
					ob1.menuButton.click();
					ob1.activeBtn.isDisplayed();
				}
				catch(Exception e){
					ob1.menuButton.click();
				}
				int a = Integer.parseInt(ob1.newPropCount.getAttribute("name"));
				boolean res = a - countNew == 1? true : false;
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.tap(PointOption.point(261, 261)).perform();
				Assert.assertEquals(res, true);
				
		}
		catch(Exception e){
			try{
				ob1.activeBtn.isDisplayed();
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.tap(PointOption.point(261, 261)).perform();	
			}
			catch(Exception f){
			}
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : newPropertyCheck - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void tapPropertyOne(){
		try{
			ob1.cards.get(0).click();
			ob2.heading1.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : tapPropertyOne - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void sellerPage(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0);
			}
			ob2.heading1.isDisplayed();
			ob2.nameTextField.isDisplayed();
			ob2.appointmentField.isDisplayed();
			ob2.phaseField.isDisplayed();
			ob2.teamField.isDisplayed();
			ob2.redBellIDTextField.isDisplayed();
			ob2.firstNameTextField.isDisplayed();
			ob2.lastNameTextField.isDisplayed();
			ob2.streetAddressTextField.isDisplayed();
			ob2.cityTextField.isDisplayed();
			ob2.stateTextField.isDisplayed();
			ob2.zipCodeTextField.isDisplayed();
			ob2.swipe("up");
			ob2.phoneNumberTextField.isDisplayed();
			ob2.mobilePhoneTextField.isDisplayed();
			ob2.homePhoneTextField.isDisplayed();
			ob2.workPhoneTextField.isDisplayed();
			ob2.emailTextField.isDisplayed();
			ob2.notesTextField.isDisplayed();
			ob2.swipe("down");
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			ob2.swipe("down");
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : sellerPage - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void defaultPhase(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0);
			}
			String phase = ob2.phaseField.getAttribute("name");
			if(phase.equals("New")){
				ob2.phaseField.click();
				driver.findElement(MobileBy.AccessibilityId("New"));
				driver.findElement(MobileBy.AccessibilityId("Active"));
				driver.findElement(MobileBy.AccessibilityId("Submitted"));
				driver.findElement(MobileBy.AccessibilityId("Pending"));
				driver.findElement(MobileBy.AccessibilityId("Purchased"));
				driver.findElement(MobileBy.AccessibilityId("Archive"));
				ac.tap(PointOption.point(200, 100)).perform();
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : deafultPhase - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void charLimit(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			boolean res = true;
			ob2.nameTextField.clear();
			ob2.nameTextField.sendKeys("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
			driver.hideKeyboard();
			String a = ob2.nameTextField.getAttribute("value");
			if(a.equals("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST")){
				res = res && true;
			}
			else{
				res = false;
			}
			ob2.nameTextField.clear();
			driver.hideKeyboard();
			ob2.swipe("up");	
			ob2.notesTextField.clear();
			String b = "It  doesn’t  matter  what  type  of  ugly  home  you  have, HomeVestors  would  like  to  make  a  no  obligation  cash  offer  to purchase your home for cash. ";
			ob2.notesTextField.sendKeys(b+"123");
			driver.hideKeyboard();
			if(ob2.notesTextField.getAttribute("value").equals(b)){
				res = res && true;
			}
			else{
				res = false;
			}
			ob2.notesTextField.clear();
			driver.hideKeyboard();
			ob2.swipe("down");
			Assert.assertEquals(res, true);
			
		}
		catch(Exception e){	
			driver.resetApp();
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : charLimit - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void fillingSeller(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			ob2.nameTextField.clear();
			ob2.nameTextField.sendKeys("Project");
			ob2.appointmentField.click();
			ob2.selectPicker(0, "next");
			ob2.selectPicker(0, "next");
			ob2.selectPicker(0, "next");
			ob2.selectPicker(0, "next");
			ob2.selectPicker(1, "next");
			ob2.selectPicker(1, "next");
			ob2.selectPicker(2, "previous");
			ac.tap(PointOption.point(200, 100)).perform();
			ob2.firstNameTextField.sendKeys("Alfred");
			driver.hideKeyboard();
			ob2.lastNameTextField.sendKeys("Morrison");
			driver.hideKeyboard();
			ob2.streetAddressTextField.sendKeys("1925 Pensione Pl");
			driver.hideKeyboard();
			ob2.cityTextField.sendKeys("Wenatchee");
			driver.hideKeyboard();
			ob2.stateTextField.sendKeys("WA");
			driver.hideKeyboard();
			ob2.zipCodeTextField.sendKeys("98801");
			driver.hideKeyboard();
			ob2.mobilePhoneTextField.sendKeys("7183954794");
			driver.hideKeyboard();
			ob2.emailTextField.sendKeys("johncater@hva.com");
			driver.hideKeyboard();
			ob2.notesTextField.sendKeys("Enjoy this home located in Western Heights.Close to schools and downtown.This 4 bedroom, 2 bath has great floor plan ready for your personal touch to decorate.");
			driver.hideKeyboard();
			ob3.clickSaveChangesBtn();
			while(ob3.saveChangesBtn.getAttribute("visible").equals("false")){}
			ob3.clickVCBtn();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			driver.resetApp();
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : fillingSeller - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void wrongEmail(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			ob2.heading1.isDisplayed();
			ob2.swipe("up");
			ob2.emailTextField.clear();
			ob2.emailTextField.sendKeys("ABCH");
			driver.hideKeyboard();
			ob2.emailErrorMessage.isDisplayed();
			ob2.emailTextField.clear();
			ob2.emailTextField.sendKeys("johncarter@hva.com");
			driver.hideKeyboard();
			ob3.clickVCBtn();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			try{
				ob3.clickVCBtn();
			}
			catch(Exception f){}
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : wrongEmail - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void wrongState(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			ob2.stateTextField.clear();
			ob2.stateTextField.sendKeys("lo");
			driver.hideKeyboard();
			driver.findElement(By.xpath("//XCUIElementTypeButton[@name = 'OK']")).click();
			try{
				if(ob2.stateTextField.getAttribute("value")==null){
					ob3.clickVCBtn();
					Assert.assertEquals(true, true);
				}
				else{
					Assert.assertEquals(false, true);
				}
			}
			catch(Exception e){
				ob3.clickVCBtn();
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			try{
				ob3.clickVCBtn();
			}
			catch(Exception f){}
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : wrongState - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void editingSeller(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			ob2.nameTextField.sendKeys(" 1925 Pensione Pl");
			driver.hideKeyboard();
			ob2.stateTextField.clear();
			ob2.stateTextField.sendKeys("WA");
			driver.hideKeyboard();
			ob2.emailTextField.clear();
			ob2.emailTextField.sendKeys("alfred_morrison@hva.com");
			driver.hideKeyboard();
			ob3.clickSaveChangesBtn();
			while(ob3.saveChangesBtn.getAttribute("visible").equals("false")){}
			ob3.clickVCBtn();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			try{
				ob3.clickVCBtn();
			}
			catch(Exception f){}
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : editingSeller - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void tileCheck(){
		try{
			try{
				ob1.homePageHeading.isDisplayed();
			}
			catch(Exception e){
				ob3.clickVCBtn();
			}
			ob1.homePageHeading.isDisplayed();
			MobileElement element = ob1.cards.get(0);
			try{
				element.findElement(By.xpath("//XCUIElementTypeStaticText[@name = 'Project 1925 Pensione Pl']"));
				element.findElement(By.xpath("//XCUIElementTypeStaticText[@name = '1925 Pensione Pl Wenatchee, WA 98801']"));
				element.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name , 'appt.')]")).getAttribute("name");
				Assert.assertEquals(true, true);
			}
			catch(Exception e){
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : tileCheck - New_PropertyTests"+e);
		}
	}
	
	@Test
	public void redBell(){
		try{
			try{
				ob2.heading1.isDisplayed();
			}
			catch(Exception e){
				ob1.cards.get(0).click();
			}
			ExtraFunctionalityCheck.waitForElement(ob2.heading1, driver, 10000);
			ob2.redBellIDTextField.sendKeys("20596923-5");
			driver.hideKeyboard();
			ob2.importPropertyBtn.click();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'OK'")).click();
			ob4.comparablesCell.click();
			if(ob4.comparablesAmount.getAttribute("value").equals("$102.70")){
				ob3.clickVCBtn();
				Assert.assertEquals(true, true);
			}
			else{
				ob3.clickVCBtn();
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			try{
				ob3.clickVCBtn();
			}
			catch(Exception f){}
			Assert.assertEquals(false, true);
			System.out.print("Exception is Test : redBell - New_PropertyTests"+e);
		}
	}
	
	
	
	
	
	
	
}
