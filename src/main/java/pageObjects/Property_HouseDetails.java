package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_HouseDetails {
	
	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
			
	public Property_HouseDetails(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
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
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2]/XCUIElementTypeTextField[1]")
	public IOSElement yearBuildField;
	
	@iOSXCUITFindBy(accessibility="Bedrooms")
	public IOSElement bedroomsLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[2]/XCUIElementTypeTextField[2]")
	public IOSElement bedroomsField;
	
	@iOSXCUITFindBy(accessibility="Main*")
	public IOSElement mainLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[3]/XCUIElementTypeTextField[1]")
	public IOSElement mainField;
	
	@iOSXCUITFindBy(accessibility="Bathrooms")
	public IOSElement bathroomsLabel; 

	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[3]/XCUIElementTypeTextField[2]")
	public IOSElement bathroomsField;
	
	@iOSXCUITFindBy(accessibility="Information Provided by Zillow")
	public IOSElement zillowLabel; 
	
	@iOSXCUITFindBy(accessibility="*Required for an accurate estimate")
	public IOSElement conditionStatement; 
	
	@iOSXCUITFindBy(accessibility="Add-On")
	public IOSElement addOnLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name='Add-On']]")
	public IOSElement addOnTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Add-On']]")
	public IOSElement addOnClassDropDown;
	
	@iOSXCUITFindBy(accessibility="Home Style")
	public IOSElement homeStyleLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Home Style']]")
	public IOSElement homeStyleDropDown;
	
	@iOSXCUITFindBy(accessibility="Exterior Style")
	public IOSElement exteriorStyleLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Exterior Style']]")
	public IOSElement exteriorStyleDropDown;
	
	@iOSXCUITFindBy(accessibility="Garage Size")
	public IOSElement garageSizeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Garage Size']]")
	public IOSElement garageSizeDropDown;
	
	@iOSXCUITFindBy(accessibility="Detached")
	public IOSElement detachedLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Detached']]")				
	public IOSElement detachedCheckBox;
	
	@iOSXCUITFindBy(accessibility="Garage Conversion")
	public IOSElement garageConversionLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name='Garage Conversion']]")
	public IOSElement garageConversionTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Garage Conversion']]")
	public IOSElement garageConversionDropDown;
	
	@iOSXCUITFindBy(accessibility="AC")
	public IOSElement acLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='AC']]")
	public IOSElement acDropDown;
	
	@iOSXCUITFindBy(accessibility="Pool")
	public IOSElement poolLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Pool']]")
	public IOSElement poolDropDown;
	
	@iOSXCUITFindBy(accessibility="Hot Tub")
	public IOSElement hotTubLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Hot Tub']]")
	public IOSElement hotTubDropDown;
	
	@iOSXCUITFindBy(accessibility="Storage Building")
	public IOSElement storageBuildingLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name='Storage Building']]")
	public IOSElement storageBuildingTextField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Storage Building']]")
	public IOSElement storageBuildingDropDown;
	
	@iOSXCUITFindBy(accessibility="House Dimensions")
	public IOSElement houseDimensionsLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[1][preceding::XCUIElementTypeStaticText[@name='House Dimensions']]")
	public IOSElement houseDimensionsWidthField;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[2][preceding::XCUIElementTypeStaticText[@name='House Dimensions']]")
	public IOSElement houseDimensionsDepthTextField;
	
	@iOSXCUITFindBy(accessibility="Amenities or Additional Features")
	public IOSElement heading2;
	
	@iOSXCUITFindBy(accessibility="Pricing Profile")
	public IOSElement pricingProfileLabel; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Pricing Profile'] and @width = '276']")
	public IOSElement pricingProfileDropDown;
	
	@iOSXCUITFindBy(accessibility="Safe Size")
	public IOSElement safeSizeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[preceding::XCUIElementTypeStaticText[@name='Pricing Profile'] and @width = '50']")
	public IOSElement safeSizeCheckBox;
	
	@iOSXCUITFindBy(accessibility="Calculates a 1,000 Sq Ft house minimum for paint (exterior & interior), electrical and plumbing.")
	public IOSElement safeSizeNote; 
	
	@iOSXCUITFindBy(accessibility="Notes")
	public IOSElement heading3; 
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextView[preceding::XCUIElementTypeStaticText[@name='Notes']]")
	public IOSElement notesTextView; 
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('out of 160 characters')")
	public IOSElement notesTextViewCharacters; 
	
