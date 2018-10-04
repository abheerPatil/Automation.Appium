package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Property_TopBar {

	IOSDriver<MobileElement> driver;
	
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_TopBar(IOSDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 3
/**************************/	
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'VC' ")
	public IOSElement vcBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'Save Changes' ")
	public IOSElement saveChangesBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type = 'XCUIElementTypeButton' AND name = 'Camera' ")
	public IOSElement cameraBtn;
	
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*METHODS COUNT : 
	 * 1. isSaveEnabled()
	 * 2. clickCameraBtn()
	 * 3. clickVCBtn()
	 * 4. clickSaveChangesBtn()
	 * 5.
	 */
/*****************************/
	
	/*Method to check if Save Changes button is enabled or not.
	 * Parameters : null 
	 * Returns : true if action is enabled and false if not enabled or if there is any exception.
	 */
	public boolean isSaveEnabled(){
		try{
			boolean check = saveChangesBtn.isEnabled();
			return check;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - isSaveEnabled :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click camera button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickCameraBtn(){
		try{
			cameraBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickCameraBtn :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click VC button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickVCBtn(){
		try{
			vcBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickVCBtn :"+e);		//LOG
			return false;
		}
	}
	
	/*Method to click Save Changes button.
	 * Parameters : null 
	 * Returns : true if action is performed and false if there is any exception.
	 */
	public boolean clickSaveChangesBtn(){
		try{
			saveChangesBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - clickSaveChangesBtn :"+e);		//LOG
			return false;
		}
	}
	
	public boolean checkProjectName(String name){
		try{
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND name == '"+name+"'"));
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_TopBar, in method - checkProjectName :"+e);		//LOG
			return false;
		}
	}
	
}
