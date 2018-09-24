package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class StatusBar {
	
	IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public StatusBar(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT : 10
/***************************/			
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'iPad')]")
	private static IOSElement iPad; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'3 Wi-Fi bars')]")
	private static IOSElement wifiBar; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'M')]")
	private static IOSElement time; 
	
	@iOSFindBy(xpath="//XCUIElementTypeOther[contains(@name,'battery power, Charging')]")
	private static IOSElement charging; 
	

/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 2
	 * 1. isDisplayed()
	 * 2. isOffline()
	 */
/*******************************************************/
	
	/*Method to check whether status bar is visible or not.
	 * Parameters : null 
	 * Returns : true if visible , false otherwise.
	 */
	public boolean isDisplayed(){
		try{
		return ((iPad.isDisplayed())&&(wifiBar.isDisplayed())&&(time.isDisplayed())&&(charging.isDisplayed()));
		}
		catch(Exception e){
			System.err.println("Exception in class - StatusBar, in method - isDisplayed : "+e);
			return false;
		}
	}
	
	/*Method to check WiFi is available or not.
	 * Parameters : null 
	 * Returns : true if available , false otherwise.
	 */
	public boolean isOffline(){
		try{
			try{
				wifiBar.isDisplayed();
				return true;
			}
			catch(Exception f){
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - StatusBar, in method - isOffline : "+e);
			return false;
		}
	}
}
