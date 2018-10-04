package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_HouseDetails {
	
	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
			
	public Property_HouseDetails(IOSDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
		//ELEMENTS COUNT: 45 
/**************************/
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name = 'House Details'")
	public IOSElement topBar; 
	
	@iOSXCUITFindBy(accessibility="Primary Features")
	public IOSElement heading1; 
	
	@iOSXCUITFindBy(accessibility="Year Build*")
	public IOSElement yearBuildLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]")
	public IOSElement yearBuildField;
	
	@iOSXCUITFindBy(accessibility="Bedrooms")
	public IOSElement bedroomsLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")
	public IOSElement bedroomsField;
	
	@iOSXCUITFindBy(accessibility="Main*")
	public IOSElement mainLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[3]/XCUIElementTypeTextField[1]")
	public IOSElement mainField;
	
	@iOSXCUITFindBy(accessibility="Bathrooms")
	public IOSElement bathroomsLabel; 

	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[3]/XCUIElementTypeTextField[2]")
	public IOSElement bathroomsField;
	
	@iOSXCUITFindBy(accessibility="Information Provided by Zillow")
	public IOSElement zillowLabel; 
	
	@iOSXCUITFindBy(accessibility="*Required for an accurate estimate")
	public IOSElement conditionStatement; 
	
	@iOSXCUITFindBy(accessibility="Add-On")
	public IOSElement addOnLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Add-On'$]/XCUIElementTypeTextField")
	public IOSElement addOnTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Add-On'$]/XCUIElementTypeButton")
	public IOSElement addOnClassDropDown;
	
	@iOSXCUITFindBy(accessibility="Home Style")
	public IOSElement homeStyleLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Home Style'$]/XCUIElementTypeButton")
	public IOSElement homeStyleDropDown;
	
	@iOSXCUITFindBy(accessibility="Exterior Style")
	public IOSElement exteriorStyleLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Exterior Style'$]/XCUIElementTypeButton")
	public IOSElement exteriorStyleDropDown;
	
	@iOSXCUITFindBy(accessibility="Garage Size")
	public IOSElement garageSizeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Garage Size'$]/XCUIElementTypeButton[2]")
	public IOSElement garageSizeDropDown;
	
	@iOSXCUITFindBy(accessibility="Detached")
	public IOSElement detachedLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Detached'$]/XCUIElementTypeButton[1]")				
	public IOSElement detachedCheckBox;
	
	@iOSXCUITFindBy(accessibility="Garage Conversion")
	public IOSElement garageConversionLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Garage Conversion'$]/XCUIElementTypeTextField")
	public IOSElement garageConversionTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Garage Conversion'$]/XCUIElementTypeButton")
	public IOSElement garageConversionDropDown;
	
	@iOSXCUITFindBy(accessibility="AC")
	public IOSElement acLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'AC'$]/XCUIElementTypeButton")
	public IOSElement acDropDown;
	
	@iOSXCUITFindBy(accessibility="Pool")
	public IOSElement poolLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Pool'$]/XCUIElementTypeButton")
	public IOSElement poolDropDown;
	
	@iOSXCUITFindBy(accessibility="Hot Tub")
	public IOSElement hotTubLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Hot Tub'$]/XCUIElementTypeButton")
	public IOSElement hotTubDropDown;
	
	@iOSXCUITFindBy(accessibility="Storage Building")
	public IOSElement storageBuildingLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Storage Building'$]/XCUIElementTypeTextField")
	public IOSElement storageBuildingTextField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Storage Building'$]/XCUIElementTypeButton")
	public IOSElement storageBuildingDropDown;
	
	@iOSXCUITFindBy(accessibility="House Dimensions")
	public IOSElement houseDimensionsLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'House Dimensions'$]/XCUIElementTypeTextField[1]")
	public IOSElement houseDimensionsWidthField;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'House Dimensions'$]/XCUIElementTypeTextField[2]")
	public IOSElement houseDimensionsDepthTextField;
	
	@iOSXCUITFindBy(accessibility="Amenities or Additional Features")
	public IOSElement heading2;
	
	@iOSXCUITFindBy(accessibility="Pricing Profile")
	public IOSElement pricingProfileLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeButton'$][7]")
	public IOSElement pricingProfileDropDown;
	
	@iOSXCUITFindBy(accessibility="Safe Size")
	public IOSElement safeSizeLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeStaticText' AND name == 'Safe Size'$]/XCUIElementTypeButton")
	public IOSElement safeSizeCheckBox;
	
	@iOSXCUITFindBy(accessibility="Calculates a 1,000 Sq Ft house minimum for paint (exterior & interior), electrical and plumbing.")
	public IOSElement safeSizeNote; 
	
	@iOSXCUITFindBy(accessibility="Notes")
	public IOSElement heading3; 
	
	@iOSXCUITFindBy(className="XCUIElementTypeTextView")
	public IOSElement notesTextView; 
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('out of 160 characters')")
	public IOSElement notesTextViewCharacters; 
	
	@iOSXCUITFindBy(accessibility="Quantity")
	public IOSElement quantity;
	
	@iOSXCUITFindBy(accessibility="Description")
	public IOSElement description;
	
	@iOSXCUITFindBy(accessibility="Cost per Unit")
	public IOSElement costPerUnit;
	
	@iOSXCUITFindBy(accessibility="Total Cost")
	public IOSElement totalCost;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$type == 'XCUIElementTypeButton' AND name == 'iconsDelete'$]")
	public List<IOSElement> amenitiesRows;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeButton' AND name = 'Add Feature'")
	public IOSElement addFeaturesBtn; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement pricingProfileTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[@width = '308']")
	public List <IOSElement> pricingProfileTabItems;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement storageBuildingTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement hotTubTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement poolTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement garageConverisonTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement addOnTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '308']")
	public IOSElement exteriorStyleTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '158']")
	public IOSElement homeStyleTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '158']")
	public IOSElement garageSizeTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '158']")
	public IOSElement acTabHead;
	
	@iOSXCUITFindBy(accessibility="Class 1")
	public IOSElement Class1;
	
	@iOSXCUITFindBy(accessibility="Class 2")
	public IOSElement Class2;
	
	@iOSXCUITFindBy(accessibility="Class 3")
	public IOSElement Class3;
	
	@iOSXCUITFindBy(accessibility="Class 4")
	public IOSElement Class4;
	
	@iOSXCUITFindBy(accessibility="None")
	public IOSElement none;
	
	@iOSXCUITFindBy(accessibility="No AC")
	public IOSElement noAC;
	
	@iOSXCUITFindBy(accessibility="Central")
	public IOSElement centralAC;
	
	@iOSXCUITFindBy(accessibility="Window")
	public IOSElement windowAC;
	
	@iOSXCUITFindBy(accessibility="Evaporative")
	public IOSElement evaporativeAC;
	
	@iOSXCUITFindBy(accessibility="No Garage")
	public IOSElement noGarage;
	
	@iOSXCUITFindBy(accessibility="1 Car")
	public IOSElement oneCar;
	
	@iOSXCUITFindBy(accessibility="2 Car")
	public IOSElement twoCar;
	
	@iOSXCUITFindBy(accessibility="3 Car")
	public IOSElement threeCar;
	
	@iOSXCUITFindBy(accessibility="Brick- Front")
	public IOSElement brickFront;
	
	@iOSXCUITFindBy(accessibility="Brick- 3 Sides")
	public IOSElement brick3Sides;
	
	@iOSXCUITFindBy(accessibility="Brick- 4 Sides")
	public IOSElement brick4Sides;
	
	@iOSXCUITFindBy(accessibility="Cinder Block")
	public IOSElement cinderBlock;
	
	@iOSXCUITFindBy(accessibility="Frame- Aluminum Siding")
	public IOSElement frameAluminiumSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Asbestos Siding")
	public IOSElement frameAsbestosSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Vinyl Siding")
	public IOSElement frameVinylSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Wood Siding")
	public IOSElement frameWoodSiding;
	
	@iOSXCUITFindBy(accessibility="Stucco")
	public IOSElement stucco;
	
	@iOSXCUITFindBy(accessibility="Single Story")
	public IOSElement StorySingle;
	
	@iOSXCUITFindBy(accessibility="2 Story")
	public IOSElement Story2;
	
	@iOSXCUITFindBy(accessibility="3 Story")
	public IOSElement Story3;
	
	@iOSXCUITFindBy(accessibility="Bi-Level")
	public IOSElement biLevel;
	
	@iOSXCUITFindBy(accessibility="Tri-Level")
	public IOSElement triLevel;
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('See more for')")
	public IOSElement seeMoreLabel;
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('Zillow, Inc.,')")
	public IOSElement copyrightLabel;
	
	@iOSXCUITFindBy(accessibility="zillowlogo")
	public IOSElement zillowLogo;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeOther' AND name == 'URL'")
	public IOSElement url;
	
	