//IF SIZE>0 Then ROW1 consists XCUIElementTypeStatic(Quantity, Description, Cost per Unit, Total Cost) and following rows consists 3 textBox and static text for total and a negative button
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[preceding::XCUIElementTypeStaticText[@name='Amenities or Additional Features'] and following::XCUIElementTypeButton[@name='Add Feature']]")
	public List<IOSElement> rows ;
	
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
	
	/*Method to fill additional fields.
	 * Parameters : Integer (row number) , String (quantity) , String (description) , String (cost per unit) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean fillAdditionalFeatures(int row, String quantity, String description, String costPerUnit){
		try{
			rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[1]")).click();
			driver.getKeyboard().sendKeys(quantity);
			rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[2]")).click();
			driver.getKeyboard().sendKeys(description);
			rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[3]")).click();
			driver.getKeyboard().sendKeys(costPerUnit);
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
			boolean a =rows.get(0).findElement(By.name("Quantity")).isDisplayed();
			a = a && rows.get(0).findElement(By.name("Description")).isDisplayed();
			a = a && rows.get(0).findElement(By.name("Cost per Unit")).isDisplayed();
			a = a && rows.get(0).findElement(By.name("Total Cost")).isDisplayed();
			a = a && rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[1]")).getAttribute("value").equals(quantity);
			a = a && rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[2]")).getAttribute("value").equals(description);
			a = a && rows.get(row).findElement(By.xpath("//XCUIElementTypeTextField[3]")).getAttribute("value").equals(costPerUnit);
			
			return a;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyAdditionalFeatures : "+e);
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
	/*
	public boolean swipe(String direction){
		try{
			if(direction.equalsIgnoreCase("up")){
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.longPress(262, 421).waitAction(Duration.ofMillis(3)).moveTo(262, 74).release().perform();
				return true;
			}
			else if(direction.equalsIgnoreCase("down")){
				IOSTouchAction ac = new IOSTouchAction(driver);
				ac.longPress(262, 74).waitAction(Duration.ofMillis(3)).moveTo(262, 421).release().perform();
				return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - swipe : "+e);
			return false;
		}
		return false;
	}
	*/
	/*Method to verify if check box is selected or not.
	 * Parameters : IOSElement (element) 
	 * Returns : true if same, false otherwise.
	 */
	public boolean verifyCheckBoxIsSeleceted(IOSElement element){
		ExtraFunctionalityCheck.getScreenshots(element);
		String path = "/Users/kiwitech/Desktop/screenshots/";
		try{
			if((element.equals(detachedCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"HOME HOUSE DETAILS/DETACHED.png")==0)){
				return true;
			}
			else if((element.equals(safeSizeCheckBox))&&(ImageClass.image(path+"screenshot.png", path+"HOME HOUSE DETAILS/SAFE SIZE.png")==0)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_HouseDetails, in method - verifyCheckBoxIsSelected : "+e);
			return false;
		}
	}
	
	/*Method to verify 'Zillow' branding.
	 * Parameters : null
	 * Returns : true if 'zillow' branding is provided, false otherwise
	 */
	public boolean checkZillow(){
		try{
			if(zillowLabel.isDisplayed()){
				boolean a = true;
				while(a == true){
					try{
						if(notesTextViewCharacters.isDisplayed()){
							try{
						//		swipe("up");
								zillowLogo.isDisplayed();
								seeMoreLabel.isDisplayed();
								copyrightLabel.isDisplayed();
								a = false;
								return true;
							}
							catch(Exception e){
								return false;
							}
						}
					}
					catch(Exception e){
						a = true;
					//	swipe("up");
					}
				}
			}
		}
		catch(Exception e){
			return false;
		}
		return false;
	}
}
