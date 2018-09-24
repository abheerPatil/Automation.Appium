import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

public class SampleTest {

  private IOSDriver<MobileElement> driver;

  @BeforeMethod
public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("automationName", "XCUITest");
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "10.2.1");
    desiredCapabilities.setCapability("deviceName", "KiwiTech iPad # 55");
    desiredCapabilities.setCapability("udid", "fb86624ab57e5645f3dbd49f39a271089a8b574e");
    desiredCapabilities.setCapability("noReset", true);
    desiredCapabilities.setCapability("app", "/Users/kiwitech/Downloads/ValueChek.ipa");
    desiredCapabilities.setCapability("xcodeOrgId", "Q3HXH3MWZ2");
    desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new IOSDriver<MobileElement>(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = driver.findElementByXPath("(//XCUIElementTypeImage[@name=\"card\"])[2]");
    el1.click();
    MobileElement el2 = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"ValueChek\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField");
    el2.click();
    //(new TouchAction(driver)).tap(973, 708).perform();
   // (new TouchAction(driver)).press({x: 763, y: 301}).moveTo({x: 745: y: 569}).release().perform();
  }

  @AfterMethod
public void tearDown() {
    driver.quit();
  }
  
  public static void main(String ar[]) throws MalformedURLException{
	  SampleTest ob = new SampleTest();
	  ob.setUp();
	  ob.sampleTest();
	  
  }
}