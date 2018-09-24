package pageObjects;

import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_RepairsMenu {

	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
		
	public Property_RepairsMenu(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 32
/**************************/	
	
	@iOSXCUITFindBy(accessibility="Property Details")
	public IOSElement propertyDetails;
		
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Roofing']")
	public IOSElement roofing;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Roofing']]")
	public IOSElement roofingCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Doors & Windows']")
	public IOSElement doorAndWindows;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Doors & Windows']]")
	public IOSElement doorAndWindowsCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Exterior Paint & Siding']")
	public IOSElement exteriorPaintAndSiding;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Exterior Paint & Siding']]")
	public IOSElement exteriorPaintAndSidingCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Foundation']")
	public IOSElement foundation;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Foundation']]")
	public IOSElement foundationCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='E/FO']")
	public IOSElement eFO;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'E/FO']]")
	public IOSElement eFOCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Kitchen']")
	public IOSElement kitchen;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Kitchen']]")
	public IOSElement kitchenCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Bathroom']")
	public IOSElement bathroom;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Bathroom']]")
	public IOSElement bathroomCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Interior Paint']")
	public IOSElement interiorPaint;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Interior Paint']]")
	public IOSElement interiorPaintCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Flooring']")
	public IOSElement flooring;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Flooring']]")
	public IOSElement flooringCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Plumbing']")
	public IOSElement plumbing;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Plumbing']]")
	public IOSElement plumbingCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='HVAC']")
	public IOSElement hVAC;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'HVAC']]")
	public IOSElement hVACCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Electrical']")
	public IOSElement electrical;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Electrical']]")
	public IOSElement electricalCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Fixtures']")
	public IOSElement fixtures;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Fixtures']]")
	public IOSElement fixturesCost;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name='Miscellaneous']")
	public IOSElement miscellaneous;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Miscellaneous']]")
	public IOSElement miscellaneousCost;
	
	@iOSXCUITFindBy(accessibility="Total Repairs")
	public IOSElement totalRepairs;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[preceding::XCUIElementTypeStaticText[@name = 'Total Repairs']]")
	public IOSElement totalCost;
	
	@iOSXCUITFindBy(className="XCUIElementTypeTable")
	public IOSElement menutable;
	
/****************************************************************************ACTIONS***************************************************************************************/		
	/*METHODS COUNT: 3
	 * 1. getCost(IOSElement element)
	 * 2. swipe(String direction)
	 * 3. isSelected(IOSElement element)
	 */
/***************************************************************/	
	
	/*Method to get the cost of particular cost element.
	 * Parameters : IOSElement(Cost element) 
	 * Returns : String representation of cost and null if there is an exception.
	 */
	public String getCost(IOSElement element){
		try{
			String s = element.getAttribute("name");
			s = s.substring(1);
			return s;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_RepairsMenu, in method - getCost :"+e);
			return null;
		}
	}
	
	/*Method to swipe repair menu.
	 * Parameters : String(Direction) 
	 * Returns : true if action is completed and false if there is some exception.
	 * Note: Direction can only be : 'up' and 'down'
	 */
	public boolean swipe(String direction){
		try{
			JavascriptExecutor js = driver;
		    HashMap<String, String> swipeObject = new HashMap<String, String>();
		    swipeObject.put("direction", direction);
		    swipeObject.put("element", menutable.getId());
		    js.executeScript("mobile: swipe", swipeObject); 
			  return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_RepairsMenu, in method - swipe :"+e);
			return false;
		}
	}
	
	/*Method to check if desired menu item is selected or not.
	 * Parameters : IOSElement 
	 * Returns : true is desired element is selected and false otherwise. 
	 */
	public boolean isSelected(IOSElement element){
		try{
			ExtraFunctionalityCheck.getScreenshots(element);
			String path = "/Users/kiwitech/Desktop/screenshots/";
			if((element.equals(roofing))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/roofing.png")==0)){
				return true;
			}
			else if((element.equals(doorAndWindows))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/doorAndWindows.png")==0)){
				return true;
			}
			else if((element.equals(exteriorPaintAndSiding))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/exteriorPaintAndSiding.png")==0)){
				return true;
			}
			else if((element.equals(foundation))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/foundation.png")==0)){
				return true;
			}
			else if((element.equals(eFO))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/eFO.png")==0)){
				return true;
			}
			else if((element.equals(kitchen))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/kitchen.png")==0)){
				return true;
			}
			else if((element.equals(bathroom))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/bathroom.png")==0)){
				return true;
			}
			else if((element.equals(interiorPaint))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/interiorPaint.png")==0)){
				return true;
			}
			else if((element.equals(flooring))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/flooring.png")==0)){
				return true;
			}
			else if((element.equals(plumbing))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/plumbing.png")==0)){
				return true;
			}
			else if((element.equals(hVAC))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/hVAC.png")==0)){
				return true;
			}
			else if((element.equals(electrical))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/electrical.png")==0)){
				return true;
			}
			else if((element.equals(fixtures))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/fixtures.png")==0)){
				return true;
			}
			else if((element.equals(miscellaneous))&&(ImageClass.image(path+"screenshot.png", path+"REPAIRS MENU/miscellaneous.png")==0)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_RepairsMenu, in method - isSelected :"+e);
			return false;
		}
	}
}
