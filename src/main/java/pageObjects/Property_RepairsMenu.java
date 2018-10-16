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
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 
/**************************/	
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[$name == '< Property Details'$]")
	public IOSElement propertyDetails;
		
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Roofing'")
	public IOSElement roofingText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Roofing'$]")
	public IOSElement roofingCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Roofing'$]/XCUIElementTypeStaticText[2]")
	public IOSElement roofingCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Doors & Windows'")
	public IOSElement doorAndWindowstext;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Doors & Windows'$]")
	public IOSElement doorAndWindowsCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Doors & Windows'$]/XCUIElementTypeStaticText[2]")
	public IOSElement doorAndWindowsCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Exterior Paint & Siding'")
	public IOSElement exteriorPaintAndSidingText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Exterior Paint & Siding'$]")
	public IOSElement exteriorPaintAndSidingCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Exterior Paint & Siding'$]/XCUIElementTypeStaticText[2]")
	public IOSElement exteriorPaintAndSidingCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Foundation'")
	public IOSElement foundationText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Foundation'$]")
	public IOSElement foundationCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Foundation'$]/XCUIElementTypeStaticText[2]")
	public IOSElement foundationCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='E/FO'")
	public IOSElement eFOText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'E/FO'$]")
	public IOSElement eFOCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'E/FO'$]/XCUIElementTypeStaticText[2]")
	public IOSElement eFOCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Kitchen'")
	public IOSElement kitchenText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Kitchen'$]")
	public IOSElement kitchenCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Kitchen'$]/XCUIElementTypeStaticText[2]")
	public IOSElement kitchenCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Bathroom'")
	public IOSElement bathroomText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Bathroom'$]")
	public IOSElement bathroomCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Bathroom'$]/XCUIElementTypeStaticText[2]")
	public IOSElement bathroomCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Interior Paint'")
	public IOSElement interiorPaintText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Interior Paint'$]")
	public IOSElement interiorPaintCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Interior Paint'$]/XCUIElementTypeStaticText[2]")
	public IOSElement interiorPaintCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Flooring'")
	public IOSElement flooringText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Flooring'$]")
	public IOSElement flooringCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Flooring'$]/XCUIElementTypeStaticText[2]")
	public IOSElement flooringCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Plumbing'")
	public IOSElement plumbingText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Plumbing'$]")
	public IOSElement plumbingCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Plumbing'$]/XCUIElementTypeStaticText[2]")
	public IOSElement plumbingCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='HVAC'")
	public IOSElement hVACText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'HVAC'$]")
	public IOSElement hVACCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'HVAC'$]/XCUIElementTypeStaticText[2]")
	public IOSElement hVACCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Electrical'")
	public IOSElement electricalText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Electrical'$]")
	public IOSElement electricalCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Electrical'$]/XCUIElementTypeStaticText[2]")
	public IOSElement electricalCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Fixtures'")
	public IOSElement fixturesText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Fixtures'$]")
	public IOSElement fixturesCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Fixtures'$]/XCUIElementTypeStaticText[2]")
	public IOSElement fixturesCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Miscellaneous'")
	public IOSElement miscellaneousText;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Miscellaneous'$]")
	public IOSElement miscellaneousCell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Miscellaneous'$]/XCUIElementTypeStaticText[2]")
	public IOSElement miscellaneousCost;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name =='Total Repairs'")
	public IOSElement totalRepairs;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/**/XCUIElementTypeCell[$name == 'Total Repairs'$]/XCUIElementTypeStaticText[2]")
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
			String path = "/src/main/resources/";
			if((element.equals(roofingText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/roofing.png")==0)){
				return true;
			}
			else if((element.equals(doorAndWindowstext))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/doorAndWindows.png")==0)){
				return true;
			}
			else if((element.equals(exteriorPaintAndSidingText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/exteriorPaintAndSiding.png")==0)){
				return true;
			}
			else if((element.equals(foundationText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/foundation.png")==0)){
				return true;
			}
			else if((element.equals(eFOText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/eFO.png")==0)){
				return true;
			}
			else if((element.equals(kitchenText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/kitchen.png")==0)){
				return true;
			}
			else if((element.equals(bathroomText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/bathroom.png")==0)){
				return true;
			}
			else if((element.equals(interiorPaintText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/interiorPaint.png")==0)){
				return true;
			}
			else if((element.equals(flooringText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/flooring.png")==0)){
				return true;
			}
			else if((element.equals(plumbingText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/plumbing.png")==0)){
				return true;
			}
			else if((element.equals(hVACText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/hVAC.png")==0)){
				return true;
			}
			else if((element.equals(electricalText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/electrical.png")==0)){
				return true;
			}
			else if((element.equals(fixturesText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/fixtures.png")==0)){
				return true;
			}
			else if((element.equals(miscellaneousText))&&(ImageClass.image(path+"screenshot.png", path+"screenshots/REPAIRS MENU/miscellaneous.png")==0)){
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
