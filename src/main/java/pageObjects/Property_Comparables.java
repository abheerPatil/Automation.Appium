package pageObjects;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class Property_Comparables {
	
	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_Comparables(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 80 			//NEED TO PROVIDE PROPER XPATHS TO COMPARBLE CHECKBOX
/**************************/
	
	@iOSXCUITFindBy(accessibility="Full Screen")
	public IOSElement fullScreenBtn; 
	
	@iOSXCUITFindBy(accessibility="Comparable 1")
	public IOSElement comparable1; 
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 1'$]")
	public IOSElement comparable1Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 1'$]/**/XCUIElementTypeButton")
	public IOSElement comparable1CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 2")
	public IOSElement comparable2;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 2'$]")
	public IOSElement comparable2Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 2'$]/**/XCUIElementTypeButton")
	public IOSElement comparable2CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 3")
	public IOSElement comparable3;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 3'$]")
	public IOSElement comparable3Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 3'$]/**/XCUIElementTypeButton")
	public IOSElement comparable3CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 4")
	public IOSElement comparable4;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 4'$]")
	public IOSElement comparable4Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 4'$]/**/XCUIElementTypeButton")
	public IOSElement comparable4checkBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 5")
	public IOSElement comparable5;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 5'$]")
	public IOSElement comparable5Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 5'$]/**/XCUIElementTypeButton")
	public IOSElement comparable5CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 6")
	public IOSElement comparable6;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 6'$]")
	public IOSElement comparable6Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 6'$]/**/XCUIElementTypeButton")
	public IOSElement comparable6CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 7")
	public IOSElement comparable7;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 7'$]")
	public IOSElement comparable7Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 7'$]/**/XCUIElementTypeButton")
	public IOSElement comparable7CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 8")
	public IOSElement comparable8;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 8'$]")
	public IOSElement comparable8Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 8'$]/**/XCUIElementTypeButton")
	public IOSElement comparable8CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 9")
	public IOSElement comparable9;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 9'$]")
	public IOSElement comparable9Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 9'$]/**/XCUIElementTypeButton")
	public IOSElement comparable9CheckBox;
	
	@iOSXCUITFindBy(accessibility="Comparable 10")
	public IOSElement comparable10;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 10'$]")
	public IOSElement comparable10Cell;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Comparable 10'$]/**/XCUIElementTypeButton")
	public IOSElement comparable10CheckBox;
	
	@iOSXCUITFindBy(accessibility="Avg. Cost/Sq Ft")
	public IOSElement avgCostSqFtLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[$name == 'Avg. Cost/Sq Ft'$]/XCUIElementTypeStaticText[2]")
	public IOSElement costInBlackBox;
	
	@iOSXCUITFindBy(accessibility="Subject Property")
	public IOSElement subjectPropertyLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCollectionView[1]/**/XCUIElementTypeImage")
	public IOSElement subjectPropertyImage;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Street Address City, State, Zip'$]")
	public IOSElement cell1;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Distance'$]")
	public IOSElement cell2;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Main'$]")
	public IOSElement cell3;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Year Built'$]")
	public IOSElement cell4;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Sold For'$]")
	public IOSElement cell5;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Sale Date'$]")
	public IOSElement cell6;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Days on Market'$]")
	public IOSElement cell7;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Cost Per Sq Ft'$]")
	public IOSElement cell8;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Bedrooms'$]")
	public IOSElement cell9;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Bathrooms'$]")
	public IOSElement cell10;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Garage Size'$]")
	public IOSElement cell11;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'AC'$]")
	public IOSElement cell12;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Garage Conversion'$]")
	public IOSElement cell13;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Exterior Style'$]")
	public IOSElement cell14;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name = 'Notes'$]")
	public IOSElement cell15;
	
	@iOSXCUITFindBy(accessibility="Street Address City, State, Zip")
	public IOSElement streetAddressLabel;
	
	@iOSXCUITFindBy(accessibility="Distance")
	public IOSElement distanceLabel;
	
	@iOSXCUITFindBy(accessibility="Main")
	public IOSElement mainLabel;
	
	@iOSXCUITFindBy(accessibility="Year Built")
	public IOSElement yearBuiltLabel;
	
	@iOSXCUITFindBy(accessibility="Sold For")
	public IOSElement soldForLabel;
	
	@iOSXCUITFindBy(accessibility="Sale Date")
	public IOSElement saleDateLabel;
	
	@iOSXCUITFindBy(accessibility="Days on Market")
	public IOSElement daysOnMarketLabel;
	
	@iOSXCUITFindBy(accessibility="Cost Per Sq Ft")
	public IOSElement costPerSqFtLabel;
	
	@iOSXCUITFindBy(accessibility="Bedrooms")
	public IOSElement bedroomsLabel;
	
	@iOSXCUITFindBy(accessibility="Bathrooms")
	public IOSElement bathroomsLabel;
	
	@iOSXCUITFindBy(accessibility="Garage Size")
	public IOSElement garageSizeLabel;
	
	@iOSXCUITFindBy(accessibility="AC")
	public IOSElement acLabel;
	
	@iOSXCUITFindBy(accessibility="Garage Conversion")
	public IOSElement garageConverisonLabel;
	
	@iOSXCUITFindBy(accessibility="Exterior Style")
	public IOSElement exteriorStyleLabel;
	
	@iOSXCUITFindBy(accessibility="Notes")
	public IOSElement notesLabel;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCollectionView[2]/**/XCUIElementTypeTextView")
	public IOSElement notes;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '250']")
	public IOSElement acTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '250']")
	public IOSElement garageSizeTabHead;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeOther/XCUIElementTypeStaticText[@width = '250']")
	public IOSElement exteriorStyleTabHead;
	
	@iOSXCUITFindBy(accessibility="None")
	public IOSElement none;
	
	@iOSXCUITFindBy(accessibility="No AC")
	public IOSElement noAC;
	
	@iOSXCUITFindBy(accessibility="Central")
	public IOSElement centralAC;
	
	@iOSXCUITFindBy(accessibility="Window")
	public IOSElement windowAC;
	
	@iOSXCUITFindBy(accessibility="Evaporative")
	public IOSElement evaporativeAC;
	
	@iOSXCUITFindBy(accessibility="0")
	public IOSElement zero;
	
	@iOSXCUITFindBy(accessibility="1")
	public IOSElement one;
	
	@iOSXCUITFindBy(accessibility="2")
	public IOSElement two;
	
	@iOSXCUITFindBy(accessibility="3")
	public IOSElement three;
	
	@iOSXCUITFindBy(accessibility="4")
	public IOSElement four;
	
	@iOSXCUITFindBy(accessibility="5")
	public IOSElement five;
	
	@iOSXCUITFindBy(accessibility="Brick- Front")
	public IOSElement brickFront;
	
	@iOSXCUITFindBy(accessibility="Brick- 3 Sides")
	public IOSElement brick3Sides;
	
	@iOSXCUITFindBy(accessibility="Brick- 4 Sides")
	public IOSElement brick4Sides;
	
	@iOSXCUITFindBy(accessibility="Cinder Block")
	public IOSElement cinderBlock;
	
	@iOSXCUITFindBy(accessibility="Frame- Aluminium Siding")
	public IOSElement frameAluminiumSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Asbestos Siding")
	public IOSElement frameAsbestosSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Vinyl Siding")
	public IOSElement frameVinylSiding;
	
	@iOSXCUITFindBy(accessibility="Frame- Wood Siding")
	public IOSElement frameWoodSiding;
	
	@iOSXCUITFindBy(accessibility="Stucco")
	public IOSElement stucco;
	
	@iOSXCUITFindBy(accessibility="Comparable Reports")
	public IOSElement comparableReportsHeading;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name='Comparable Reports']]")
	public IOSElement linkTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'View Red Bell Report'")
	public IOSElement pdfDocument;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeCell[$name == 'Count Twice'$]")
	public List<IOSElement> countTwiceRows;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT:
	 * 1.  swipeTillComparable(Integer i)
	 * 2.  selectingComparableRow(IOSElement element , Integer index)
	 * 3.  swipeTop()
	 * 4.  selectItem(IOSElement element, Integer index)
	 *   selectPicker(Integer column, String direction)
	 * 6.  verifyFields(IOSElement element, String comparable)
	 *   verifyCheckBoxIsSeleceted(IOSElement element)
	 * 8.  getField(IOSElement cell)
	 * 9.  getBox(IOSElement cell)
	 * 10. getStaticField(IOSElement cell)
	 * 11. getTextView(IOSElement cell)
	 * 12. swipeDown()
	 */
