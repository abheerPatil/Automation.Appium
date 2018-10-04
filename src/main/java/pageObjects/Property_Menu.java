package pageObjects;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.ios.touch.IOSPressOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_Menu {

	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
		
	public Property_Menu(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 32 
/**************************/	
	
	//PROPERTY IMAGE
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther/XCUIElementTypeImage[1]")
	public IOSElement propertyImage;
	
	//ADD PROPERTY IMAGE BUTTON
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Add'")
	public IOSElement imageAddBtn;
	
	//CAMERA LOGO WITH ADD BUTTON
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeImage' AND name == 'Camera'")
	public IOSElement cameraImage;
	
	//SELLER CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[1]")
	public IOSElement sellerCell;
	
	//SELLER TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Seller'")
	public IOSElement sellerText;
	
	//HOUSE DETAILS CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]")
	public IOSElement houseDetailsCell;
	
	//HOUSE DETAILS TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'House Details'")
	public IOSElement houseDetailsText;
	
	//COMPARABLES CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]")
	public IOSElement comparablesCell;
	
	//COMPARABLES TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Comparables'")
	public IOSElement comparablesText;
	
	//COMPARABLE MAP CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[4]")
	public IOSElement comparablesMapCell;
	
	//COMPARABLE MAP TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Comparable Map'")
	public IOSElement comparablesMapText;
	
	//NEIGHBORHOOD CLASS CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]")
	public IOSElement neighbourhoodClassCell;
	
	//NEIGHBORHOOD CLASS TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Neighborhood Class'")
	public IOSElement neighbourhoodClassText;
	
	//REPAIRS CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]")
	public IOSElement repairsCell;
	
	//REPAIRS TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Repairs'")
	public IOSElement repairsText;
	
	//PHOTOS CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]")
	public IOSElement photosCell;
	
	//PHOTOS TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Photos'")
	public IOSElement photosText;
	
	//MESSAGES CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]")
	public IOSElement messagesCell;
	
	//MESSAGES TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Messages'")
	public IOSElement messagesText;
	
	//PROPERTY ANALYSIS REPORT CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]")
	public IOSElement propertyAnalysisReportCell;
	
	//PROPERTY ANALYSIS REPORT TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Property Analysis Report'")
	public IOSElement propertyAnalysisReportText;
	
	//LOAN CELL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[10]")
	public IOSElement loanCell;
	
	//LOAN TEXT
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Loan'")
	public IOSElement loanText;
	
	//HOUSE DETAIL FILLED TICK
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeImage[1]")
	public IOSElement houseDetailsTick;
	
	//HOUSE DETAILS DEFAULT DASH
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public IOSElement houseDetailsDash;
	
	//COMAPARABLES DASH/AMOUNT
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	public IOSElement comparablesAmount;
	
	//NEIGHNORHOOD CLASS DASH/LEVEL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public IOSElement neighborhoodClassLevel;
	
	//REPAIRS DASH/LEVEL
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public IOSElement repairsAmount;
	
	//PHOTOS DASH/COUNT
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	public IOSElement photosCount;
	
	//MESSAGE DASH
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[2]")
	public IOSElement messageDash;
	
	//MESSAGE COUNT
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]/XCUIElementTypeCell[9]/XCUIElementTypeButton")
	public IOSElement messagesCount;
	
	//OFFLINE MESSAGE
	@iOSXCUITFindBy(accessibility="You are currently working offline. Your work will be saved after you connect to the internet.")
	public IOSElement offlineMessage;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[1]")
	public IOSElement leftNavMenu;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*METHODS COUNT : 4
	 * 1. clickMenuItem(IOSElement element)
	 * 2. ifContainsPhoto()
	 * 3. checkStatusOfMenuItems(IOSElement element)
	 * 4. checkSelection(IOSElement element)
	 */
/************************************/
	
	public boolean swipe(String direction){
		try{
			JavascriptExecutor js = driver;
		    HashMap<String, String> swipeObject = new HashMap<String, String>();
		    swipeObject.put("direction", direction);
		    swipeObject.put("element", leftNavMenu.getId());
		    js.executeScript("mobile: swipe", swipeObject);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - swipe : "+e);
			return false;
		}
	}
	
	
	/*Method to click left bar menu item.
	 * Parameters : IOSElement(element) 
	 * Returns : true if operation completed and false if not.
	 */
		
	public boolean clickMenuItem(IOSElement element){
		try{
			if((element.equals(loanText))||(element.equals(loanCell))){
				IOSTouchAction ob = new IOSTouchAction(driver);
				ob.press(IOSPressOptions.iosPressOptions().withPosition(PointOption.point(0,messagesCell.getLocation().getY()))).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2))).moveTo(PointOption.point(0, photosCell.getLocation().getY())).perform();
				element.click();
				return true;
			}
			else{
				element.click();
				return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - clickMenuItem : "+e);
			return false;
		}
	}
	
	/*Method to check if property contains an image or not.
	 * Parameters : null 
	 * Returns : true if contains a photo and false if not.
	 * NOTE: it does not compares an image, it just checks whether the placeholder consist of any image or not.
	 */
	public boolean ifContainsPhoto(){
		try{
			if(propertyImage.getAttribute("name").equals("emptyStateinLeftBar")){
				return false;
			}
			else{
				return true;
			}
		}
		catch(Exception e){
			System.err.println("");
			return false;
		}
	}
	
	/*Method to check the attribute of valid menu items.
	 * Parameters : IOSElement(element) 
	 * Returns : Integer(Integer for count, -1 for dash, -2 for tick, -3 for wrong input and -4 for exception)
	 */
	public int checkStatusOfMenuItems(IOSElement element){
		try{
			if((element.equals(houseDetailsText))||(element.equals(houseDetailsCell))){
				try{
					if(houseDetailsDash.isDisplayed()){
						return -1;
					}
				}
				catch(Exception e){
					return -2;
				}
			}
			else if((element.equals(comparablesCell))||(element.equals(comparablesText))){
					if(comparablesAmount.getAttribute("name").toString().equals("-")){
						return -1;
					}
					else{
						String amt = comparablesAmount.getAttribute("name").toString();
						int amount = Integer.parseInt(amt);
						return amount;
					}
				}
			else if((element.equals(neighbourhoodClassCell))||(element.equals(neighbourhoodClassText))){
				if(neighborhoodClassLevel.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = neighborhoodClassLevel.getAttribute("name").toString();
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(repairsCell))||(element.equals(repairsText))){
				if(repairsAmount.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = repairsAmount.getAttribute("name").toString();
					amt = amt.substring(1);
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(photosCell))||(element.equals(photosText))){
				if(photosCount.getAttribute("name").toString().equals("-")){
					return -1;
				}
				else{
					String amt = photosCount.getAttribute("name").toString();
					int amount = Integer.parseInt(amt);
					return amount;
				}
			}
			else if((element.equals(messagesText))||(element.equals(messagesCell))){
				try{
					if(messageDash.isDisplayed()){
						return -1;
					}
				}
				catch(Exception e){
					int amount = Integer.parseInt(messagesCount.getAttribute("name").toString());
					return amount;
				}
			}
				return -3;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - checkStatusOfMenuItems : "+e);
			return -4;
		}
	}
	
	/*Method to check whether an item is selected or not.
	 * Parameters : IOSElement(element) 
	 * Returns : true if selected and false if not.
	 * NOTE: In this method a screenshot is compared with newly taken one, need to update if there is some sort of changes in UI.
	 */
	public boolean checkSelection(int selection){
		try{
			String path = "src/main/resources/";
			if(selection == 1){
				ExtraFunctionalityCheck.getScreenshots(sellerText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/sellerSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			
			else if(selection == 2){
				ExtraFunctionalityCheck.getScreenshots(houseDetailsText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/houseDetailsSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 3){
				ExtraFunctionalityCheck.getScreenshots(comparablesText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/comparablesSelected.png")<=100){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 4){
				ExtraFunctionalityCheck.getScreenshots(comparablesMapText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/comparablesMapSelected.png")<=10){
					return true;
				}
				else {
					return false;
				}
			}
			else if(selection == 5){
				ExtraFunctionalityCheck.getScreenshots(neighbourhoodClassText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/neighbourhoodClassSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 6){
				ExtraFunctionalityCheck.getScreenshots(repairsText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/repairsSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 7){
				ExtraFunctionalityCheck.getScreenshots(photosText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/photosSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 8){
				ExtraFunctionalityCheck.getScreenshots(messagesText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/messagesSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 9){
				ExtraFunctionalityCheck.getScreenshots(propertyAnalysisReportText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/propertyAnalysisReportSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			else if(selection == 10){
				ExtraFunctionalityCheck.getScreenshots(loanText);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/PROPERTY MENU/SELECTED/loanSelected.png")<=10){
					return true;
				}
				else {
					return false;
				}
			}
			return false;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Menu, in method - checkSelection : "+e);
			return false;
		}
	}
	
}
