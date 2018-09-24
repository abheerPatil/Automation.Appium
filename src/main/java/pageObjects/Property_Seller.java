package pageObjects;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
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

public class Property_Seller {

	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
			
	public Property_Seller(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
		//ELEMENTS COUNT: 42 
/**************************/
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name = 'Seller'")
	public IOSElement topBar; 
	
	@iOSXCUITFindBy(accessibility="Project Information")
	public IOSElement heading1; 
	
	@iOSXCUITFindBy(accessibility="Name")
	public IOSElement nameLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[2]/XCUIElementTypeTextField")
	public IOSElement nameTextField;
	
	@iOSXCUITFindBy(accessibility="Appointment")
	public IOSElement appointmentLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[3]/XCUIElementTypeButton")
	public IOSElement appointmentField;
	
	@iOSXCUITFindBy(accessibility="Phase")
	public IOSElement phaseLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[4]/XCUIElementTypeButton")
	public IOSElement phaseField;
	
	@iOSXCUITFindBy(accessibility="Team")
	public IOSElement teamLabel; 

	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[5]/XCUIElementTypeButton")
	public IOSElement teamField;
	
	@iOSXCUITFindBy(accessibility="Order ID")
	public IOSElement heading2; 
	
	@iOSXCUITFindBy(accessibility="Red Bell ID")
	public IOSElement redBellIDLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[7]/XCUIElementTypeTextField")
	public IOSElement redBellIDTextField;
	
	@iOSXCUITFindBy(accessibility="Import Property")
	public IOSElement importPropertyBtn; 
	
	@iOSXCUITFindBy(accessibility="Seller Information")
	public IOSElement heading3; 
	
	@iOSXCUITFindBy(accessibility="First Name")
	public IOSElement firstNameLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[1]")
	public IOSElement firstNameTextField;
	
	@iOSXCUITFindBy(accessibility="Last Name")
	public IOSElement lastNameLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[9]/XCUIElementTypeTextField[2]")
	public IOSElement lastNameTextField;
	
	@iOSXCUITFindBy(accessibility="Street Address")
	public IOSElement streetAddressLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[10]/XCUIElementTypeTextField")
	public IOSElement streetAddressTextField;
	
	@iOSXCUITFindBy(accessibility="City")
	public IOSElement cityLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[11]/XCUIElementTypeTextField[1]")
	public IOSElement cityTextField;
	
	@iOSXCUITFindBy(accessibility="State")
	public IOSElement stateLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[11]/XCUIElementTypeTextField[2]")
	public IOSElement stateTextField;
	
	@iOSXCUITFindBy(accessibility="Zip Code")
	public IOSElement zipCodeLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[12]/XCUIElementTypeTextField")
	public IOSElement zipCodeTextField;
	
	@iOSXCUITFindBy(accessibility="Phone Number")
	public IOSElement phoneNumberLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[13]/XCUIElementTypeTextField[1]")
	public IOSElement phoneNumberTextField;
	
	@iOSXCUITFindBy(accessibility="Mobile Phone")
	public IOSElement mobilePhoneLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[13]/XCUIElementTypeTextField[2]")
	public IOSElement mobilePhoneTextField;
	
	@iOSXCUITFindBy(accessibility="Street Address")
	public IOSElement homePhoneLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[14]/XCUIElementTypeTextField[1]")
	public IOSElement homePhoneTextField;
	
	@iOSXCUITFindBy(accessibility="City")
	public IOSElement workPhoneLabel; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[14]/XCUIElementTypeTextField[2]")
	public IOSElement workPhoneTextField;
	
	@iOSXCUITFindBy(accessibility="State")
	public IOSElement emailLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable[2]/XCUIElementTypeCell[15]/XCUIElementTypeTextField")
	public IOSElement emailTextField;
	
	@iOSXCUITFindBy(accessibility="Notes")
	public IOSElement heading4; 
	
	@iOSXCUITFindBy(iOSNsPredicate = "type = 'XCUIElementTypeTextView'")
	public IOSElement notesTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('out of 46 characters')")
	public IOSElement charLimitLabel46; 
	
	@iOSXCUITFindBy(iOSNsPredicate="name CONTAINS('out of 160 characters')")
	public IOSElement charLimitLabel160; 
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name CONTAINS 'johndoe@email.com'")
	public IOSElement emailErrorMessage;

	@iOSXCUITFindBy(accessibility="New")
	public IOSElement newPhase;
	
	@iOSXCUITFindBy(accessibility="Active")
	public IOSElement activePhase;
	
	@iOSXCUITFindBy(accessibility="Submitted")
	public IOSElement submittedhase;
	
	@iOSXCUITFindBy(accessibility="Pending")
	public IOSElement pendingPhase;
	
	@iOSXCUITFindBy(accessibility="Purchased")
	public IOSElement purchasedPhase;
	
	@iOSXCUITFindBy(accessibility="Archive")
	public IOSElement archivePhase;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*METHODS COUNT : 7
	 * 1. isDisplayed(IOSElement element)
	 * 2. enterText(IOSElement element,String input)
	 * 3. verifyData(IOSElement element, String input)
	 * 4. selectItem(IOSElement element, Integer index)
	 * 5. clickBtn(IOSElement element)
	 * 6. swipe(String direction)
	 * 7. selectPicker(Integer column, String direction)
	 */
/**************************/	
	
	/*Method to check if element is displayed or not.
	 * Parameters : IOSElement (element)
	 * Returns : true if displayed , false otherwise
	 */
	public boolean isDisplayed(IOSElement element){
		try{
			element.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Seller, in method - isDisplayed : "+e);
			return false;
		}
	}
	
	/*Method to enter text in fields.
	 * Parameters : IOSElement (element) , String (input) 
	 * Returns : true if action is done, false otherwise.
	 */
	public boolean enterText(IOSElement element,String input){
		try{
			element.sendKeys(input);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Seller, in method - enterText : "+e);
			return false;
		}
	}
	
	/*Method to verify value in fields.
	 * Parameters : IOSElement (element) , String (input) 
	 * Returns : true if verification is true, false otherwise.
	 */
	public boolean verifyData(IOSElement element, String input){
		try{
			if(element.getAttribute("value").toString().equals(input)){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Seller, in method - verifyData : "+e);
			return false;
		}
	}
	
	/*Method to tap.
	 * Parameters : IOSElement (element)
	 * Returns : true if action is done, false otherwise.
	 */
	public boolean clickBtn(IOSElement element){
		try{
			element.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Seller, in method - clickBtn : "+e);
			return false;
		}
	}
	
	/*Method to swipe.
	 * Parameters : String (direction) 
	 * Returns : true if action is done, false otherwise
	 * Note : Need appropriate wait statement so that this method executes on accurate screen.
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
			System.err.println("Exception in class - Property_Seller, in method - swipe : "+e);
			return false;
		}
		return false;
	}
	
	
	/*Method to fix date.
	 * Parameters : Integer (column) , String (direction) 
	 * Returns : true if action is done, false otherwise.
	 * NOTE : Direction should be "next" or "previous"
	 */
	public boolean selectPicker(int column, String direction){
		try{
			if(column == 1){
				JavascriptExecutor js = driver;
			    Map<String, Object> params = new HashMap<String, Object>();
			    params.put("order", direction);
			    params.put("offset", 0.10);
			    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 134")).getId());
			    js.executeScript("mobile: selectPickerWheelValue", params);	
			    return true;
			}
			else if(column == 2){
				JavascriptExecutor js = driver;
			    Map<String, Object> params = new HashMap<String, Object>();
			    params.put("order", direction);
			    params.put("offset", 0.10);
			    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 46")).getId());
			    js.executeScript("mobile: selectPickerWheelValue", params);
			    return true;
			}
			else if(column == 3){
				JavascriptExecutor js = driver;
			    Map<String, Object> params = new HashMap<String, Object>();
			    params.put("order", direction);
			    params.put("offset", 0.10);
			    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 50")).getId());
			    js.executeScript("mobile: selectPickerWheelValue", params);
			    return true;
			}
			else if(column == 4){
				JavascriptExecutor js = driver;
			    Map<String, Object> params = new HashMap<String, Object>();
			    params.put("order", direction);
			    params.put("offset", 0.10);
			    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 52")).getId());
			    js.executeScript("mobile: selectPickerWheelValue", params);
			    return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Seller, in method - selectPicker : "+e);
			return false;
		}
		return false;
	}
	
}