/*****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 
	 
	 */
/**************************************************************************/
	
	/*Method to select pricing profile from drop down.
	 * Parameters : String(name of pricing profile)
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean selectPricingProfile(String name){
		try{
			driver.findElement(MobileBy.AccessibilityId(name)).click();
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectPricingProfile : "+e);
			return false;
		}
		return false;
	}
	
	/*Method to tap on the check box.
	 * Parameters : IOSElement(element) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean tapCheckBox(IOSElement element){
		try{
			element.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - tapCheckBox : "+e);
			return false;
		}
	}
	
	public boolean verifyAdditionalFields(int row){
		try{
			row = row - 1;
			boolean a = quantity.isDisplayed();
			a = a && description.isDisplayed();
			a = a && costPerUnit.isDisplayed();
			a = a && totalCost.isDisplayed();
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[1]")).isDisplayed();
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[2]")).isDisplayed();
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[3]")).isDisplayed();
			
			return a;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyAdditionalFields : "+e);
			return false;
		}
	} 
	
	/*Method to fill additional fields.
	 * Parameters : Integer (row number) , String (quantity) , String (description) , String (cost per unit) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean fillAdditionalFeatures(int row, String quantity, String description, String costPerUnit){
		try{
			row = row - 1;
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[1]")).clear();
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[1]")).sendKeys(quantity);;
			driver.hideKeyboard();
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[2]")).clear();
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[2]")).sendKeys(description);
			driver.hideKeyboard();
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[3]")).clear();
			amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[3]")).sendKeys(costPerUnit);
			driver.hideKeyboard();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - fillAdditionalFeatures : "+e);
			return false;
		}
	}
	
	/*Method to verify data in additional field.
	 * Parameters : Integer (row number) , String (quantity) , String (description) , String (cost per unit) 
	 * Returns : true if verification is true, false otherwise.
	 */
	public boolean verifyAdditionalFeatures(int row, String quantity, String description, String costPerUnit){
		try{
			boolean a = true;
			row = row - 1;
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[1]")).getAttribute("value").equals(quantity);
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[2]")).getAttribute("value").equals(description);
			a = a && amenitiesRows.get(row).findElement(MobileBy.iOSClassChain("**/XCUIElementTypeTextField[3]")).getAttribute("value").equals(costPerUnit);
			
			return a;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyAdditionalFeatures : "+e);
			return false;
		}
	}
	
	public boolean deleteAdditionalFeature(int row){
		try{
			row = row - 1;
			amenitiesRows.get(row).findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'iconsDelete'")).click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - deleteAdditionalFeature : "+e);
			return false;
		}
	}
	/*Method to verify data in fields.
	 * Parameters : IOSElement (element) , String (comparable) 
	 * Returns : true if verification is true, false otherwise.
	 */
	public boolean verifyTextFields(IOSElement element, String comparable){
		try{
			if(element.getAttribute("value").equals(comparable)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyTextFields : "+e);
			return false;
		}
	}
	/*Method to swipe.
	 * Parameters : String (direction) 
	 * Returns : true if action is done, false otherwise
	 * Note : direction - up , down
	 */
	
	public boolean swipe(String direction){
		try{
			if(direction.equalsIgnoreCase("up")){
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.longPress(PointOption.point(262, 421)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3))).moveTo(PointOption.point(262, 74)).release().perform();
				return true;
			}
			else if(direction.equalsIgnoreCase("down")){
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.longPress(PointOption.point(262, 74)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3))).moveTo(PointOption.point(262, 421)).release().perform();
				return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - swipe : "+e);
			return false;
		}
		return false;
	}
	
	/*Method to verify if check box is selected or not.
	 * Parameters : IOSElement (element) 
	 * Returns : true if same, false otherwise.
	 */
	public boolean verifyDetachedIsSeleceted(){
		ExtraFunctionalityCheck.getScreenshots(detachedCheckBox);
		String path = "src/main/resources/";
		try{
			if((ImageClass.image(path+"screenshot.png", path+"screenshots/HOUSE DETAILS/DETACHED.png")<=10)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyDetachedIsSeleceted : "+e);
			return false;
		}
	}
	
	public boolean verifySafeSizeIsSeleceted(){
		ExtraFunctionalityCheck.getScreenshots(safeSizeCheckBox);
		String path = "src/main/resources/";
		try{
			if((ImageClass.image(path+"screenshot.png", path+"screenshots/HOUSE DETAILS/SAFE SIZE.png")<=10)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifySafeSizeIsSeleceted : "+e);
			return false;
		}
	}
	
	public boolean selectAddOn(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: Class1.click();
				break;
			case 3: Class2.click();
				break;
			case 4: Class3.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectAddOn : "+e);
			return false;
		}
	}
	
	public boolean selectHomeStyle(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: StorySingle.click();
				break;
			case 3: Story2.click();
				break;
			case 4: Story3.click();
				break;
			case 5: biLevel.click();
				break;
			case 6: triLevel.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectHomeStyle : "+e);
			return false;
		}
	}
	
	public boolean selectExteriorStyle(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: brickFront.click();
				break;
			case 3: brick3Sides.click();
				break;
			case 4: brick4Sides.click();
				break;
			case 5: cinderBlock.click();
				break;
			case 6: frameAluminiumSiding.click();
				break;
			case 7: frameAsbestosSiding.click();
				break;
			case 8: frameVinylSiding.click();
				break;
			case 9: frameWoodSiding.click();
				break;
			case 10: stucco.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectExteriorStyle : "+e);
			return false;
		}
	}
	
	public boolean selectGargeSize(int option){
		try{
			switch(option){
			case 1: noGarage.click();
				break;
			case 2: oneCar.click();
				break;
			case 3: twoCar.click();
				break;
			case 4: threeCar.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectGargeSize : "+e);
			return false;
		}
	}
	
	public boolean selectGargeConversion(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: Class1.click();
				break;
			case 3: Class2.click();
				break;
			case 4: Class3.click();
				break;
			case 5: Class4.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectGargeConversion : "+e);
			return false;
		}
	}
	
	public boolean selectAC(int option){
		try{
			switch(option){
			case 1: noAC.click();
				break;
			case 2: centralAC.click();
				break;
			case 3: windowAC.click();
				break;
			case 4: evaporativeAC.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectAC : "+e);
			return false;
		}
	}
	
	public boolean selectPool(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: Class1.click();
				break;
			case 3: Class2.click();
				break;
			case 4: Class3.click();
				break;
			case 5: Class4.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectPool : "+e);
			return false;
		}
	}
	
	public boolean selectHotTub(int option){
		try{
			switch(option){
			case 1: none.click();
				break;
			case 2: Class1.click();
				break;
			case 3: Class2.click();
				break;
			case 4: Class3.click();
				break;
			case 5: Class4.click();
				break;
			default: none.click();
				break;
			}
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - selectHotTub : "+e);
			return false;
		}
	}
	
	
}
