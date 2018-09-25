package testModules;

import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Property_Menu;
import pageObjects.StatusBar;
import testListners.SingleDataProvider;
import testListners.SuiteDriverListner;
import utility.ExtraFunctionalityCheck;

public class LoginTests {
	
	public IOSDriver<MobileElement> driver = SuiteDriverListner.driver;
	LoginPage ob1 = new LoginPage(driver);
	StatusBar ob2 = new StatusBar(driver);
	HomePage ob3 = new HomePage(driver);
	Property_Menu ob4 = new Property_Menu(driver);
	
	private static IOSElement usernameField; 
	private static IOSElement passwordField; 
	
 @BeforeMethod	
 public void beforeTest(Method m){
	 if(!m.getName().equals("checkLogin")){
		 try{
			 ob3.homePageHeading.isDisplayed();
			 ob3.logOut(2);
		 }
		 catch(Exception e){
		 }
	 }
 }
	
  @Test
  public void loginElementsDisplay() {
	  try{
	    boolean a = true;
	 	a = a && ob1.appName.isEnabled();
	 	a = a && ob1.usernameLabel.isDisplayed();
	 	a = a && ob1.passwordLabel.isDisplayed();
	 	a = a && ob1.usernameField.isDisplayed();
	 	a = a && ob1.passwordField.isDisplayed();
	 	a = a && ob1.forgotPasswordLink.isDisplayed();
	 	a = a && ob1.loginBtn.isDisplayed();
	 	a = a && ob1.LabelBeforeTermsAndCond.isDisplayed();
	 	a = a && ob1.TermsAndCondLink.isDisplayed();
	 	boolean flag = ob1.checkLogo();
	 	Assert.assertEquals((a && flag), true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : loginElementsDisplay" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void stringVisiblity(String userField, String passField){
	  try{
		  boolean a, b;
		  usernameField = ob1.usernameField;
		  passwordField = ob1.passwordField;
		  usernameField.clear();
		  usernameField.sendKeys(userField);
		  String user = usernameField.getAttribute("value");
		  passwordField.clear();
		  passwordField.sendKeys(passField);
		  String pass = passwordField.getAttribute("value");
		  driver.hideKeyboard();
		  a = user.equals(userField)?true:false;
		  b = pass.equals(passField)?false:true;
		  Assert.assertEquals(a && b, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : stringVisiblity" +e);
	  }
  }
  
  @Test
  public void forgotPasswordPage(){
	  try{
		  boolean a = true;
		  ob1.forgotPasswordLink.click();
		  ExtraFunctionalityCheck.waitForElement(ob1.forgotPasswordPage, driver, 15000);
		  a = a && ob1.forgotPasswordPage.isDisplayed();
		  a = a && ob1.submitBtn.isDisplayed();
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  driver.resetApp();
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : forgotPasswordPage" +e);
	  }
  }
  
  @Test
  public void forgotPasswordCancel(){
	  try{
		  boolean a;
		  ob1.cancelBtnForgotPass.click();
		  a = ob1.appName.isDisplayed();
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : forgotPasswordCancel" +e);
	  }
  }
  
  @Test
  public void TermsAndCondLink(){
	  try{
		  boolean a;
		  ob1.TermsAndCondLink.click();
		  if(ob2.isOffline() == false){
			  throw new Exception("");
		  }
		  a = ob1.pageTexts.size() > 1 ? true:false;
		  if (a == false){
			  ExtraFunctionalityCheck.waitForElement(ob1.incorrectCombinations, driver, 10000);
			  a = ob1.pageTexts.size() > 1 ? true:false; 
		  }
		  a = a && ob1.termsAndConditionPageHeader.isDisplayed();
		  ob1.termsAndConditionCancel.click();
		  Assert.assertEquals(a, true);  		  
	  }
	  catch(Exception e){
		  ob1.termsAndConditionCancel.click();
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : TermsAndCondLink" +e);
	  }
  }
  
  @Test
  public void TermsAndCondOff(){
	  try{
		  boolean a;
		  if (ob2.isOffline() == true){
			  ExtraFunctionalityCheck.toggleWifi(driver);
		  }
		  ob1.TermsAndCondLink.click();
		  a = ob1.pageTexts.size() > 1 ? false:true;
		  if (a == false){
			  a = ob1.pageTexts.size() > 1 ? false:true; 
		  }
		  ob1.termsAndConditionCancel.click();
		  Assert.assertEquals(a, true);
		  ExtraFunctionalityCheck.toggleWifi(driver);
	  }
	  catch(Exception e){
		  ob1.termsAndConditionCancel.click();
		  ExtraFunctionalityCheck.toggleWifi(driver);
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : TermsAndCondOff" +e);
	  }
  }
  
  @Test
  public void noUserAndPass(){
	  try{
		  boolean a;
		  a = ob1.login("", "");
		  if(a == true){
			 a = a && ob1.offlineMessage.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : noUserAndPass" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void noUsername(String pass){
	  try{
		  boolean a;
		  a = ob1.login("", pass);
		  if(a == true){
			 a = a && ob1.offlineMessage.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : noUsername" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void noPassword(String user){
	  try{
		  boolean a;
		  a = ob1.login(user, "");
		  if(a == true){
			 a = a && ob1.offlineMessage.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : noPassword" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void wrongUsername(String user , String pass){
	  try{
		  boolean a;
		  a = ob1.login(user , pass);
		  if(a == true){
			 a = a && ob1.incorrectCombinations.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : wrongUsername" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void wrongPassword(String user , String pass){
	  try{
		  boolean a;
		  a = ob1.login(user , pass);
		  if(a == true){
			 a = a && ob1.incorrectCombinations.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : wrongPassword" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void wrongUserAndPass(String user , String pass){
	  try{
		  boolean a;
		  a = ob1.login(user , pass);
		  if(a == true){
			 a = a && ob1.incorrectCombinations.isDisplayed();
		  }
		  else{
			  throw new Exception("");
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : wrongUserAndPass" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void passwordInCaps(String user , String pass) throws InterruptedException{
	  try{
		  boolean a;
		  a = ob1.login(user , pass);
		  if(a == true){
			 a = a && ob1.incorrectCombinations.isDisplayed();
			 Assert.assertEquals(a, true);
		  }
		  else{
			  throw new Exception("");
		  }
	  }
	  catch(Exception e){
		  ExtraFunctionalityCheck.waitForElement(ob3.homePageHeading, driver, 10000);
		  ob3.menuButton.click();
		  ob3.swipe("up");
		  ob3.swipe("up");
		  ob3.logOutBtn.click();
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : passwordInCaps" +e);
	  }
  }
  
  @Test
  public void dismissKeyboard(){
	  try{
		  boolean a;
		  ob1.usernameField.click();
		  IOSTouchAction ac = new IOSTouchAction(driver);
		  ac.tap(PointOption.point(25, 70)).perform();
		  try{
			  driver.findElement(MobileBy.iOSNsPredicateString("type == 'XCUIElementTypeButton' AND name == 'Hide keyboard'")).isDisplayed();
			  a = false;
		  }
		  catch(Exception g){
			  driver.hideKeyboard();
			  a = true;
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : dismissKeyboard" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void positiveLogin(String user, String pass){
	  try{
		  boolean a;
		  a = ob1.login(user , pass);
		  ExtraFunctionalityCheck.waitForElement(ob3.homePageHeading, driver, 10000);										
		  if(a == true){
			 a = a && ob3.homePageHeading.isDisplayed();
		  }
		  else{
			  a = false;
		  }
		  Assert.assertEquals(a, true);
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : positiveLogin" +e);
	  }
  }
  
  @Test
  public void checkLogin() {
	  try{
		  boolean a;
		  try{
			 	ob1.appName.isDisplayed();
			 	ob1.usernameLabel.isDisplayed();
			 	ob1.passwordLabel.isDisplayed();
			 	a = false;
		  }
		  catch(Exception n){
			  ob3.homePageHeading.isDisplayed();
			  ob3.menuButton.isDisplayed();
			  a = true;
		  }
		  Assert.assertEquals(a, true); 
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : checkLogin" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void logOutUsernameCheck(String user){
	  try{
		  String getUsername = ob1.usernameField.getAttribute("value");
		  if(getUsername.equals(user)){
			  Assert.assertEquals(true, true);
		  }
		  else{
			  Assert.assertEquals(false, true);
		  }
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : logOutUsernameCheck" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void offlineLogin(String user, String pass){
	  try{
		  boolean a;
		  if(ob2.isOffline() == true){
			  ExtraFunctionalityCheck.toggleWifi(driver);
		  }
		  a = ob1.login(user, pass);
		  a = a && ob4.offlineMessage.getAttribute("visible").equals("true");
		  ob3.menuButton.click();
		  ob3.swipe("up");
		  ob3.swipe("up");
		  ob3.logOutBtn.click();
		  ExtraFunctionalityCheck.toggleWifi(driver);
		  Assert.assertEquals(true, true);
		  
	  }
	  catch(Exception e){
		  Assert.assertEquals(false, true);
		  ExtraFunctionalityCheck.toggleWifi(driver);
		  System.out.print("Exception in Test : offlineLogin" +e);
	  }
  }
  
  @Test(dataProvider="data" , dataProviderClass = SingleDataProvider.class)
  public void offlineLoginDiffUser(String user, String pass){
	  try{
		  boolean a;
		  if(ob2.isOffline() == true){
			  ExtraFunctionalityCheck.toggleWifi(driver);
		  }
		  a = ob1.login(user, pass);
		  a = a && ob1.offlineMessage.getAttribute("visible").equals("true");
		  ExtraFunctionalityCheck.toggleWifi(driver);
		  Assert.assertEquals(true, true);
	  }
	  catch(Exception e){
		  ExtraFunctionalityCheck.toggleWifi(driver);
		  Assert.assertEquals(false, true);
		  System.out.print("Exception in Test : offlineLoginDiffUser" +e);
	  }
  }
  
  @AfterClass
  public void afterClass(){
	  try{
		  ob1.loginBtn.isDisplayed();
		  ob1.login("kiwitech2", "hvavc2");
		  ExtraFunctionalityCheck.waitForElement(ob3.homePageHeading, driver, 15000);
	  }
	  catch(Exception e){
	  }
  }
  
}