/**************************************************************************/
	
	/*Method to swipe till appropriate comparable is found.
	 * Parameters : Integer (Comparable number) 
	 * Returns : true is action is done and false if there is any exception in that.
	 */	
	
	public boolean swipeTillComparable(int i){
		try{
			boolean b = false;
			
			while(b == false){
				try{
					WebDriverWait wait = new WebDriverWait(driver, 5);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Comparable "+i)));
					b = true;
					return b;
					
				}
				catch(Exception e){
					org.openqa.selenium.Dimension size = driver.manage().window().getSize();
				    int startx = (int) (size.width * 0.8);
				    int endx = (int) (size.width * 0.6);
				    int starty = size.height / 2;
				    IOSTouchAction ac = new IOSTouchAction(driver);
				    ac.longPress(PointOption.point(startx,starty)).moveTo(PointOption.point(endx,starty)).release().perform();
				}
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Comparables, in method - swipeTillComparable : "+e);
			return false;
		}
		return false;
	}

	/*Method to select the desired comparable cell.
	 * Parameters :IOSElement (comparable) , Integer (Row number) 
	 * Returns : IOSElement of the cell.
	 * NOTE : No need to scroll, already provided.
	 */
	
	public IOSElement selectingComparableRow(IOSElement element , int index){
		try{
			boolean a = true;
			int count = 1;
			IOSElement ref = element;
			while(a == true){
				int x = ref.getLocation().getX();
				int y = ref.getLocation().getY();
				if(index == count){
					a = false;
					return ref;
				}
				else{
					try{
						IOSElement next = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeCell[preceding::XCUIElementTypeCell[@x = "+x+" and @y = "+y+" ] and @x = "+x+"]"));
						if(next.getAttribute("visible").equals("false")){
							throw new Exception("");
						}
						else{
							ref = next;
							count++;
						}
					}
					catch(Exception e){
						IOSTouchAction ac = new IOSTouchAction(driver);
						ac.longPress(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(6))).moveTo(PointOption.point(x,y/2)).release().perform();
						a = true;
					}
					
				}
			}
		}
		catch(Exception g){
			System.err.println("Exception in class - Property_Comparables, in method - selectingComparableRow : "+g);
			return null;
		}
		return null;
	}
	
	public String findSubjectPropertyData(int row){
		try{
			String result;
			int x , y;
			switch(row){
			
			case 1: x = streetAddressLabel.getLocation().getX();
					y = streetAddressLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
				return result;
				
			case 2: x = distanceLabel.getLocation().getX();
					y = distanceLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
				
			case 3: x = mainLabel.getLocation().getX();
					y = mainLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
		
			case 4: x = yearBuiltLabel.getLocation().getX();
					y = yearBuiltLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
			
			case 5: x = soldForLabel.getLocation().getX();
					y = soldForLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;

			case 6: x = saleDateLabel.getLocation().getX();
					y = saleDateLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
				
			case 7: x = daysOnMarketLabel.getLocation().getX();
					y = daysOnMarketLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;

			case 8: x = costPerSqFtLabel.getLocation().getX();
					y = costPerSqFtLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
					
			case 9: x = bedroomsLabel.getLocation().getX();
					y = bedroomsLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;

			case 10:x = bathroomsLabel.getLocation().getX();
					y = bathroomsLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
					
			case 11:x = garageSizeLabel.getLocation().getX();
					y = garageSizeLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;

			case 12:x = acLabel.getLocation().getX();
					y = acLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;
					
			case 13:x = garageConverisonLabel.getLocation().getX();
					y = garageConverisonLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;

			case 14:x = exteriorStyleLabel.getLocation().getX();
					y = exteriorStyleLabel.getLocation().getY();
					result = driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND rect.y == "+y+" AND rect.x > "+x+"")).getAttribute("name");
					return result;		
				
			default: return null;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - Property_Comparables, in method - selectingComparableRow : "+e);
			return null;
		}
	}
	
	//FOR FIRST ROW FIND THE BUTTON OR STATIC TEXT AS PER USAGE
	public IOSElement getComparableRow(int row , int xComparable){
		try{
			int x = xComparable;
			IOSElement result;
			int y;
			switch(row){
			
			case 1: y = cell1.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+""));
					return result;
				
			case 2: y = cell2.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;
				
			case 3: y = cell3.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;
		
			case 4: y = cell4.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;
			
			case 5: y = cell5.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;

			case 6: y = cell6.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeButton"));
					return result;
				
			case 7: y = cell7.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;

			case 8: y = cell8.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;
					
			case 9: y = cell9.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;

			case 10:y = cell10.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;
					
			case 11:y = cell11.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeButton"));
					return result;

			case 12:y = cell12.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeButton"));
					return result;
					
			case 13:y = cell13.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextField"));
					return result;

			case 14:y = cell14.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeButton"));
					return result;		
			
			case 15:y = cell15.getLocation().getY();
					result = (IOSElement)driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeCell' AND rect.y == "+y+" AND rect.x == "+x+"")).findElement(MobileBy.className("XCUIElementTypeTextView"));
					return result;
					
			default: return null;
			}
		}	
		catch(Exception e){
			System.err.println("Exception in class - Property_Comparables, in method - getComparableRow : "+e);
			return null;
		}
	}
	/*Method to swipe to the top.
	 * Parameters :null 
	 * Returns : null
	 */
	
	 public void swipeTop(){
    	 try{
    		 boolean a = false;
    		 while(a == false){
    			 try{
    				 WebDriverWait wait = new WebDriverWait(driver, 5);
        		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Avg. Cost/Sq Ft")));
        		     a = true;
    			 }
    			 catch(Exception e){
    				 	JavascriptExecutor js = driver;
    		    	    HashMap<String, String> swipeObject = new HashMap<String, String>();
    		    	    swipeObject.put("direction", "down");
    		    	    swipeObject.put("element", driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeCollectionView[1]")).getId());
    		    	    js.executeScript("mobile: swipe", swipeObject);
    			 }
    		 }
    	 }
    	 catch(Exception e){
 			System.err.println("Exception in class - Property_Comparables, in method - swipeTop : "+e);
    	 }
     }
	 
	 /*Method to select item from drop down.
		 * Parameters :IOSElement (cell) , Integer (index of item) 
		 * Returns : true if action is done, false otherwise
		 */
	 public boolean selectItem(IOSElement element, int index){
			try{
						if(exteriorStyleTabHead.getAttribute("name").toString().equals("Exterior Style")){
									if(index == 1){
										none.click();
										return true;
									}
									else if(index == 2){
										brickFront.click();
										return true;
									}
									else if(index == 3){
										brick3Sides.click();
										return true;
									}
									else if(index == 4){
										brick4Sides.click();
										return true;
									}
									else if(index == 5){
										cinderBlock.click();
										return true;
									}
									else if(index == 6){
										frameAluminiumSiding.click();
										return true;
									}
									else if(index == 7){
										frameAsbestosSiding.click();
										return true;
									}
									else if(index == 8){
										frameVinylSiding.click();
										return true;
									}
									else if(index == 9){
										frameWoodSiding.click();
										return true;
									}
									else if(index == 10){
										stucco.click();
										return true;
									}
									else{
										throw new Exception("Wrong Index");
									}
								}
							
						else if(garageSizeTabHead.getAttribute("name").toString().equals("Add-On")){
									if(index == 1){
										none.click();
										return true;
									}
									else if(index == 2){
										one.click();
										return true;
									}
									else if(index == 3){
										two.click();
										return true;
									}
									else if(index == 4){
										three.click();
										return true;
									}
									else if(index == 5){
										four.click();
										return true;
									}
									else if(index == 6){
										five.click();
										return true;
									}
									else{
										throw new Exception("Wrong Index");
									}
								}

						else if(acTabHead.getAttribute("name").toString().equals("AC")){
								if(index == 1){
									noAC.click();
									return true;
								}
								else if(index == 2){
									centralAC.click();
									return true;
								}
								else if(index == 3){
									windowAC.click();
									return true;
								}
								else if(index == 4){
									evaporativeAC.click();
									return true;
								}
								else{
									throw new Exception("Wrong Index");
								}
							}
			}
			catch(Exception e){
				System.err.println("Exception in class - Property_Comparables, in method - selectItem : "+e);
				return false;
			}
			return false;
		}
	 
	 /*Method to select the desired date.
		 * Parameters :Integer (column) , String (direction) 
		 * Returns : returns true if action is done, false otherwise.
		 * NOTE : Directions: up / down
		 */
	 public boolean selectPicker(int column, String direction){
			try{
				if(column == 1){
					JavascriptExecutor js = driver;
				    Map<String, Object> params = new HashMap<String, Object>();
				    params.put("order", direction);
				    params.put("offset", 0.10);
				    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 49")).getId());
				    js.executeScript("mobile: selectPickerWheelValue", params);	
				    return true;
				}
				else if(column == 2){
					JavascriptExecutor js = driver;
				    Map<String, Object> params = new HashMap<String, Object>();
				    params.put("order", direction);
				    params.put("offset", 0.10);
				    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 132")).getId());
				    js.executeScript("mobile: selectPickerWheelValue", params);
				    return true;
				}
				else if(column == 3){
					JavascriptExecutor js = driver;
				    Map<String, Object> params = new HashMap<String, Object>();
				    params.put("order", direction);
				    params.put("offset", 0.10);
				    params.put("element", driver.findElement(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypePickerWheel' AND rect.width = 76")).getId());
				    js.executeScript("mobile: selectPickerWheelValue", params);
				    return true;
				}
				
			}
			catch(Exception e){
				System.err.println("Exception in class - Property_Comparables, in method - selectPicker : "+e);
				return false;
			}
			return false;
		}
	 
	 /*Method to get the verify the values in the fields .
		 * Parameters :IOSElement (element) , String (Expected value) 
		 * Returns : true if actual value is same as expected value.
		 */
	 public boolean verifyFields(IOSElement element, String comparable){
			try{
				if(element.getAttribute("value").equals(comparable)){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				System.err.println("Exception in class - Property_Comparables, in method - verifyFields : "+e);
				return false;
			}
		}
	 
	 /*Method to verify if the checkBox is selected or not.
		 * Parameters :IOSElement (element) 
		 * Returns : true if selected, false if not.
		 */
	 public boolean isComparableSelected(IOSElement element){
			String path = "src/main/resources/";
			ExtraFunctionalityCheck.getScreenshots(element);
			try{
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/COMPARABLES/comparableSelect.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				System.err.println("Exception in class - Property_Comparables, in method - isComparableSelected : "+e);
				return false;
			}
		}
	 
	 public boolean isCountTwiceSelected(IOSElement element){
			String path = "src/main/resources/";
			ExtraFunctionalityCheck.getScreenshots(element);
			try{
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/COMPARABLES/countTwiceSelected.png")<=10){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				System.err.println("Exception in class - Property_Comparables, in method - isCountTwiceSelected : "+e);
				return false;
			}
		}
	 
	 
	 /*Method to get text field from cell.
		 * Parameters :IOSElement (cell) 
		 * Returns : IOSElement of the field.
		 */
	 public IOSElement getField(IOSElement cell){
		 try{
			 IOSElement element = (IOSElement)cell.findElement(By.xpath("//XCUIElementTypeTextField"));
			 return element;
		 }
		 catch(Exception e){
			 System.err.println("Exception in class - Property_Comparables, in method - getField : "+e);
				return null;
		 }
	 }
	 
	 /*Method to get drop down or check box from cell.
		 * Parameters :IOSElement (cell) 
		 * Returns : IOSElement of the desired element.
		 */
	 public IOSElement getBox(IOSElement cell){
		 try{
			 IOSElement element = (IOSElement)cell.findElement(By.xpath("//XCUIElementTypeButton"));
			 return element;
		 }
		 catch(Exception e){
			 System.err.println("Exception in class - Property_Comparables, in method - getBox : "+e);
				return null;
		 }
	 }
	 
	 /*Method to get static text from cell.
		 * Parameters :IOSElement (cell) 
		 * Returns : IOSElement of the static field.
		 */
	 public IOSElement getStaticField(IOSElement cell){
		 try{
			 IOSElement element = (IOSElement)cell.findElement(By.xpath("//XCUIElementTypeStaticField"));
			 return element;
		 }
		 catch(Exception e){
			 System.err.println("Exception in class - Property_Comparables, in method - getStaticField : "+e);
				return null;
		 }
	 }
	 
	 /*Method to get text view from cell.
		 * Parameters :IOSElement (cell) 
		 * Returns : IOSElement of the text view.
		 */
	 public IOSElement getTextView(IOSElement cell){
		 try{
			 IOSElement element = (IOSElement) cell.findElements(By.xpath("//XCUIElementTypeTextView"));
			 return element;
		 }
		 catch(Exception e){
			 System.err.println("Exception in class - Property_Comparables, in method - getTextView : "+e);
			 return null;
		 }
	 }
	 
	 public void swipeDown(){
		 try{
			 JavascriptExecutor js = driver;
			    HashMap<String, String> swipeObject = new HashMap<String, String>();
			    swipeObject.put("direction", "up");
			    swipeObject.put("element", driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeCollectionView[1]")).getId());
			   js.executeScript("mobile: swipe", swipeObject);
		 }
		 catch(Exception e){
			 System.err.println("Exception in class - Property_Comparables, in method - swipeDown : "+e);
		 }
	 }
}
