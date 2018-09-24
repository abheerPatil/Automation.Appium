package pageObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_ComparableMap {

	
	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_ComparableMap(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 4
/**************************/

	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Subject Property')")
	public IOSElement subjectPropertyPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Comparable')")
	public List<IOSElement> comparablePin;
	
	@iOSXCUITFindBy(accessibility="Map")
	public IOSElement mapButton;
	
	@iOSXCUITFindBy(accessibility="Satellite")
	public IOSElement satelliteButton;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 5
	 * 1. getSubjectProperty() 
	 * 2. getComparables()
	 * 3. isSelectedBtn(IOSElement element)
	 * 4. zoom(IOSElement element)
	 * 5. splitInfo(String s)
	 */
/*******************************************************/
	
	/*Method to get the subject property information.
	 * Parameters : null 
	 * Returns : String representation of all the data available for subject property.
	 */
	public String getSubjectProperty(){
		try{
			String sp = subjectPropertyPin.getAttribute("name")+""+toString();
			return sp;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_ComparableMap, in method - getSubjectProperty : "+e);
			return null;
		}
	}

	/*Method to get comparable if available .
	 * Parameters : null 
	 * Returns : List of all the comparable consisting of data in String form.
	 */
	public ArrayList<String> getComparables(){
		try{
			ArrayList<String> sp = new ArrayList<String>(); 
			for(int i = 0; i < comparablePin.size() ; i++){
				sp.add(comparablePin.get(i).getAttribute("name").toString());
			}
			return sp;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_ComparableMap, in method - getComparables : "+e);
			return null;
		}
	}
	
	/*Method to check if map or satellite button is selected or not.
	 * Parameters : IOSElement (element) 
	 * Returns : true if selected , false otherwise.
	 */
	public boolean isSelectedBtn(IOSElement element){
		String path = "/Users/kiwitech/Desktop/screenshots/";
		ExtraFunctionalityCheck.getScreenshots(element);
		try{
			if(ImageClass.image(path+"screenshot.png", path+"COMPARABLE MAP/Map.png")==0){
				return true;
			}
			else if(ImageClass.image(path+"screenshot.png", path+"COMPARABLE MAP/Satellite.png")==0){
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_ComparableMap, in method - isSelectedBtn : "+e);
			return false;
		}
	}
	
	/*Method to zoom on a particular element.
	 * Parameters : IOSElement(element) 
	 * Returns : true if action is done , false if caught an exception.
	 * Note : Need loop 
	 */
	public boolean zoom(IOSElement element){
		try{
			Property_ComparableMap ob2 = new Property_ComparableMap(driver);
			JavascriptExecutor js = driver;
			HashMap<String, String> swipeObject = new HashMap<String, String>();
			swipeObject.put("scale", "1.9");
			swipeObject.put("velocity", "1.9");
			swipeObject.put("element", ob2.subjectPropertyPin.getId());
			js.executeScript("mobile: pinch", swipeObject);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_ComparableMap, in method - zoom : "+e);
			return false;
		}
	}
	
	/*Method to split data to form a particular information.
	 * Parameters : String (s)
	 * Returns : Array of all the strings
	 * Note : Maximum size of array is 3. Consists of banner (Subject Property , Comparable) , Address , State and Zip
	 */
	public String[] splitInfo(String s){
		try{
			String sIntoParts[] = s.split(", ");
			return sIntoParts;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_ComparableMap, in method - splitInfo : "+e);
			return null;
		}
	}
}
