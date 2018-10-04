package testModules;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_Seller;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class HomeScreenTests {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	LoginPage ob2 = new LoginPage(driver);
	Property_Seller ob3 = new Property_Seller(driver);
	
	private static ArrayList<IOSElement> propertyCards = new ArrayList<IOSElement>(); 
	private static IOSElement propertyPhaseCell;
	private static IOSElement menuButton;
	private static IOSElement loanPhaseCell;
	
	
	@BeforeMethod
	public void beforeTest(Method method) throws InterruptedException{
		try{
			
			ob1.homePageHeading.isDisplayed();
			menuButton = ob1.menuButton;
		}
		catch(Exception e){
			ob2.login("kiwitech2", "hvavc2");
			ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 20000);
		}
	}
	
	@AfterClass
	public void afterClass(){
		try{
			try{
				ob2.appName.isDisplayed();
				ob2.login("kiwitech2", "hvavc2");
				ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 20000);
			}
			catch(Exception e){	}
		}
		catch(Exception e){
			System.err.println("EXCEPTION IN AFTER CLASS: HomeScreenTests");
		}
	}
	
	
	@Test
	public void checkHomeElements(){
		try{
			menuButton.isDisplayed();
			ob1.homePageHeading.isDisplayed();
			ob1.searchBar.isDisplayed();
			ob1.notificationBell.isDisplayed();
			ob1.addPropertyBtn.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : checkHomeElements" +e);
		}
	}
	
	@Test
	public void propertiesInView(){
		try{
			propertyCards = ob1.cards;
			int a = propertyCards.size();
			if(a < 10){
				System.out.println("Cant Check, properties less than 10");
				throw new Exception("");
			}
			int x1 = propertyCards.get(0).getRect().getX();
			int x2 = propertyCards.get(3).getRect().getX();
			int x3 = propertyCards.get(6).getRect().getX();
			int x4 = propertyCards.get(9).getRect().getX();
			int y1 = propertyCards.get(2).getRect().getY();
			int y2 = propertyCards.get(1).getRect().getY();
			int y3 = propertyCards.get(0).getRect().getY();
			if((x1==x2)&&(x1==x3)&&(x1==x4)&&(y1==y2)&&(y1==y3)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : propertiesInView" +e);
		}
	}
	
	
	@Test
	public void menuBtnCheck(){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(90, 40)).perform();
			try{
				propertyPhaseCell = ob1.propertyPhasesCell;
				if(propertyPhaseCell.getAttribute("visible").equals("true")){
					ac.tap(PointOption.point(90, 40)).perform();
					Assert.assertEquals(false, true);
				}
				else{
					Assert.assertEquals(true, true);
				}
			}
			catch(Exception e){
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : menuBtnCheck" +e);
		}
	}
	
	@Test
	public void menuCloseOutside(){
		try{
			menuButton.click();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			try{
				if(ob1.propertyPhasesCell.isDisplayed()){
					Assert.assertEquals(false, true);
				}
			}
			catch(Exception e){
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : menuCloseOutside" +e);
		}
	}
	
	@Test
	public void navDrawerScroll(){
		try{
			menuButton.click();
			ob1.swipeTillFound(ob1.logOutBtn, "up");
			ob1.swipeTillFound(ob1.newBtn, "down");
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			try{
				ob1.loanPhasesCell.isDisplayed();
				Assert.assertEquals(false, true);
			}
			catch(Exception e){
				ob1.homePageHeading.isDisplayed();
				Assert.assertEquals(true, true);
				
			}
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : navDrawerScroll" +e);
		}
	}
	
	@Test
	public void navDrawerFolders(){
		try{
			menuButton.click();
			propertyPhaseCell = ob1.propertyPhasesCell;
			loanPhaseCell = ob1.loanPhasesCell;
			propertyPhaseCell.isDisplayed();
			loanPhaseCell.isDisplayed();
			try{
				ob1.dateAddedCell.isDisplayed();
				if(ob1.dateAddedCell.getAttribute("visible").equals("false")){
					ob1.swipeTillFound(ob1.dateAddedCell, "up");
					ob1.dateAddedCell.isDisplayed();
				}
			}
			catch(Exception e){
				ob1.swipeTillFound(ob1.dateAddedCell, "up");
				ob1.dateAddedCell.isDisplayed();
			}
			try{
				ob1.teamCell.isDisplayed();
				if(ob1.teamCell.getAttribute("visible").equals("false")){
					ob1.swipeTillFound(ob1.teamCell, "up");
					ob1.teamCell.isDisplayed();
				}
			}
			catch(Exception e){
				ob1.swipeTillFound(ob1.teamCell, "up");
				ob1.teamCell.isDisplayed();
			}
			try{
				ob1.settingsCell.isDisplayed();
				if(ob1.settingsCell.getAttribute("visible").equals("false")){
					ob1.swipeTillFound(ob1.settingsCell, "up");
					ob1.settingsCell.isDisplayed();
				}
			}
			catch(Exception e){
				ob1.swipeTillFound(ob1.settingsCell, "up");
				ob1.settingsCell.isDisplayed();
			}
			ob1.swipeTillFound(ob1.newBtn, "down");
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ob1.swipeTillFound(ob1.newBtn, "down");
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : navDrawerFolders" +e);
		}
	}
	
	@Test
	public void folderState(){
		try{
			boolean a = true;
			menuButton.click();
			a = a && ob1.checkHeaderOpened(1);
			a = a && ob1.checkHeaderOpened(2);
			ob1.swipe("up");
			a = a && ob1.checkHeaderOpened(3);
			a = a && ob1.checkHeaderOpened(4);
			ob1.swipe("up");
			a = a && ob1.checkHeaderOpened(5);
			ob1.swipeTillFound(ob1.propertyPhasesCell, "down");
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(a, true);
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ob1.swipeTillFound(ob1.propertyPhasesCell, "down");
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : folderState" +e);
		}
	}
	
	@Test
	public void propertyPhases(){
		try{
			menuButton.click();
			try{
				if((ob1.newBtn.getAttribute("visible").equals("true"))&&(ob1.activeBtn.getAttribute("visible").equals("true"))&&(ob1.pendingBtn.getAttribute("visible").equals("true")))
				{
					ob1.purchaseBtn.isDisplayed();
					ob1.archiveBtn.isDisplayed();
				}
				else{
					throw new Exception("");
				}
			}
			catch(Exception e){
				ob1.propertyPhasesCell.click();
				ob1.newBtn.isDisplayed();
				ob1.activeBtn.isDisplayed();
				ob1.pendingBtn.isDisplayed();
				ob1.purchaseBtn.isDisplayed();
				ob1.archiveBtn.isDisplayed();
			}
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : propertyPhases" +e);
		}
	}
	
	@Test
	public void autoSelectedPhases(){
		try{
			boolean a = true;
			menuButton.click();
			try{
				if(ob1.activeBtn.getAttribute("visible").equals("true")){
				a = a && ob1.checkPropertyPhaseSelectedItem(1);
				a = a && ob1.checkPropertyPhaseSelectedItem(2);
				a = a && ob1.checkPropertyPhaseSelectedItem(3);
				}
				else{
					throw new Exception("");
				}
			}
			catch(Exception e){
				ob1.propertyPhasesCell.click();
				a = a && ob1.checkPropertyPhaseSelectedItem(1);
				a = a && ob1.checkPropertyPhaseSelectedItem(2);
				a = a && ob1.checkPropertyPhaseSelectedItem(3);
			}
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(a, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : autoSelectedPhases" +e);
		}
	}
	
	@Test
	public void propertyPhasesNumber(){
		try{
			menuButton.click();
			try{
				if(ob1.activeBtn.getAttribute("visible").equals("true")){
					ob1.newPropCount.isDisplayed();
					ob1.activePropCount.isDisplayed();
					ob1.pendingPropCount.isDisplayed();
					ob1.purchasedPropCount.isDisplayed();
					ob1.archivePropCount.isDisplayed();
				}
				else{
					throw new Exception("");
				}
			}
			catch(Exception e){
				ob1.propertyPhasesCell.click();
				ob1.newPropCount.isDisplayed();
				ob1.activePropCount.isDisplayed();
				ob1.pendingPropCount.isDisplayed();
				ob1.purchasedPropCount.isDisplayed();
				ob1.archivePropCount.isDisplayed();
			}
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : propertyPhasesNumber" +e);
		}
	}
	
	@Test
	public void filterOnProperty(){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			menuButton.click();
			if(ob1.activeBtn.getAttribute("visible").equals("false")){
				ob1.propertyPhasesCell.click();
			}
			if(ob1.checkPropertyPhaseSelectedItem(1) == true){
				ob1.newBtn.click();
			}
			int newProp = ob1.countProperties(ob1.newPropCount);
			if(ob1.checkPropertyPhaseSelectedItem(2) == true){
				ob1.activeBtn.click();
			}
			int activeProp = ob1.countProperties(ob1.activePropCount);
			if(ob1.checkPropertyPhaseSelectedItem(3) == true){
				ob1.pendingBtn.click();
			}
			int pendingProp = ob1.countProperties(ob1.pendingPropCount);
			if(ob1.checkPropertyPhaseSelectedItem(4) == true){
				ob1.purchaseBtn.click();
			}
			int purchasedProp = ob1.countProperties(ob1.purchasedPropCount);
			if(ob1.checkPropertyPhaseSelectedItem(5) == true){
				ob1.archiveBtn.click();
			}
			int archiveProp = ob1.countProperties(ob1.archivePropCount);
			if(newProp>0){
				ob1.newBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				propertyCards = ob1.cards;
				propertyCards.get(propertyCards.size()-1).findElement(MobileBy.AccessibilityId("New"));
				menuButton.click();
				ob1.newBtn.click();
			}
			
			if(activeProp>0){
				ob1.activeBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				propertyCards = ob1.cards;
				propertyCards.get(propertyCards.size()-1).findElement(MobileBy.AccessibilityId("Active"));
				menuButton.click();
				ob1.activeBtn.click();
			}
			
			if(pendingProp>0){
				ob1.pendingBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				propertyCards = ob1.cards;
				propertyCards.get(propertyCards.size()-1).findElement(MobileBy.AccessibilityId("Pending"));
				menuButton.click();
				ob1.pendingBtn.click();
			}
			
			if(purchasedProp>0){
				ob1.purchaseBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				propertyCards = ob1.cards;
				propertyCards.get(propertyCards.size()-1).findElement(MobileBy.AccessibilityId("Purchased"));
				menuButton.click();
				ob1.purchaseBtn.click();
			}
			
			if(archiveProp>0){
				ob1.archiveBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.swipeProperties();
				propertyCards = ob1.cards;
				propertyCards.get(propertyCards.size()-1).findElement(MobileBy.AccessibilityId("Archive"));
				menuButton.click();
				ob1.archiveBtn.click();
			}
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : filterOnProperty" +e);
		}
	}
	
	@Test
	public void loanPhases(){
		try{
			menuButton.click();
			if(ob1.submittedBtn.getAttribute("visible").equals("false")){
				ob1.loanPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(1) == true){
				ob1.propertyPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(2) == false){
				ob1.loanPhasesCell.click();
			}
			ob1.submittedBtn.isDisplayed();
			ob1.inReviewBtn.isDisplayed();
			ob1.deniedBtn.isDisplayed();
			ob1.tabledBtn.isDisplayed();
			ob1.approvedBtn.isDisplayed();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : loanPhases" +e);
		}
	}
	
	@Test
	public void filterOnLoan(){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			menuButton.click();
			try{
				if(ob1.activeBtn.getAttribute("visible").equals("true")){
					ob1.propertyPhasesCell.click();
				}
				throw new Exception("");
			}
			catch(Exception e){	}
			if(ob1.submittedBtn.getAttribute("visible").equals("false")){
				ob1.loanPhasesCell.click();
			}
			if(ob1.checkLoanPhaseSelectedItem(1) == true){
				ob1.submittedBtn.click();
			}
			int submittedProp = ob1.countProperties(ob1.submittedPropCount);
			if(ob1.checkLoanPhaseSelectedItem(2) == true){
				ob1.inReviewBtn.click();
			}
			int inReviewProp = ob1.countProperties(ob1.inReviewPropCount);
			if(ob1.checkLoanPhaseSelectedItem(3) == true){
				ob1.deniedBtn.click();
			}
			int deniedProp = ob1.countProperties(ob1.deniedPropCount);
			if(ob1.checkLoanPhaseSelectedItem(4) == true){
				ob1.tabledBtn.click();
			}
			int tabledProp = ob1.countProperties(ob1.tabledPropCount);
			if(ob1.checkLoanPhaseSelectedItem(5) == true){
				ob1.approvedBtn.click();
			}
			int approvedProp = ob1.countProperties(ob1.approvedPropCount);
			if(submittedProp>0){
				ob1.submittedBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.cards.get(ob1.cards.size()-1).findElement(MobileBy.AccessibilityId("Submitted"));
				menuButton.click();
				ob1.submittedBtn.click();
			}
			
			if(inReviewProp>0){
				ob1.inReviewBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.cards.get(ob1.cards.size()-1).findElement(MobileBy.AccessibilityId("In Review"));
				menuButton.click();
				ob1.inReviewBtn.click();
			}
			
			if(deniedProp>0){
				ob1.deniedBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.cards.get(ob1.cards.size()-1).findElement(MobileBy.AccessibilityId("Denied"));
				menuButton.click();
				ob1.deniedBtn.click();
			}
			
			if(tabledProp>0){
				ob1.tabledBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.cards.get(ob1.cards.size()-1).findElement(MobileBy.AccessibilityId("Tabled"));
				menuButton.click();
				ob1.tabledBtn.click();
			}
			
			if(approvedProp>0){
				ob1.approvedBtn.click();
				ac.tap(PointOption.point(261, 261)).perform();
				ob1.swipeProperties();
				ob1.cards.get(ob1.cards.size()-1).findElement(MobileBy.AccessibilityId("Approved"));
				menuButton.click();
				ob1.approvedBtn.click();
			}
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : filterOnLoan" +e);
		}
	}
	
	@Test
	public void dateAdded(){
		try{
			menuButton.click();
			if(ob1.checkHeaderOpened(1)== true){
				ob1.propertyPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(2)== true){
				ob1.loanPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(3) == false){
				ob1.dateAddedCell.click();
			}
			ob1.threeMonthsAgoBtn.isDisplayed();
			ob1.sixMonthsAgoBtn.isDisplayed();
			ob1.twelveMonthsAgoBtn.isDisplayed();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : dateAdded" +e);
		}
	}
	
	@Test
	public void oneFilterOnly(){
		try{
			boolean a = true ,  b = false , c = false;
			menuButton.click();
			if(ob1.checkHeaderOpened(1)== true){
				ob1.propertyPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(2)== true){
				ob1.loanPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(3) == false){
				ob1.dateAddedCell.click();
			}
			ob1.threeMonthsAgoBtn.click();
			a = ob1.checkDateAddedSelectedItem(1);
			b = ob1.checkDateAddedSelectedItem(2);
			c = ob1.checkDateAddedSelectedItem(3);
			if((a == true)&&(b == false)&&(c == false)){
				ob1.sixMonthsAgoBtn.click();
				b =  ob1.checkDateAddedSelectedItem(1);
				a =  ob1.checkDateAddedSelectedItem(2);
				c =  ob1.checkDateAddedSelectedItem(3);
				if((a == true)&&(b == false)&&(c == false)){
					ob1.twelveMonthsAgoBtn.click();
					c = ob1.checkDateAddedSelectedItem(1);
					b = ob1.checkDateAddedSelectedItem(2);
					a = ob1.checkDateAddedSelectedItem(3);
					if((a ==  true)&&(b == false)&&(c == false)){
						ob1.twelveMonthsAgoBtn.click();
						Assert.assertEquals(true, true);
					}
					else{
						ob1.twelveMonthsAgoBtn.click();
						Assert.assertEquals(false, true);
					}
				}
				else{
					ob1.sixMonthsAgoBtn.click();
					Assert.assertEquals(false, true);
				}

				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.tap(PointOption.point(261, 261)).perform();
			}
			else{
				ob1.threeMonthsAgoBtn.click();
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.tap(PointOption.point(261, 261)).perform();
				Assert.assertEquals(false, true);
			}
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : oneFilterOnly" +e);
		}
	}
	
	@Test
	public void team(){
		try{
			driver.resetApp();
			ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 5000);
			menuButton.click();
			if(ob1.checkHeaderOpened(1)== true){
				ob1.propertyPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(2)== true){
				ob1.loanPhasesCell.click();
			}
			if(ob1.checkHeaderOpened(3) == true){
				ob1.dateAddedCell.click();
			}
			if(ob1.checkHeaderOpened(4) == false){
				ob1.dateAddedCell.click();
			}
			ob1.kiwitech1Btn.isDisplayed();
			ob1.kiwitech2Btn.isDisplayed();
			ob1.kiwitech4Btn.isDisplayed();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : team" +e);
		}
	}
	
	@Test
	public void closeAndOpenCheck(){
		try{
			driver.resetApp();
			ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 5000);
			boolean a = true;
			menuButton.click();
			if (ob1.checkHeaderOpened(1)==false){
				ob1.propertyPhasesCell.click();
			}
			ob1.activeBtn.click();
			ob1.archiveBtn.click();
			if(ob1.checkHeaderOpened(2)==false){
				ob1.loanPhasesCell.click();
			}
			ob1.submittedBtn.click();
			ob1.inReviewBtn.click();
			ob1.swipe("up");
			if(ob1.checkHeaderOpened(3)==false){
				ob1.dateAddedCell.click();
			}
			ob1.threeMonthsAgoBtn.click();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			menuButton.click();
			ob1.swipe("down");
			a = a && ob1.checkPropertyPhaseSelectedItem(1);
			if(ob1.checkPropertyPhaseSelectedItem(2)==false){
				a = a && true;
			}
			a = a && ob1.checkPropertyPhaseSelectedItem(3);
			a = a && ob1.checkPropertyPhaseSelectedItem(5);
			a = a && ob1.checkLoanPhaseSelectedItem(1);
			a = a && ob1.checkLoanPhaseSelectedItem(2);
			ob1.swipe("up");
			a = a && ob1.checkDateAddedSelectedItem(1);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(a, true);
			
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : closeAndOpenCheck" +e);
		}
	}
	
	
	@Test
	public void settingsHeader(){
		try{
			menuButton.click();
			ob1.swipeTillFound(ob1.logOutBtn, "up");
			ob1.pricingProfileBtn.isDisplayed();
			ob1.fAQBtn.isDisplayed();
			ob1.supportBtn.isDisplayed();
			ob1.termsAndConditionBtn.isDisplayed();
			ob1.privacyPolicyBtn.isDisplayed();
			ob1.feedbackBtn.isDisplayed();
			ob1.logOutBtn.isDisplayed();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(PointOption.point(261, 261)).perform();
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : settingsHeader" +e);
		}
	}
	
	@Test
	public void logOut(){
		try{
			menuButton.click();
			ob1.swipeTillFound(ob1.logOutBtn, "up");
			ob1.logOutBtn.click();
			try{
				ob2.appName.isDisplayed();
				ob2.usernameField.isDisplayed();
				Assert.assertEquals(true, true);
			}
			catch(Exception e){
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : logOut" +e);
		}
	}
	
	
	
}
