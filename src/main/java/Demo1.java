/*import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_ComparableMap;
import pageObjects.Property_HouseDetails;
import pageObjects.Property_Menu;
import pageObjects.Property_Repair;
import pageObjects.Property_RepairsMenu;
import pageObjects.Property_Seller;
import utility.ExtraFunctionalityCheck;


public class Demo1 {
	
	public static IOSDriver<MobileElement> driver = null;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeButton[@name='iconBell']/following::XCUIElementTypeStaticText")
	public IOSElement one;
	
	@iOSXCUITFindBy(iOSNsPredicate=" rect.y = 244 ")
	public IOSElement two;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeCell[preceding::XCUIElementTypeStaticText[@name='Count Twice']]")
	public List<IOSElement> some;
	
	public IOSElement addressRow;

	public void setup () throws IOException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "XCUITest");
        caps.setCapability("platformName", "iOS");
        caps.setCapability("platformVersion", "11.3");
        caps.setCapability("deviceName","Admin’s iPad");
        caps.setCapability("udid", "4e9d674970ddf0f3245628d4172d98924445783f");
        caps.setCapability("noReset", "true");
        caps.setCapability("app","/Users/kiwitech/Downloads/ValueChek.ipa");
        caps.setCapability("xcodeOrgId", "Q3HXH3MWZ2");
        caps.setCapability("xcodeSigningId", "iPhone Developer");
        caps.setCapability("newCommandTimeout", 60*300);
        caps.setCapability("useJSONSource", "true");						//it is said that it runs the test faster
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        System.out.println("Done Capabilities");
        LoginPage oo = new LoginPage(driver);
        ExtraFunctionalityCheck.getScreenshots(oo.image);
        HomePage ob1 = new HomePage(driver);
        System.out.println(ob1.cards.size());
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(ob1.cards);
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        IOSTouchAction ac = new IOSTouchAction(driver);
        ob1.findPropByIndex(200, 20).click();
     //   ob1.cards.get(1).click();
        //ob1.cards.get(1).click();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       Property_Menu ob = new Property_Menu(driver);
        ob.repairsCell.click();
        //Property_ComparableMap ob2 = new Property_ComparableMap(driver);
      //  WaitForElementPresent1("//XCUIElementTypeOther[@name = 'Roofing']", 15);
        Property_Repair ob3 = new Property_Repair(driver);
       ob3.swipe(ob3.pricingProfileElementLabel, "up");
      MobileElement abc =  driver.findElement(By.xpath("//XCUIElementTypeCell[preceding::XCUIElementTypeStaticText[@name = 'Pricing Profile Features']]"));
      List<MobileElement> li = abc.findElements(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeTextView'"));
      for(int i = 0 ; i < li.size() ; i++){
    	  if(li.get(i).getAttribute("value")==null){
    		  	li.get(i).clear();
    		  	li.get(i).sendKeys("TRY");
    	  }
    	  
      }
        //ac.longPress(280, 560).moveTo(280, 530).release().perform();
        //ob3.something(ob3.pricingProfileElementLabel, ob3.roofingHeader);
     //   ob3.newSwipe(ob3.pricingProfileElementLabel, "up");
//        driver.findElements(MobileBy.iOSNsPredicateString("type = 'XCUIElementTypeCell' AND visible == 1 "));
   //     for(int i = 0 ; i < 35 ; i++){ 			//22 loops sufficient
    //    swipe1();
   //     }
        //List<IOSElement> a = ob3.getPricingProfileRows(ob3.pricingProfileElementLabel);  
       // swipe1();
      //  ob3.swipe(a.get(0), "down");
      //  List a = null;
       // ob3.setQuantityPricingProfileFeatures (a, 1, "3");
//        for(int j=0;j<a.size();j++){
//        List<MobileElement> tv = a.get(j).findElements(By.className("XCUIElementTypeTextView"));
//        for(int i = 0; i < tv.size() ; i++){
//        	System.err.println(i+" "+tv.get(i).getAttribute("value"));
//        }
//        }
    }
	
	
	public static void WaitForElementPresent1(String locator, int timeout)
	{
	    
	    try{   
	    	WebDriverWait wait = new WebDriverWait(driver, timeout);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	    } catch (Exception e){
	        e.printStackTrace();
	    }
	 }
	public void pinch(){
		Property_ComparableMap ob2 = new Property_ComparableMap(driver);
		JavascriptExecutor js = driver;
	    HashMap<String, String> swipeObject = new HashMap<String, String>();
	    swipeObject.put("scale", "0.5");
	    swipeObject.put("velocity", "-1.5");
	    swipeObject.put("element", driver.findElement(By.xpath("//XCUIElementTypeOther[preceding::XCUIElementTypeSegmentedControl]")).getId());
	   js.executeScript("mobile: pinch", swipeObject);
	}
	
	public void drag(){
		IOSElement ab = (IOSElement) driver.findElement(By.xpath("//XCUIElementTypeOther[preceding::XCUIElementTypeSegmentedControl]"));
		int x = ab.getLocation().getX();
		int y = ab.getLocation().getY();
		IOSTouchAction ac = new IOSTouchAction(driver);
		ac.longPress(x+40, y+40).moveTo(x+20, y+20).release().perform();
	}
	public void swipe1(){
		JavascriptExecutor js = driver;
	    HashMap<String, String> swipeObject = new HashMap<String, String>();
	    swipeObject.put("direction", "up");
	   // swipeObject.put("element", driver.findElement(By.xpath("//XCUIElementTypeApplication[@name='ValueChek']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable")).getId());
	   js.executeScript("mobile: swipe", swipeObject);
	}
	
	public void tap(){
		IOSTouchAction ac = new IOSTouchAction(driver);
		ac.tap(635, 406).perform();
	}
	
     public void swipe(){
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
    		    	    swipeObject.put("direction", "down");*/
    		    	   // swipeObject.put("element", driver.findElement(MobileBy.iOSClassChain("**/XCUIElementTypeCollectionView[1]")).getId());
    		    	    /*js.executeScript("mobile: swipe", swipeObject);
    			 }
    		 }
    	 }
    	 catch(Exception e){
    		 
    	 }
     }
	 		
	public static void main(String ar[]) throws IOException, InterruptedException{
		
		Demo1 ob = new Demo1();
		ob.setup();
		
	}
	
}
*/