package testModules;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.Property_Comparables;
import pageObjects.Property_HouseDetails;
import pageObjects.Property_Menu;
import pageObjects.Property_Seller;
import pageObjects.Property_TopBar;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class Property_Comparables_Redbell {
	
	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	Property_Menu ob2 = new Property_Menu(driver);
	Property_Seller ob3 = new Property_Seller(driver);
	Property_Comparables ob4 = new Property_Comparables(driver);
	Property_HouseDetails ob5 = new Property_HouseDetails(driver);
	IOSTouchAction ob6 = new IOSTouchAction(driver);
	Property_TopBar ob7 = new Property_TopBar(driver);
	
	@BeforeClass
	public void beforeClass(){
		try{
			ob1.homePageHeading.isDisplayed();
			ob1.cards.get(0).click();
			ExtraFunctionalityCheck.waitImplicit(5000);
		}
		catch(Exception e){
			System.out.println("Exception in before class method"+e);
		}
	}
	
	@BeforeMethod
	public void beforeMethod(){
		try{
			ob2.comparablesMapText.click();
			ob2.comparablesText.click();
		}
		catch(Exception e){
			System.out.println("Exception in before method "+e);
		}
	}
	
	@AfterClass
	public void afterClass(){
		try{
			ob7.vcBtn.click();
			ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 10000);
		}
		catch(Exception e){
			System.out.print("Exception in after class method "+e);
		}
	}
	
	
	@Test
	public void comparablesCount(){
		try{
			ob4.comparable1.isDisplayed();
			ob4.comparable2.isDisplayed();
			ob4.swipeTillComparable(4);
			ob4.comparable3.isDisplayed();
			ob4.swipeTillComparable(6);
			ob4.comparable5.isDisplayed();
			ob4.swipeTillComparable(8);
			ob4.comparable7.isDisplayed();
			ob4.swipeTillComparable(10);
			ob4.comparable9.isDisplayed();
			Assert.assertEquals(true, true);
			
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : comparablesCount" +e);
		}
	}
	
	@Test
	public void selectedComparables(){
		try{
			boolean a = ob4.isComparableSelected(ob4.comparable1CheckBox);
			a = a && ob4.isComparableSelected(ob4.comparable2CheckBox);
			ob4.swipeTillComparable(4);
			a = a && ob4.isComparableSelected(ob4.comparable3CheckBox);
			Assert.assertEquals(a, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : selectedComparables" +e);
		}
	}
	
	@Test
	public void atMostFour(){
		try{
			boolean a = ob4.isComparableSelected(ob4.comparable1CheckBox);
			a = a && ob4.isComparableSelected(ob4.comparable2CheckBox);
			ob4.swipeTillComparable(4);
			a = a && ob4.isComparableSelected(ob4.comparable3CheckBox);
			if((a == true)&&(ob4.isComparableSelected(ob4.comparable4checkBox)==false)){
				ob4.comparable4checkBox.click();
			}
			ob4.swipeTillComparable(6);
			ob4.comparable6CheckBox.click();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Ok'")).click();
			ob2.comparablesMapText.click();
			ob2.comparablesText.click();
			ob4.swipeTillComparable(4);
			ob4.comparable4checkBox.click();
			ob2.comparablesMapText.click();
			ob2.comparablesText.click();
			ob4.swipeTillComparable(4);
			ob4.comparable3CheckBox.click();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : atMostFour" +e);
		}
	}

	@Test
	public void costPerSqFt(){
		try{
			int x = ob4.comparable2Cell.getRect().getX();
			ob4.swipeDown();
			String cost = ob4.getComparableRow(8, x).getAttribute("value");
			ob4.swipeTop();
			String a = ob4.getComparableRow(3, x).getAttribute("value");
			String s = ob4.getComparableRow(5, x).getAttribute("value");
			a = a.substring(0, a.indexOf(" "));
			a = a.replace(",", "");
			s = s.substring(1);
			s = s.replace(",", "");
			cost = cost.substring(1);
			cost = cost.replace(",", "");
			double area = Double.parseDouble(a);
			double sold = Double.parseDouble(s);
			int res = (int) (sold/area);
			double check1 = Double.parseDouble(cost);
			int check = (int) check1;
			if(res == check){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : costPerSqFt" +e);
		}
	}
	
	@Test
	public void editFields(){
		try{
			int x = ob4.comparable1Cell.getRect().getX();
			ob4.getComparableRow(2, x).clear();
			ob4.getComparableRow(2, x).sendKeys("1");
			driver.hideKeyboard();
			ob4.getComparableRow(4, x).clear();
			ob4.getComparableRow(4, x).sendKeys("1955");
			driver.hideKeyboard();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : editFields" +e);
		}
	}
	
	@Test
	public void scrolling(){
		try{
			ob4.swipeTillComparable(10);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : scrolling" +e);
		}
	}
	
	@Test
	public void comparablesObjects(){
		try{
			ob4.streetAddressLabel.isDisplayed();
			ob4.distanceLabel.isDisplayed();
			ob4.mainLabel.isDisplayed();
			ob4.yearBuiltLabel.isDisplayed();
			ob4.soldForLabel.isDisplayed();
			ob4.saleDateLabel.isDisplayed();
			ob4.daysOnMarketLabel.isDisplayed();
			ob4.swipeDown();
			ob4.costPerSqFtLabel.isDisplayed();
			ob4.bedroomsLabel.isDisplayed();
			ob4.bathroomsLabel.isDisplayed();
			ob4.garageSizeLabel.isDisplayed();
			ob4.acLabel.isDisplayed();
			ob4.garageConverisonLabel.isDisplayed();
			ob4.exteriorStyleLabel.isDisplayed();
			ob4.notesLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : comparablesObjects" +e);
		}
	}
	
	@Test
	public void subjectProp(){
		try{
			ExtraFunctionalityCheck.waitForElement(ob4.costInBlackBox, driver, 10000);
			ob2.swipe("down");
			ob2.sellerCell.click();
			String street = ob3.streetAddressTextField.getAttribute("value");
			String city = ob3.cityTextField.getAttribute("value");
			String state = ob3.stateTextField.getAttribute("value");
			String zip = ob3.zipCodeTextField.getAttribute("value");
			city = city.substring(0, city.length()-1);
			city = city+", ";
			street = street+" "+city+state+zip; 
			street = street.substring(0, street.length()-1);
			ob2.comparablesText.click();
			String res = ob4.findSubjectPropertyData(1);
			res.trim();
			if(res.equals(street)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : subjectProp" +e);
		}
	}
	
	@Test 
	public void noCountTwice(){
		try{
			try{
				IOSElement ele = (IOSElement)driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeCollectionView[1]"));
				ele.findElement(MobileBy.AccessibilityId("Count Twice"));
				Assert.assertEquals(false, true);
			}
			catch(Exception e){
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : noCountTwice" +e);
		}
	}
	
	@Test
	public void notPopulated(){
		try{
			int x = ob4.comparable1Cell.getRect().getX();
			ob4.swipeDown();
			String ac = ob4.getComparableRow(12, x).getAttribute("value");
			String garage = ob4.getComparableRow(13, x).getAttribute("value");
			String exterior = ob4.getComparableRow(14, x).getAttribute("value");
			if((ac==null)&&(garage.equals("Sq Ft"))&&(exterior==null)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.print("Exception in Test : notPopulated" +e);
		}
	}
	
	@Test
	public void acMenu(){
		try{
			int x = ob4.comparable1Cell.getRect().getX();
			ob4.swipeDown();
			ob4.getComparableRow(12, x).click();
			ob4.none.isDisplayed();
			ob4.centralAC.isDisplayed();
			ob4.windowAC.isDisplayed();
			ob4.evaporativeAC.isDisplayed();
			ob6.tap(PointOption.point(200, 200)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : acMenu "+e);
		}
	}
	
	@Test
	public void exteriorStyleMenu(){
		try{
			int x = ob4.comparable1Cell.getRect().getX();
			ob4.swipeDown();
			ob4.getComparableRow(14, x).click();
			ob5.none.isDisplayed();
			ob5.brickFront.isDisplayed();
			ob5.brick3Sides.isDisplayed();
			ob5.brick4Sides.isDisplayed();
			ob5.cinderBlock.isDisplayed();
			ob5.frameAluminiumSiding.isDisplayed();
			ob5.frameAsbestosSiding.isDisplayed();
			ob5.frameVinylSiding.isDisplayed();
			ob5.frameWoodSiding.isDisplayed();
			ob5.stucco.isDisplayed();
			ob6.tap(PointOption.point(200, 200)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : exteriorStyleMenu "+e);
		}
	}
	
	@Test
	public void reCalculateAvg(){
		try{
			String first = ob4.costInBlackBox.getAttribute("value");
			ob4.swipeTillComparable(4);
			ob4.comparable4checkBox.click();
			String now = ob4.costInBlackBox.getAttribute("value");
			if(!first.equals(now)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : reCalculateAvg "+e);
		}
	}
	
	@Test
	public void screenOrganised(){
		try{
			ob4.comparable1CheckBox.click();
			ob2.comparablesMapText.click();
			ob2.comparablesText.click();
			ob4.comparable2.isDisplayed();
			ob4.comparable4.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : screenOrganised "+e);
		}
	}
	
	@Test
	public void countTwice(){
		try{
			ExtraFunctionalityCheck.waitForElement(ob4.costInBlackBox, driver, 10000);
			ob4.countTwiceRows.get(0).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeButton")).click();
			ob4.countTwiceRows.get(1).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeButton")).click();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Ok'")).click();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : countTwice "+e);
		}
	}
	
	@Test
	public void reportSupplied(){
		try{
			ExtraFunctionalityCheck.waitForElement(ob4.costInBlackBox, driver, 10000);
			ob4.swipeDown();
			ob4.swipeDown();
			ob4.pdfDocument.click();
			ExtraFunctionalityCheck.waitImplicit(5000);
			driver.findElement(MobileBy.iOSNsPredicateString("name CONTAINS 'homevestors-production-pdf'"));
			ob6.longPress(PointOption.point(0, 755)).moveTo(PointOption.point(0, 200)).release().perform();
			try{
				driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeOther' AND name CONTAINS 'valuechek'")).click();
			}
			catch(Exception e){}
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : reportSupplied "+e);
		}
	}
	
}
