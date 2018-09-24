package pageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

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

public class HomePage {
	
	IOSDriver<MobileElement> driver;

/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	
	public HomePage(IOSDriver<MobileElement> driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT : 6***
/**************************/	
	
	//MENU
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeButton[1]")
	public IOSElement menuButton;
	
	//MENU TABLE
	@iOSXCUITFindBy(className="XCUIElementTypeTable")
	public IOSElement menuTable;
	
	//PROPERTY PHASES
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/**/XCUIElementTypeOther[2]")
	public IOSElement propertyPhasesCell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'PROPERTY PHASES'")
	public IOSElement propertyPhasesBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public IOSElement newBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public IOSElement newPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public IOSElement activeBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeStaticText[2]")
	public IOSElement activePropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
	public IOSElement pendingBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[2]")
	public IOSElement pendingPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]")
	public IOSElement purchaseBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeStaticText[2]")
	public IOSElement purchasedPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]")
	public IOSElement archiveBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeStaticText[2]")
	public IOSElement archivePropCount;
	
	//LOAN PHASES
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/**/XCUIElementTypeOther[3]")
	public IOSElement loanPhasesCell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'LOAN PHASES'")
	public IOSElement loanPhasesBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[1]")
	public IOSElement submittedBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeStaticText[2]")
	public IOSElement submittedPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[1]")
	public IOSElement inReviewBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeStaticText[2]")
	public IOSElement inReviewPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[1]")
	public IOSElement deniedBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeStaticText[2]")
	public IOSElement deniedPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[1]")
	public IOSElement tabledBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeStaticText[2]")
	public IOSElement tabledPropCount;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[1]")
	public IOSElement approvedBtn;
	
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeStaticText[2]")
	public IOSElement approvedPropCount;
	
	//DATE ADDED
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/**/XCUIElementTypeOther[4]")
	public IOSElement dateAddedCell;
	
	@iOSXCUITFindBy(accessibility="3 Months Ago")
	public IOSElement threeMonthsAgoBtn;
	
	@iOSXCUITFindBy(accessibility="6 Months Ago")
	public IOSElement sixMonthsAgoBtn;
	
	@iOSXCUITFindBy(accessibility="12 Months Ago")
	public IOSElement twelveMonthsAgoBtn;
	
	//TEAM
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/**/XCUIElementTypeOther[5]")
	public IOSElement teamCell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'TEAM'")
	public IOSElement teamBtn;
	
	@iOSXCUITFindBy(accessibility="Kiwi1 Tech")
	public IOSElement kiwitech1Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi1 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi1PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi2 Tech")
	public IOSElement kiwitech2Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi2 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi2PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi3 Tech")
	public IOSElement kiwitech3Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi3 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi3PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi4 Tech")
	public IOSElement kiwitech4Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi4 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi4PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi5 Tech")
	public IOSElement kiwitech5Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi5 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi5PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi6 Tech")
	public IOSElement kiwitech6Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi6 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi6PropCount;
	
	@iOSXCUITFindBy(accessibility="Kiwi7 Tech")
	public IOSElement kiwitech7Btn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Kiwi7 Tech']/following::XCUIElementTypeStaticText")
	public IOSElement kiwi7PropCount;
	
	//SETTINGS
	@iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTable/**/XCUIElementTypeOther[6]")
	public IOSElement settingsCell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'SETTINGS'")
	public IOSElement settingsBtn;
	
	@iOSXCUITFindBy(accessibility="Pricing Profiles")
	public IOSElement pricingProfileBtn;
	
	@iOSXCUITFindBy(accessibility="FAQ")
	public IOSElement fAQBtn;
	
	@iOSXCUITFindBy(accessibility="Support")
	public IOSElement supportBtn;
	
	@iOSXCUITFindBy(accessibility="Terms and Conditions")
	public IOSElement termsAndConditionBtn;
	
	@iOSXCUITFindBy(accessibility="Privacy Policy")
	public IOSElement privacyPolicyBtn;
	
	@iOSXCUITFindBy(accessibility="Feedback")
	public IOSElement feedbackBtn;
	
	@iOSXCUITFindBy(accessibility="Log Out")
	public IOSElement logOutBtn;
	
	//HEADER
	@iOSXCUITFindBy(accessibility="My Properties")
	public IOSElement homePageHeading;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'search'")
	public IOSElement searchBar;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'iconBell'")
	public IOSElement notificationBell;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'iconsNewProperty'")
	public IOSElement addPropertyBtn;
	
	//PROPERTY CARDS
	@iOSXCUITFindBy(xpath="//XCUIElementTypeImage[@name='card']//parent::XCUIElementTypeOther")
	public ArrayList<IOSElement> cards;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeImage[@name='card']//parent::XCUIElementTypeOther)[10]")
	public IOSElement finalRow;
	
	@iOSXCUITFindBy(xpath="(//XCUIElementTypeImage[@name='card']//parent::XCUIElementTypeOther)[4]")
	public IOSElement secondRow;
	
	//NOTIFICATION BELL
	
	//Details of first property in notification bell
	@iOSXCUITFindBy(iOSNsPredicate=" rect.y == 146 OR rect.y == 175 OR rect.y == 171 ")
	public ArrayList<IOSElement> firstNotification;
	
	@iOSXCUITFindBy(iOSNsPredicate=" type == 'XCUIElementTypeButton' AND name == 'See All'")
	public IOSElement seeAllBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate=" rect.x = 912 AND rect.y = 26")
	public IOSElement notificationCountElement;
	

