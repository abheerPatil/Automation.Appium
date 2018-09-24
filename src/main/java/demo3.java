import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String ar[]) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://topfan-web-production.herokuapp.com");
		
//		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
//		
//		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Soemthifn");
		
		  driver.findElement(By.xpath("//a[@class='login-btn']")).click();
		  driver.findElement(By.linkText("Forgot Password?")).click();
		  
		  driver.findElement(By.id("email")).sendKeys("saif.sultan@kiwitech.com");
		  driver.findElement(By.id("forgot_password_submit")).click();
		  
		  driver.get("https://www.google.com/gmail/about/");
		  driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		  
		 // driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		  
		//  Thread.sleep(30000);
		/*  boolean s1 = false;
		  
		  while(s1 == false){
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		   s1 = ((String) js.executeScript("return document.readyState")).equals("complete");
		   System.out.println("NOT NOT NOT NOT");
		  }*/
		  
		//  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  
		//  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  
		  
		  
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("YOOOOOO");;
		  
		  
		  
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  
		 // Thread.sleep(10000);
		  
		  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf' and @type='password']")).sendKeys("sheezan100");
		  
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  
		  
		  
		
		  
		  //driver.findElement(By.name("Test App")).click();
		
		Thread.sleep(10000);
		
		driver.close();
		
	}
	
	
}
