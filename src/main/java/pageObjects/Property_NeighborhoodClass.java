package pageObjects;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Property_NeighborhoodClass {

	
	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_NeighborhoodClass(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 43
/**************************/
	
	@iOSXCUITFindBy(accessibility="Map")
	public IOSElement mapBtn;
	
	@iOSXCUITFindBy(accessibility="Satellite")
	public IOSElement satelliteBtn;
	
	@iOSXCUITFindBy(accessibility="Class Selection Arrow")
	public IOSElement dropDown;
	
	@iOSXCUITFindBy(accessibility="Drop Pin")
	public IOSElement dropPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Subject Property')")
	public IOSElement subjectPropertyPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Excellent')")
	public IOSElement excellentPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Good')")
	public IOSElement goodPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Fair')")
	public IOSElement fairPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Poor')")
	public IOSElement poorPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Other')")
	public IOSElement otherPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Church')")
	public IOSElement churchPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Commercial')")
	public IOSElement commercialPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Park')")
	public IOSElement parkPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('School')")
	public IOSElement schoolPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Vacant Lot')")
	public IOSElement vacantLotPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Vacant Lot + Grass> 12')")
	public IOSElement vacantLot_grass12Pin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Vacant Lot With Trash')")
	public IOSElement vacantLot_TrashPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Very poor Condition')")
	public IOSElement veryPoorConditionPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Vacant Boarded')")
	public IOSElement vacantBoardedPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Very Junky Neighbor')")
	public IOSElement veryJunkyNeighborPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('Graffiti')")
	public IOSElement graffitiPin;
	
	@iOSXCUITFindBy(iOSNsPredicate="type = 'XCUIElementTypeOther' AND name CONTAINS ('New Pin')")
	public IOSElement newPin;
	
	@iOSXCUITFindBy(accessibility="Excellent")
	public IOSElement excellentRating;
	
	@iOSXCUITFindBy(accessibility="Good")
	public IOSElement goodRating;
	
	@iOSXCUITFindBy(accessibility="Fair")
	public IOSElement fairRating;
	
	@iOSXCUITFindBy(accessibility="Poor")
	public IOSElement poorRating;
	
	@iOSXCUITFindBy(accessibility="Other")
	public IOSElement otherRating;
	
	@iOSXCUITFindBy(accessibility="Church")
	public IOSElement churchRating;
	
	@iOSXCUITFindBy(accessibility="Commercial")
	public IOSElement commercialRating;
	
	@iOSXCUITFindBy(accessibility="Park")
	public IOSElement parkRating;
	
	@iOSXCUITFindBy(accessibility="School")
	public IOSElement schoolRating;
	
	@iOSXCUITFindBy(accessibility="Vacant Lot")
	public IOSElement vacantLotRating;
	
	@iOSXCUITFindBy(accessibility="Vacant Lot + Grass> 12")
	public IOSElement vacantLot_Grass12Rating;
	
	@iOSXCUITFindBy(accessibility="Vacant Lot With Trash")
	public IOSElement vacantLot_TrashRating;
	
	@iOSXCUITFindBy(accessibility="Very poor Condition")
	public IOSElement verypoorConditionRating;
	
	@iOSXCUITFindBy(accessibility="Vacant Boarded")
	public IOSElement vacantBoardedRating;
	
	@iOSXCUITFindBy(accessibility="Very Junky Neighbor")
	public IOSElement veryjunkyNeighborRating;
	
	@iOSXCUITFindBy(accessibility="Graffiti")
	public IOSElement graffitiRating;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@width = '31']")
	public IOSElement arrowButton;
	
	@iOSXCUITFindBy(accessibility="Remove")
	public IOSElement removeBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[preceding::XCUIElementTypeOther[@name = 'Class']]")
	public List<IOSElement> dropDownItems;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[@name = 'Class']//ancestor::XCUIElementTypeTable")
	public IOSElement dropDownTable;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther[preceding::XCUIElementTypeSegmentedControl]")
	public IOSElement mapScreen;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 5
	 * 1. tapOnCoordinate(Integer x , Integer y) 
	 * 2. dropPinByCoordinates(Integer x , Integer y)
	 * 3. selectItem(Integer index)
	 * 4. dragAndMove(Integer a , Integer b , Integer c , Integer d)
	 * 5. zoomOrPinch(String command)
	 */
/*******************************/	
	
	/*Method to tap on a specific coordinate.
	 * Parameters : Integer(x coordinate) , Integer(y coordinate)
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	/*
	public boolean tapOnCoordinate(int x , int y){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.tap(x, y).perform();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_NeighborhoodClass, in method - tapOnCoordinate :"+e);
			return false;
		}
	}
	*/
	/*Method to drop pin on a specific coordinate.
	 * Parameters : Integer(x coordinate) , Integer(y coordinate)
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	/*
	public boolean dropPinByCoordinates(int x , int y){
		try{
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.longPress(x, y , Duration.ofMillis(5)).perform();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_NeighborhoodClass, in method - dropPinByCoordinates :"+e);
			return false;
		}
	}
	*/
	/*Method to select a specific item from drop down.
	 * Parameters : Integer(row number) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean selectItem(int index){
		try{
			try{
				if(index == 5){
					throw new Exception();
				}
				dropDownItems.get(index-1).click();
				return true;
			}
			catch(Exception e){
				JavascriptExecutor js = driver;
			    HashMap<String, String> swipeObject = new HashMap<String, String>();
			    swipeObject.put("direction", "up");
			    swipeObject.put("element", dropDownTable.getId());
			    js.executeScript("mobile: swipe", swipeObject);
			    dropDownItems.get(4).click();
			    return true;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_NeighborhoodClass, in method - selectItem :"+e);
			return false;
		}
	}
	
	/*Method to move the map.
	 * Parameters : Integer(a offset of starting x) , Integer(b offset of starting y) , Integer(c offset of ending x) , Integer(d offset of ending y) 
	 * Returns : true if action is done and false if there is any exception in that.
	 * Note : (a,b) are start offsets and (c,d) are end offsets. These are added to starting x and y coordinates of the map screen.
	 */
	/*
	public boolean dragAndMove(int a , int b , int c , int d){
		try{
			int x = mapScreen.getLocation().getX();
			int y = mapScreen.getLocation().getY();
			IOSTouchAction ac = new IOSTouchAction(driver);
			ac.longPress(x+a, y+b).moveTo(x+c, y+d).release().perform();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_NeighborhoodClass, in method - dragAndMove :"+e);
			return false;
		}
	}
	*/
	/*Method to zoom or pinch.
	 * Parameters : String(command) 
	 * Returns : true if action is done and false if there is any exception in that.
	 * Note : command - zoom / pinch
	 */
	public boolean zoomOrPinch(String command){
		try{
			JavascriptExecutor js = driver;
		    HashMap<String, String> swipeObject = new HashMap<String, String>();
		    if(command.equalsIgnoreCase("zoom")){
		    	swipeObject.put("scale", "1.5");
			    swipeObject.put("velocity", "1.5");
		    }
		    else if(command.equalsIgnoreCase("pinch")){
		    	swipeObject.put("scale", "0.5");
			    swipeObject.put("velocity", "-1.5");
		    }
		    swipeObject.put("element", mapScreen.getId());
			js.executeScript("mobile: pinch", swipeObject);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_NeighborhoodClass, in method - zoomOrPinch :"+e);
			return false;
		}
	}
	
}
