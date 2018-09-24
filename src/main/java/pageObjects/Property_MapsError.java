package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class Property_MapsError {

	public IOSDriver<MobileElement> driver;
	
/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public Property_MapsError(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 6
/**************************/
	
	@iOSXCUITFindBy(accessibility="We can't load the map without the property address")
	public IOSElement noAddressLabel;
	
	@iOSXCUITFindBy(accessibility="The property address seems to be entered wrong, please check it")
	public IOSElement wrongAddressLabel;
	
	@iOSXCUITFindBy(accessibility="Add Property Address")
	public IOSElement addAddressBtn;
	
	@iOSXCUITFindBy(accessibility="check Property Address")
	public IOSElement checkAddressBtn;
	
	@iOSXCUITFindBy(accessibility="Yes, update it for me")
	public IOSElement updateItBtn;
	
	@iOSXCUITFindBy(accessibility="Cancel")
	public IOSElement cancelBtn;
		
	
}
