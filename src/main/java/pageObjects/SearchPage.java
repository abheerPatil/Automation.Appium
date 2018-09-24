package pageObjects;

import java.util.List;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import io.appium.java_client.pagefactory.iOSXCUITFindAll;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SearchPage {
	
	
	IOSDriver<MobileElement> driver ;


/****************************************************************************CONSTRUCTOR************************************************************************************/	
		
		public SearchPage(IOSDriver<MobileElement> driver){
			//System.out.println("Started");
			this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT : 10
/***************************/		
		
		//SEARCH BAR
		@iOSXCUITFindBy(className="XCUIElementTypeTextField")
		public IOSElement searchField;
		
		//CANCEL BUTTON
		@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeButton' AND name = 'Cancel'")
		public IOSElement cancelBtn;
		
		//SEARCH BUTTON
		@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeButton' AND name = 'search'")
		public IOSElement searchBtn;
		
		//DELETE BUTTON
		@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeButton' AND name = 'delete'")
		public IOSElement deleteBtn;
		
		//CITY HEADING
		@iOSXCUITFindBy(accessibility = "CITY")
		public IOSElement cityHeading;
				
		//PROPERTY HEADING
		@iOSXCUITFindBy(accessibility = "PROPERTY")
		public IOSElement propertyHeading;				
	
		//ZIPCODE HEADING
		@iOSXCUITFindBy(accessibility="ZIP CODE")
		public IOSElement zipCodeHeading;

		//ZIPCODES
		@iOSXCUITFindAll(@iOSXCUITBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeOther[@name='ZIP CODE'] AND following::XCUIElementTypeOther[@name='PROPERTY']]"))
		public List<IOSElement> zipCodes;
		
		//PROPERTIES
		@iOSXCUITFindAll(@iOSXCUITBy(xpath="//XCUIElementTypeCell[preceding::XCUIElementTypeOther[@name='PROPERTY'] and following::XCUIElementTypeStaticText[@name='My Properties']]"))
		public List<IOSElement> properties; 
		
		//CITIES
		@iOSXCUITFindAll(@iOSXCUITBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeOther[@name='CITY'] AND following::XCUIElementTypeOther[@name='PROPERTY']]"))
		public List<IOSElement> city;
		
		
		
/****************************************************************************ACTIONS***************************************************************************************/
		/*ACTIONS COUNT: 2
		 * 1. clickBtn(MobileElement element) 
		 * 2. search(String type , String input , Integer position)
		 */
/*******************************************************/
		
		/*Method to click a link or a button.
		 * Parameters : MobileElement 
		 * Returns : true if action is done and false if there is any exception in that.
		 */
		public boolean clickBtn(MobileElement element){
			try{
				element.click();
				return true;
			}
			catch(Exception e){
				System.err.println("Exception in class - SearchBar, in method - clickBtn :"+e);
				return false;
			}
		}
		
		/*Method to search a property or search properties according to ZIP codes or Cities.
		 * Parameters : String (type - ZIP/City/Address/Seller/Phone No/Project name) , String (input provided) , Integer (position on screen)
		 * Returns : Element if found else null if not found or there is some exception.
		 */
		public IOSElement search(String type ,String input, int position){
			try{
				searchField.sendKeys(input);
				
				if(type.equalsIgnoreCase("zip")){
					return zipCodes.get(position);
				}
				else if(type.equalsIgnoreCase("city")){
					return city.get(position);
				}
				else if((type.equalsIgnoreCase("address"))&&(type.equalsIgnoreCase("seller"))&&(type.equalsIgnoreCase("phoneNum"))&&(type.equalsIgnoreCase("projectName"))){
					return properties.get(position);
				}
				return null;
			}
			catch(Exception e){
				System.err.println("Exception in class - SearchBar, in method - search :"+e);
				return null;
			}
		}
		

}