/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 1
	 * 1. isDisplayed(MobileElement element)  
	 * 2. clickBtn(MobileElement element)
	 * 3.
	 * 4. checkPropertyPhaseSelectedItem(Integer cell-no)
	 * 5. checkLoanPhaseSelectedItem(Integer cell-no)
	 * 6. checkDateAddedSelectedItem(Integer cell-no)
	 * 7. checkHeaderOpened(Integer cell-no)
	 * 8. userItems(String user)
	 * 9. countProperties(MobileElement element)
	 * 10. swipeProperties(null)
	 * 11. findPropByString(Integer totalPropShown , String string)
	 * 12. findPropByIndex(Integer totalPropShown , Integer index)
	 * 13. checkFirstNotification(String provided address/project name)
	 * 14. notificationCount(null)
	 * 15. swipe()
	 */
/**************************************************************************/
	
	/*Method to check if an element is displayed or not.
	 * Parameters : MobileElement 
	 * Returns : true is action is done and false if there is any exception in that.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean isDisplayed(MobileElement element){
		try{
			element.isDisplayed();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - isDisplayed :"+e);
			return false;
		}
	}
	
	
	/*Method to click an element.
	 * Parameters : MobileElement
	 * Returns : true is action is done and false if there is any exception in that. 
	 */
	public boolean clickBtn(MobileElement element){
		try{
			element.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - clickBtn : "+e);
			return false;
		}
	}
	
		
	/*Method to check if Property Phase Items is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkPropertyPhaseSelectedItem(int i){
		String path = "src/main/resources/";
	try{
		switch(i){
		
		//New
		case 1 :  ExtraFunctionalityCheck.getScreenshots(newBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/NewBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		
		//Active
		case 2 :  ExtraFunctionalityCheck.getScreenshots(activeBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ActiveBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		//Pending
		case 3 :  ExtraFunctionalityCheck.getScreenshots(pendingBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PendingBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}

		//Purchased
		case 4 :  ExtraFunctionalityCheck.getScreenshots(purchaseBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/PurchaseBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}

		//Archived
		case 5 :  ExtraFunctionalityCheck.getScreenshots(archiveBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/PROPERTY PHASES/ArchiveBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		}
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkPropertyPhaseSelectedItem :"+e);
			return false;
		}
	}	
	
	
	/*Method to check if Loan Phase Item is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkLoanPhaseSelectedItem(int i){
		String path = "src/main/resources/";
		
		try{
		switch(i){ 
		//Submitted
		case 1 :  ExtraFunctionalityCheck.getScreenshots(submittedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/LOAN PHASES/SubmittedBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		
		//In Review
		case 2 :  ExtraFunctionalityCheck.getScreenshots(inReviewBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/LOAN PHASES/InReviewBtnClicked.png")<10){
					return true;
				}
					else{
						return false;
					}				
		//Denied
		case 3 :  ExtraFunctionalityCheck.getScreenshots(deniedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/LOAN PHASES/DeniedBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		//Tabled
		case 4 :  ExtraFunctionalityCheck.getScreenshots(tabledBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/LOAN PHASES/TabledBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		//Approved
		case 5 :  ExtraFunctionalityCheck.getScreenshots(approvedBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/LOAN PHASES/ApprovedBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		}
		return true;
		}	
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkLoanPhaseSelectedItem :"+e);
			return false;
		}
	}	
	
	
	/*Method to check if Loan Phase Item is in selected state or not.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if in selected state and false if not.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkDateAddedSelectedItem(int i){
		String path = "src/main/resources/";
		try{
		switch(i){
		//3 Months
		case 1 :  ExtraFunctionalityCheck.getScreenshots(threeMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/DATE ADDED/ThreeMonthsBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}

		//6 Months
		case 2 :  ExtraFunctionalityCheck.getScreenshots(sixMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/DATE ADDED/SixMonthsBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		//12 Months
		case 3 :  ExtraFunctionalityCheck.getScreenshots(twelveMonthsAgoBtn);
				if(ImageClass.image(path+"screenshot.png", path+"screenshots/HOME PAGE MENU/MENU ITEMS/DATE ADDED/TwelveMonthsBtnClicked.png")<10){
					return true;
				}
				else{
					return false;
				}
		}	
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkdateAddedSelectedItem :"+e);
			return false;
		}
	}
	
	
	/*Method to check if Menu Header is open or close.
	 * Parameters : Integer(cell no. in the menu) 
	 * Returns : true if opened and false if closed
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean checkHeaderOpened(int i){
		try{
		switch(i){
		//PROPERTY PHASES
		case 1 :  
				try{
					if(activeBtn.getAttribute("visible").equals("true")){
						return true;
					}
					else{
						return false;
					}
				}
				catch(Exception e){
					return false;
				}

		//LOAN PHASES
		case 2 : 
			try{
				if(submittedBtn.getAttribute("visible").equals("true")){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				return false;
			}
			
		//DATE ADDED
		case 3 :  
			try{
				if(threeMonthsAgoBtn.getAttribute("visible").equals("true")){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				return false;
			}
			
		//TEAM
		case 4 :  
			try{
				if(kiwi1PropCount.getAttribute("visible").equals("true")){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				return false;
			}	
			
		//SETTINGS
		case 5 :  
			try{
				if(pricingProfileBtn.getAttribute("visible").equals("true")){
					return true;
				}
				else{
					return false;
				}
			}
			catch(Exception e){
				return false;
			}	
			}	
			
		return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkHeaderOpened :"+e);
			return false;
		}
	}
	
	
	/*Method to check if these users are displayed or not.
	 * Parameters : String(user's name) 
	 * Returns : true if appropriate team is displayed.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public boolean userItems(String user){
		
		try{
			if((user.equalsIgnoreCase("kiwitech1"))||(user.equalsIgnoreCase("kiwitech2"))||(user.equalsIgnoreCase("kiwitech4"))){
				kiwitech1Btn.isDisplayed();
				kiwitech2Btn.isDisplayed();
				kiwitech4Btn.isDisplayed();
				return true;
			}
			else if((user.equalsIgnoreCase("kiwitech3"))||(user.equalsIgnoreCase("kiwitech6"))){
				kiwitech3Btn.isDisplayed();
				kiwitech6Btn.isDisplayed();
				return true;
			}
			else if((user.equalsIgnoreCase("kiwitech5"))||(user.equalsIgnoreCase("kiwitech7"))){
				kiwitech5Btn.isDisplayed();
				kiwitech7Btn.isDisplayed();
				return true;
			}
			else{
				return false;
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - userItems :"+e);
			return false;
		}
	}
	
	/*Method to get Count of Number of properties as per selection
	 * Parameter : MobileElement 
	 * Returns : The Integer representation of count.
	 * NOTE: Needs scrolling if data is not currently on screen but is on page
	 */
	public int countProperties(MobileElement element){
		try{
			String s = element.getAttribute("value").toString();
			return ExtraFunctionalityCheck.getNumberFromString(s);
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - countProperties :"+e);
			return 0;
		}
	}
	
	/*Method to swipe Properties.
	 * Parameters : Null 
	 * Returns : Null
	 * NOTE: Scrolling is done in two phases, first the Third Row swipes to top and then the Second Row Swipes to Top.
	 */
	
	public void swipeProperties(){
		try{
			IOSTouchAction ob = new IOSTouchAction(driver);
			ob.press(PointOption.point(0,finalRow.getLocation().getY())).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(6))).moveTo(PointOption.point(homePageHeading.getRect().getX(), homePageHeading.getRect().getY())).release().perform();
			ob.press(PointOption.point(0,secondRow.getLocation().getY())).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).moveTo(PointOption.point(homePageHeading.getRect().getX(), homePageHeading.getRect().getY())).release().perform();
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - swipeProperties :"+e);
		}
	}
	
	/*Method to Find a Property on the basis of Project Name, Address, Appointment Date, House Details.
	 * Parameters : integer(total number of property selected) , String (the string to identify the element) 
	 * Returns : MobileElement of the property being searched.
	 * NOTE: Should be used in conjunction to countProperties method
	 */
	/*
	public MobileElement findPropByString(int totalPropShown , String string){
		try{
			int loops = totalPropShown / 12;
			for(int i=0;i<=loops;i++){
				try{
					MobileElement element = driver.findElementByAccessibilityId(string);
					return element;
				}
				catch(Exception e){
					swipeProperties();
					continue;
				}
			}
			System.out.println("No Property Found");
			return null;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - findPropByString :"+e);
			return null;
		}
	}
	*/
	/*Method to Find a Property on the basis of its index.
	 * Parameters : integer(total number of property selected) , integer (the index of the element) 
	 * Returns : MobileElement of the property being searched.
	 * NOTE: Should be used in conjunction to countProperties method
	 */
	/*
	public MobileElement findPropByIndex(int totalPropShown , int index){
		try{
			int totalLoops = totalPropShown/12;
			int totalRem = totalPropShown%12;
			int loops = index/12;
			int remaining = index%12;
			
			for(int i=0;i<loops;i++){
				swipeProperties();
			}
			List<MobileElement> cards = driver.findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeImage' AND name == 'card' AND visible == 1"));
			if(loops == totalLoops){
				if((totalRem==1)||(totalRem==2)||(totalRem==3)){
					return cards.get(9+remaining);
				}
				else if((totalRem==4)||(totalRem==5)||(totalRem==6)){
					return cards.get(6+remaining);
				}
				else if((totalRem==7)||(totalRem==8)||(totalRem==9)){
					return cards.get(3+remaining);
				}
				else{
					return cards.get(remaining);
				}
			}
			else{
				return cards.get(remaining);
			}
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - findPropByIndex :"+e);
			return null;
		}
	}
	*/
	/*Method to Check if the first notification in notification bell is same as the string provided.
	 * Parameters : String 
	 * Returns : true if the property is same , false otherwise.
	 */
	@SuppressWarnings("unused")
	public boolean checkFirstNotification(String s){
		try{
			for(int i=0;i<firstNotification.size();i++){
				if(firstNotification.get(i).toString().equals(s));{
					return true;
				}
			}
			return false;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - checkFirstNotification :"+e);
			return false;
		}
	}
	
	/*Method to provide the count of notifications on notification bell.
	 * Parameters : null 
	 * Returns : integer representation of notification count.
	 */
	public int notificationCount(){
		try{
			String element = notificationCountElement.getAttribute("Name").toString();
			int count = Integer.parseInt(element);
			return count;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - notificationCount :"+e);
			return 0;
		}
	}
	
	/*Method to swipe nav drawer items.
	 * Parameters : direction (String) 
	 * Returns : true if swipe happens false otherwise.
	 * NOTE: direction should be either up or down.
	 */
	public boolean swipe(String direction){
		try{
			JavascriptExecutor js = driver;
		    HashMap<String, String> swipeObject = new HashMap<String, String>();
		    swipeObject.put("direction", direction);
		    swipeObject.put("element", menuTable.getId());
		    js.executeScript("mobile: swipe", swipeObject);
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - HomePage, in method - swipe :"+e);
			return false;
		}
	}
	
	public boolean swipeTillFound(IOSElement element , String direction){
		try{
			boolean a = false;
			while(a == false){
				try{
					if(element.getAttribute("visible").equals("true")){
						a = true;
					}
					else{
						JavascriptExecutor js = driver;
					    HashMap<String, String> swipeObject = new HashMap<String, String>();
					    swipeObject.put("direction", direction);
					    swipeObject.put("element", menuTable.getId());
					    js.executeScript("mobile: swipe", swipeObject);
					}
				}
				catch(Exception e){
					JavascriptExecutor js1 = driver;
				    HashMap<String, String> swipeObject1 = new HashMap<String, String>();
				    swipeObject1.put("direction", direction);
				    swipeObject1.put("element", menuTable.getId());
				    js1.executeScript("mobile: swipe", swipeObject1);
				}
			}
			return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public boolean logOut(int loops){
		try{
			  menuButton.click();
			  for(int i = 0 ; i < loops ; i++ ){
				  swipe("up");
			  }
			  logOutBtn.click();
			  return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - logOut :"+e);
			return false;
		}
	}
}
