package testModules;

import java.lang.reflect.Method;

import org.testng.Assert;
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
import pageObjects.Property_HouseDetails;
import pageObjects.Property_Menu;
import pageObjects.Property_Seller;
import pageObjects.Property_TopBar;
import testListners.SingleDataProvider;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class Property_HouseDetailsTest {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	Property_HouseDetails ob2 = new Property_HouseDetails(driver);
	Property_TopBar ob3 = new Property_TopBar(driver);
	Property_Menu ob4 = new Property_Menu(driver);
	Property_Seller ob5 = new Property_Seller(driver);
	
	
	@BeforeClass
	public void beforeClass(){
		try{
			driver.resetApp();
			ExtraFunctionalityCheck.waitForElement(ob1.homePageHeading, driver, 10000);
			ob1.cards.get(0).click();
		}
		catch(Exception e){
			
		}
	}
	
	@BeforeMethod
	public void beforeTest(Method m){
		try{
			if(!(m.getName().equals("projectNameOnTop") || m.getName().equals("houseDetailsBtn"))){
				ExtraFunctionalityCheck.waitForElement(ob4.houseDetailsText, driver, 10000);
				ob4.houseDetailsText.click();
				ExtraFunctionalityCheck.waitImplicit(6000);
			}
		
		}
		catch(Exception e){
			
		}
	}
	

	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void projectNameOnTop(String name){
		try{
			boolean result = ob3.checkProjectName(name);
			Assert.assertEquals(result, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : projectNameOnTop , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void houseDetailsBtn(){
		try{
			ExtraFunctionalityCheck.waitForElement(ob4.houseDetailsText, driver, 10000);
			ob4.houseDetailsText.click();
			ob2.heading1.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : houseDetailsBtn , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void houseDetailsSelection(){
		try{
			boolean result = ob4.checkSelection(2);
			Assert.assertEquals(result, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : houseDetailsSelection , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void houseDetailsCell(){
		try{
			ob2.heading1.isDisplayed();
			try{
				if(ob4.sellerText.getAttribute("visible").equals("true")){
					Assert.assertEquals(false, true);
				}
				else{
					Assert.assertEquals(true, true);
				}
			}
			catch(Exception e){
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : houseDetailsCell , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void screenSections(){
		try{
			ob2.heading1.isDisplayed();
			ob2.swipe("up");
			ob2.heading2.isDisplayed();
			ob2.pricingProfileLabel.isDisplayed();
			ob2.heading3.isDisplayed();
			ob2.swipe("down");
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			ob2.swipe("down");
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : screenSections , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void checkZillowField(){
		try{
			ExtraFunctionalityCheck.waitForElement(ob2.yearBuildLabel, driver, 5000);
			String year = ob2.yearBuildField.getAttribute("value");
			String bedrooms = ob2.bedroomsField.getAttribute("value");
			String bathrooms = ob2.bathroomsField.getAttribute("value");
			String main = ob2.mainField.getAttribute("value");
			if((year != null) && (bathrooms != null) && (bedrooms != null) && (main != null)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : checkZillowField , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void houseDetailsCheckmark(){
		try{
			String year = ob2.yearBuildField.getAttribute("value");
			String main = ob2.mainField.getAttribute("value");
			if((year != null) && (main != null)){
				ob4.houseDetailsTick.isDisplayed();
				Assert.assertEquals(true, true);
			}
			else{
				ob4.houseDetailsDash.isDisplayed();
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : houseDetailsCheckmark , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void zillowText(){
		try{
			ob2.zillowLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : zillowText , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void zillowLogo(){
		try{
			ob2.heading1.isDisplayed();
			ob2.swipe("up");
			ob2.copyrightLabel.isDisplayed();
			ob2.seeMoreLabel.isDisplayed();
			ob2.zillowLogo.isDisplayed();
			ob2.swipe("down");
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			ob2.swipe("down");
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : zillowLogo , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void clickableLogo(){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			ob2.heading1.isDisplayed();
			ob2.swipe("up");
			ob2.zillowLogo.click();
			ExtraFunctionalityCheck.waitImplicit(10000);
			String urlCheck = ob2.url.getAttribute("value");
			ac.longPress(PointOption.point(0, 755)).moveTo(PointOption.point(0, 200)).release().perform();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeOther' AND name CONTAINS 'valuechek'")).click();
			ExtraFunctionalityCheck.waitForElement(ob2.heading3, driver, 10000);
			ob2.swipe("down");
			if(urlCheck.contains("Zillow")){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			ob2.swipe("down");
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : clickableLink , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void offlineBrandingCheck(){
		try{
			boolean result ;
			ExtraFunctionalityCheck.toggleWifi(driver);
			try{
				ob2.zillowLabel.isDisplayed();
				ob2.swipe("up");
				ob2.zillowLogo.isDisplayed();
				result = true;
				ob2.swipe("down");
			}
			catch(Exception e){
				result = false;
				ob2.swipe("down");
			}
			ExtraFunctionalityCheck.toggleWifi(driver);
			Assert.assertEquals(result, true);
		}
		catch(Exception e){
			ExtraFunctionalityCheck.toggleWifi(driver);
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : offlineBrandingCheck , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass=SingleDataProvider.class)
	public void addressUpdate(String street, String city, String state, String zip){
		try{
			ob2.heading1.isDisplayed();
			ob4.swipe("down");
			ob4.sellerCell.click();
			ob5.streetAddressTextField.clear();
			ob5.streetAddressTextField.sendKeys(street);
			driver.hideKeyboard();
			ob5.cityTextField.clear();
			ob5.cityTextField.sendKeys(city);
			driver.hideKeyboard();
			ob5.stateTextField.clear();
			ob5.stateTextField.sendKeys(state);
			driver.hideKeyboard();
			ob5.zipCodeTextField.clear();
			ob5.zipCodeTextField.sendKeys(zip);
			driver.hideKeyboard();
			ob3.saveChangesBtn.click();
			while(ob3.saveChangesBtn.getAttribute("visible").equals("false")){}
			ob4.houseDetailsText.click();
			ExtraFunctionalityCheck.waitForElement(ob2.zillowLabel, driver, 10000);
			ob2.zillowLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addressUpdate , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass=SingleDataProvider.class)
	public void editZillowFields(String year, String bed, String bath, String main ){
		try{
			ob2.yearBuildField.clear();
			ob2.yearBuildField.sendKeys(year);
			driver.hideKeyboard();
			ob2.bedroomsField.clear();
			ob2.bedroomsField.sendKeys(bed);
			driver.hideKeyboard();
			ob2.bathroomsField.clear();
			ob2.bathroomsField.sendKeys(bath);
			driver.hideKeyboard();
			ob2.mainField.clear();
			ob2.mainField.sendKeys(main);
			driver.hideKeyboard();
			try{
				ob2.zillowLabel.isDisplayed();
				Assert.assertEquals(false, true);
			}
			catch(Exception e){
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : editZillowFields , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void addOnField(String addOn){
		try{
			ob2.heading1.isDisplayed();
			ob2.addOnTextField.clear();
			ob2.addOnTextField.sendKeys(addOn);
			driver.hideKeyboard();
			String res = ob2.addOnTextField.getAttribute("value");
			if(res.equals(addOn+" Sq Ft")){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addOnField , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void addOnDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.addOnClassDropDown.click();
			ob2.none.isDisplayed();
			ob2.Class1.isDisplayed();
			ob2.Class2.isDisplayed();
			ob2.Class3.isDisplayed();
			boolean res = ob2.selectAddOn(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addOnDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void homeStyleDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.homeStyleDropDown.click();
			ob2.none.isDisplayed();
			ob2.StorySingle.isDisplayed();
			ob2.Story2.isDisplayed();
			ob2.Story3.isDisplayed();
			ob2.biLevel.isDisplayed();
			ob2.triLevel.isDisplayed();
			boolean res = ob2.selectHomeStyle(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : homeStyleDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void exteriorStyleDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.exteriorStyleDropDown.click();
			ob2.none.isDisplayed();
			ob2.brickFront.isDisplayed();
			ob2.brick3Sides.isDisplayed();
			ob2.brick4Sides.isDisplayed();
			ob2.cinderBlock.isDisplayed();
			ob2.frameAluminiumSiding.isDisplayed();
			ob2.frameAsbestosSiding.isDisplayed();
			ob2.frameVinylSiding.isDisplayed();
			ob2.frameWoodSiding.isDisplayed();
			ob2.stucco.isDisplayed();
			boolean res = ob2.selectExteriorStyle(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : exteriorStyleDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void garageSizeDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.garageSizeDropDown.click();
			ob2.noGarage.isDisplayed();
			ob2.oneCar.isDisplayed();
			ob2.twoCar.isDisplayed();
			ob2.threeCar.isDisplayed();
			boolean res = ob2.selectGargeSize(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : garageSizeDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass = SingleDataProvider.class)
	public void tapGarageCheckBox(String option){
		try{
			ob2.heading1.isDisplayed();
			if(option.equalsIgnoreCase("yes")){
				ob2.detachedCheckBox.click();
			}
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : tapGarageCheckBox , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void garageConversionField(String size){
		try{
			ob2.heading1.isDisplayed();
			ob2.garageConversionTextField.clear();
			ob2.garageConversionTextField.sendKeys(size);
			driver.hideKeyboard();
			String res = ob2.garageConversionTextField.getAttribute("value");
			if(res.equals(size+" Sq Ft")){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : garageConversionField , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void garageConversionDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.garageConversionDropDown.click();
			ob2.none.isDisplayed();
			ob2.Class1.isDisplayed();
			ob2.Class2.isDisplayed();
			ob2.Class3.isDisplayed();
			ob2.Class4.isDisplayed();
			boolean res = ob2.selectGargeConversion(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : garageConversionDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void acDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.acDropDown.click();
			ob2.noAC.isDisplayed();
			ob2.centralAC.isDisplayed();
			ob2.windowAC.isDisplayed();
			ob2.evaporativeAC.isDisplayed();
			boolean res = ob2.selectAC(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : acDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void poolDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.poolDropDown.click();
			ob2.none.isDisplayed();
			ob2.Class1.isDisplayed();
			ob2.Class2.isDisplayed();
			ob2.Class3.isDisplayed();
			ob2.Class4.isDisplayed();
			boolean res = ob2.selectPool(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : poolDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void hotTub(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.hotTubDropDown.click();
			ob2.none.isDisplayed();
			ob2.Class1.isDisplayed();
			ob2.Class2.isDisplayed();
			ob2.Class3.isDisplayed();
			ob2.Class4.isDisplayed();
			boolean res = ob2.selectHotTub(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : hotTub , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void storageBuildingField(String size){
		try{
			ob2.heading1.isDisplayed();
			ob2.storageBuildingTextField.clear();
			ob2.storageBuildingTextField.sendKeys(size);
			driver.hideKeyboard();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addOnField , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void storageBuildingDropDown(String option){
		try{
			ob2.heading1.isDisplayed();
			ob2.storageBuildingDropDown.click();
			ob2.none.isDisplayed();
			ob2.Class1.isDisplayed();
			ob2.Class2.isDisplayed();
			ob2.Class3.isDisplayed();
			boolean res = ob2.selectAddOn(Integer.parseInt(option));
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addOnDropDown , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass = SingleDataProvider.class)
	public void houseDimensions(String width, String depth){
		try{
			IOSElement textField1 = ob2.houseDimensionsWidthField;
			IOSElement textField2 = ob2.houseDimensionsDepthTextField; 
			textField1.clear();
			textField1.sendKeys(width);
			driver.hideKeyboard();
			textField2.clear();
			textField2.sendKeys(depth);
			driver.hideKeyboard();
			if(textField1.getAttribute("value").contains(width) && textField2.getAttribute("value").contains(depth)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : houseDimensions , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
	public void addFeature(){
		try{
			ob2.swipe("up");
			ob2.addFeaturesBtn.click();
			boolean res = ob2.verifyAdditionalFields(1);
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addFeature , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass = SingleDataProvider.class)
	public void addingDataInAmenities(String row, String quantity, String description, String cost){
		try{
			boolean a = ob2.fillAdditionalFeatures(Integer.parseInt(row), quantity, description, cost);
			if(a == false){
				Assert.assertEquals(false, true);
			}
			else{
				ob3.saveChangesBtn.click();
				while(ob3.saveChangesBtn.getAttribute("visible").equals("false")){}
				Assert.assertEquals(true, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : addingDataInAmenities , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass = SingleDataProvider.class)
	public void deleteAmenities(String row){
		try{
			int a = ob2.amenitiesRows.size();
			ob2.deleteAdditionalFeature(Integer.parseInt(row));
			ob3.vcBtn.click();
			ExtraFunctionalityCheck.waitImplicit(5000);
			ob1.cards.get(0).click();
			ExtraFunctionalityCheck.waitForElement(ob4.houseDetailsText, driver, 10000);
			ob4.houseDetailsText.click();
			ob2.swipe("up");
			int b = ob2.amenitiesRows.size();
			if((b == 0) || (a == (b - 1))){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : deleteAmenities , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass = SingleDataProvider.class)
	public void selectPricingProfile(String name){
		try{
			if(ob2.pricingProfileLabel.getAttribute("visible").equals(false)){
				ob2.swipe("up");
			}
			ob2.pricingProfileDropDown.click();
			ob2.selectPricingProfile(name);
			String s = ob2.pricingProfileDropDown.getAttribute("name");
			if(s.equals(name)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : selectPricingProfile , class : Property_HouseDetailsTest "+e);
		}
	}
	
	@Test
    public void safeSize(){
    	try{
    		ob2.topBar.isDisplayed();
    		ob2.swipe("up");
    		boolean a = ob2.verifySafeSizeIsSeleceted();
    		if(a == true){
    			Assert.assertEquals(true, true);
    		}
    		else{
    			Assert.assertEquals(false, true);
    		}
    	}
    	catch(Exception e){
    		Assert.assertEquals(false, true);
			System.out.println("Exception in test : safeSize , class : Property_HouseDetailsTest "+e);
    	}
    }
	
	@Test
    public void safeSizeInfo(){
    	try{
    		ob2.topBar.isDisplayed();
    		ob2.swipe("up");
    		ob2.safeSizeNote.isDisplayed();
    		Assert.assertEquals(true, true);
    	}
    	catch(Exception e){
    		Assert.assertEquals(false, true);
			System.out.println("Exception in test : safeSizeInfo , class : Property_HouseDetailsTest "+e);
    	}
    }
	
	@Test(dataProvider="data" , dataProviderClass=SingleDataProvider.class)
	public void notesHouseDetails(String notes){
		try{
			boolean res = true;
			if(ob2.heading3.getAttribute("visible").equals(false)){
				ob2.swipe("up");
			}
			IOSElement notesField = ob2.notesTextView;
			notesField.clear();
			notesField.sendKeys(notes);
			driver.hideKeyboard();
			if(notesField.getAttribute("value").length()<=160){
				res = res && true;
			}
			else{
				res = false;
			}
			Assert.assertEquals(res, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test : notesHouseDetails , class : Property_HouseDetailsTest "+e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
