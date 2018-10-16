package testModules;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.Property_Menu;
import pageObjects.Property_Repair;
import pageObjects.Property_RepairsMenu;
import pageObjects.Property_Seller;
import testListners.SingleDataProvider;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class Property_RepairsTests {

	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	HomePage ob1 = new HomePage(driver);
	Property_Seller ob2 = new Property_Seller(driver);
	Property_Menu ob3 = new Property_Menu(driver);
	Property_RepairsMenu ob4 = new Property_RepairsMenu(driver);
	Property_Repair ob5 = new Property_Repair(driver);
	IOSTouchAction ac = new IOSTouchAction(driver);
	
	@BeforeClass
	public void beforeClass(){
		try{
			try{
				ob1.homePageHeading.isDisplayed();
				ob1.cards.get(0).click();
				ExtraFunctionalityCheck.waitForElement(ob2.heading1, driver, 10000);
				ob2.heading1.isDisplayed();
				ob3.repairsText.click();
			}
			catch(Exception e){
				ob3.repairsText.click();
			}
		}
		catch(Exception e){
			System.out.println("Exception in before class method :"+e);
		}
	}
	
	@BeforeMethod
	public void beforeMethod(){
		try{
			ob4.propertyDetails.click();
			ob3.repairsText.click();
		}
		catch(Exception e){
			System.out.println("Exception in before method :"+e);
		}
	}
	
	
	@Test
	public void repairsSections(){
		try{
			ob4.roofingText.isDisplayed();
			ob4.doorAndWindowstext.isDisplayed();
			ob4.exteriorPaintAndSidingText.isDisplayed();
			ob4.foundationText.isDisplayed();
			ob4.eFOText.isDisplayed();
			ob4.kitchenText.isDisplayed();
			ob4.bathroomText.isDisplayed();
			ob4.interiorPaintText.isDisplayed();
			ob4.flooringText.isDisplayed();
			ob4.swipe("up");
			ob4.plumbingText.isDisplayed();
			ob4.hVACText.isDisplayed();
			ob4.electricalText.isDisplayed();
			ob4.fixturesText.isDisplayed();
			ob4.miscellaneousText.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - repairsSections : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void repairSectionCheck(){
		try{
			ob5.roofingHeader.isDisplayed();
			ob4.doorAndWindowstext.click();
			ob5.doorAndWindowsHeader.isDisplayed();
			ob4.exteriorPaintAndSidingText.click();
			ob5.exteriorPaintAndSidingHeader.isDisplayed();
			ob4.foundationText.click();
			ob5.foundationHeader.isDisplayed();
			ob4.eFOText.click();
			ob5.externalFunctionalObsolescenceHeader.isDisplayed();
			ob4.kitchenText.click();
			ob5.kitchenHeader.isDisplayed();
			ob4.bathroomText.click();
			ob5.bathroomHeader.isDisplayed();
			ob4.interiorPaintText.click();
			ob5.interiorPaintHeader.isDisplayed();
			ob4.flooringText.click();
			ob5.flooringHeader.isDisplayed();
			ob4.swipe("up");
			ob4.plumbingText.click();
			ob5.plumbingHeader.isDisplayed();
			ob4.hVACText.click();
			ob5.hVACHeader.isDisplayed();
			ob4.electricalText.click();
			ob5.electricalHeader.isDisplayed();
			ob4.fixturesText.click();
			ob5.fixturesHeader.isDisplayed();
			ob4.miscellaneousText.click();
			ob5.miscellaneousHeader.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - repairSectionCheck : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void noRepairCheck(){
		try{
			ob5.noRepairCheckBox.click();
			String cost = ob5.roofingPrice.getAttribute("name");
			ob5.noRepairCheckBox.click();
			if(cost.equals("$0.00")){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - noRepairCheck : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void roofingSection(){
		try{
			ob5.repairTypeLabel.isDisplayed();
			ob5.roofInformationLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - roofingSection : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass=SingleDataProvider.class)
	public void selectRoofingMaterial(int row){
		try{
			ob5.roofingMaterialDropDown.click();
			boolean a = ob5.selectRoofingMaterial(row);
			Assert.assertEquals(a, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - roofingSection : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void toggleRepairAllRepair(){
		try{
			ob5.replaceAllCheckBox.click();
			ob5.repairCheckBox.click();
			if(ob5.verifyCheckBox(ob5.replaceAllCheckBox)==true){
					Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - toggleRepairAllRepair : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void estimateFieldOnRepair(){
		try{
			if(ob5.verifyCheckBox(ob5.repairCheckBox) == true){
				ob5.repairCheckBox.click();
			}
			ob5.estimateTextField.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - estimateFieldOnRepair : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider = "data" , dataProviderClass= SingleDataProvider.class)
	public void estimateFieldValue(String value){
		try{
			if(ob5.verifyCheckBox(ob5.repairCheckBox) == true){
				ob5.repairCheckBox.click();
			}
			ob5.estimateTextField.sendKeys(value);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - estimateFieldValue : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void reDeckAndPaintTileRoof(){
		try{
			ob5.reDeckCheckBox.click();
			ob5.paintTileRoofCheckBox.click();
			if((ob5.verifyCheckBox(ob5.reDeckCheckBox) == false) && (ob5.verifyCheckBox(ob5.paintTileRoofCheckBox)==false)){
				Assert.assertEquals(true, true);
			}
			else{
				Assert.assertEquals(false, true);
			}
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - reDeckAndPaintTileRoof : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void roofingFields(String roofPitch, String soffit , String gutters){
		try{
			ob5.roofPitchTextField.sendKeys(roofPitch);
			ob5.soffitTextField.sendKeys(soffit);
			ob5.guttersTextField.sendKeys(gutters);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - roofingFields : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void roofingMaterial(){
		try{
			ob5.roofingMaterialDropDown.click();
			ob5.none.isDisplayed();
			ob5.threeTab.isDisplayed();
			ob5.dimensional.isDisplayed();
			ob5.hotTar.isDisplayed();
			ob5.rollRoofing.isDisplayed();
			ob5.tile.isDisplayed();
			ac.tap(PointOption.point(350, 100)).perform();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - roofingMaterial : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass= SingleDataProvider.class)
	public void currentNumLayer(String layers){
		try{
			ob5.currentNumberOfLayersTextField.sendKeys(layers);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - currentNumLayer : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
	public void customEstimate(String estimate){
		try{
			ob5.swipe(ob5.customEstimateLabel, "up");
			ob5.customEstimateTextField.setValue(estimate);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - customEstimate : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test(dataProvider="data" , dataProviderClass=SingleDataProvider.class)
	public void notesField(String notes){
		try{
			ob5.swipe(ob5.notesLabel, "up");
			ob5.notesTextField.sendKeys(notes);
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - notesField : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void noRepairs(){
		try{
			ob5.noRepairCheckBox.click();
			boolean result = ob5.roofingPrice.getAttribute("value").equals("$0.00");
			Assert.assertEquals(result, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - noRepairs : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void doorsAndWindowsHeading(){
		try{
			ob4.doorAndWindowstext.click();
			ob5.doorAndWindowsHeader.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - doorsAndWindowsHeading : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void doorsAndWindowsSections(){
		try{
			ob4.doorAndWindowstext.click();
			ob5.doorsLabel.isDisplayed();
			ob5.windowsLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - doorsAndWindowsSections : Class - Property_RepairsTests : "+e);
		}
	}
	
	@Test
	public void doorsLabels(){
		try{
			ob4.doorAndWindowstext.click();
			ob5.entryDoorLabel.isDisplayed();
			ob5.slidingPatioGlassLabel.isDisplayed();
			ob5.serviceDoorLabel.isDisplayed();
			ob5.vinylSlidingPatioDoorLabel.isDisplayed();
			ob5.screenDoorLabel.isDisplayed();
			ob5.woodSlidingPatioDoorLabel.isDisplayed();
			ob5.interiorDoorLabel.isDisplayed();
			ob5.frenchDoorLabel.isDisplayed();
			ob5.doorAndBaseTrimLabel.isDisplayed();
			ob5.singleGarageDoorLabel.isDisplayed();
			ob5.doorJambLabel.isDisplayed();
			ob5.doubleGarageDoorLabel.isDisplayed();
			Assert.assertEquals(true, true);
		}
		catch(Exception e){
			Assert.assertEquals(false, true);
			System.out.println("Exception in test - doorsLabels : Class - Property_RepairsTests : "+e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
