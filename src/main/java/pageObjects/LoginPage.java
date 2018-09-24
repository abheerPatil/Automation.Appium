package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import utility.ExtraFunctionalityCheck;
import utility.ImageClass;

public class LoginPage {
	
	IOSDriver<MobileElement> driver ;


/****************************************************************************CONSTRUCTOR************************************************************************************/	
	
	public LoginPage(IOSDriver<MobileElement> driver){
		//System.out.println("Started");
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

/****************************************************************************ELEMENTS***************************************************************************************/	
	//ELEMENTS COUNT: 
/**************************/	
	
	//IMAGE
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeImage' AND name == 'ug'")
	public IOSElement image;
	
	//APPNAME
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'ValueChek'")
	public IOSElement appName;
	
	//USERNAME LABEL
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Username'")
	public IOSElement usernameLabel;
	
	//USERNAME TEXTFIELD
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeTextField'")
	public IOSElement usernameField;
	
	//PASSWORD LABEL
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Password'")
	public IOSElement passwordLabel;
	
	//PASSWORD FIELD
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeSecureTextField'")
	public IOSElement passwordField;
	
	//FORGOT PASSWORD LINK
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Forgot your password?'")
	public IOSElement forgotPasswordLink;
	
	//LOGIN BUTTON
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Log In'")
	public IOSElement loginBtn;
	
	//"BY USING THIS APPLICATION, YOU AGREE TO THE" LABEL
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'By using this application, you agree to the '")
	public IOSElement LabelBeforeTermsAndCond;
	
	//TERMS AND CONDITION LINK
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Terms and Conditions'")
	public IOSElement TermsAndCondLink;
	
	//STATUS BAR
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStatusBar'")
	public IOSElement statusBar;
	
	//OFFLINE LOGIN MESSAGE
	@iOSFindBy(accessibility="Not able to log in right now. Try again later.")
	public IOSElement offlineMessage;
	
	//INCORRECT USERNAME AND PASSWORD COMBINATION MESSAGE
	@iOSFindBy(accessibility="Username/Password combination is incorrect")
	public IOSElement incorrectCombinations;

	//FORGOT PASSWORD PAGE ELEMENTS:
	@iOSXCUITFindBy(accessibility="An email has been sent to your email address with a temporary code to reset your password")
	public IOSElement forgotPasswordPage;
	
	@iOSXCUITFindBy(accessibility="iconCameraXWhite")
	public IOSElement cancelBtnForgotPass;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Code'")
	public IOSElement codeLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'Code']]")
	public IOSElement codeTextField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'New Password'")
	public IOSElement newPasswordLabel;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeTextField[preceding::XCUIElementTypeStaticText[@name = 'New Password']]")
	public IOSElement newPasswordField;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'Submit'")
	public IOSElement submitBtn;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeStaticText' AND name == 'Terms and Conditions'")
	public IOSElement termsAndConditionPageHeader;
	
	@iOSXCUITFindBy(className="XCUIElementTypeStaticText")
	public List <IOSElement> pageTexts;
	
	@iOSXCUITFindBy(iOSNsPredicate="type == 'XCUIElementTypeButton' AND name == 'x'")
	public IOSElement termsAndConditionCancel;
	
/****************************************************************************ACTIONS***************************************************************************************/	
	/*ACTIONS COUNT: 4
	 * 1. checkLogo()  
	 * 2. login(String,String)
	 */
/*******************************/	
	
	/*Method to check LOGO.
	 * Parameters : null 
	 * Returns : true if LOGO matches and false otherwise.
	 */
	public boolean checkLogo(){
		try{
			ExtraFunctionalityCheck.getScreenshots(image);
			if(ImageClass.image("src/main/resources/screenshot.png", "src/main/resources/screenshots/ValueChekLogo.png")<10){
				return true;
			}
			return false;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - checkLogo :"+e);		
			return false;
		}
	}
	
	/*Method to check login behavior.
	 * Parameters : String(user's name) , String(password) 
	 * Returns : true if action is done and false if there is any exception in that.
	 */
	public boolean login(String username , String password){
		try{
			usernameField.clear();
			usernameField.sendKeys(username);
			passwordField.clear();
			passwordField.sendKeys(password);
			loginBtn.click();
			return true;
		}
		catch(Exception e){
			System.err.println("Exception in class - LoginPage, in method - login :"+e);
			return false;
		}
	}
	
	
}
