package utility;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;



public class ExtraFunctionalityCheck {	
/*********************************************************************METHODS**********************************************************************************************/	
	/*METHODS COUNT: 
	 * 1. getNumberFromString(String)
	 * 2. getScreenshots(MobileElement element)
	 * 3. wait(MobileElement element, IOSDriver driver) 
	 * 4. goOffline()
	 * 5.
	 */
/***************************************************************/	
	
	/*Method to convert a String representation of numbers into Integer.
	 * Parameters : String 
	 * Returns : Integer representation of String else 0 if there is an exception.
	 */
	
	public static int getNumberFromString(String s){
		try{
			if(s.contains(" ")){
		           s= s.substring(0, s.indexOf(" ")); 
		           return Integer.parseInt(s);
		        }    
			return Integer.parseInt(s);
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - getNumberFromString :"+e);
			return 0;
		}
	}
	
	/*Method to get screenshot.
	 * Parameters : MobileElement 
	 * Returns : screenshot of the screen in the file destination assigned below.
	 */
	
	public static void getScreenshots(MobileElement element){
		  try{
			File screenshot = element.getScreenshotAs(OutputType.FILE);
			File screenshotLocation1 = new File("src/main/resources/screenshot.png");
			FileUtils.copyFile(screenshot, screenshotLocation1); 
		  }
		  catch(Exception e){
			  System.err.println("Exception in class - ExtraFunctionalityCheck, in method - getScreenshots :"+e);
		  }
	}
	
	/*Method for explicit wait.
	 * Parameters : MobileElement, IOSDriver 
	 * Returns : null.
	 */
	public static void wait(MobileElement element, IOSDriver<MobileElement>driver){
		try{
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - wait :"+e);
		}
	}
	
	/*Method to toggle WiFi on/off.
	 * Parameters : null
	 * Returns : null.
	 */
	
	public static void toggleWifi(IOSDriver<MobileElement> driver){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.longPress(PointOption.point(0, 755)).moveTo(PointOption.point(0, 200)).release().perform();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeSwitch' AND name == 'wifi-button'")).click();
			driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeOther' AND name CONTAINS 'valuechek'")).click();
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - toggleWifi :"+e);
		}
	}
	
	public static void waitForElement(MobileElement element, IOSDriver<MobileElement>driver, int time){
		try{
			long currentTime = System.currentTimeMillis();
			long end = currentTime+time;
			while(currentTime<end){
				try{
					element.isDisplayed();
					break;
				}
				catch(Exception e){}
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - waitForElement :"+e);
		}
	}
	
	public static void waitImplicit(int time){
		try{
			boolean a = true;
			long currentTime = System.currentTimeMillis();
			long end = currentTime+time;
			while(a == true){
				if(currentTime > end){
					a = false;
					break;
				}
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - ExtraFunctionalityCheck, in method - waitForElement :"+e);
		}
	}
	
}
