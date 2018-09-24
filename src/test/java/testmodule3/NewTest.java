package testmodule3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class NewTest  {
	
	static WebDriver driver ;
	
	public NewTest(){
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/code/tryit.asp?filename=FSPWVWVW39X2");
		driver.findElement(By.xpath("/html/body/div[5]/div/button")).click();
	}
	
	
	By cell1 = By.xpath("/html/body/form/input[1]");
	By cell2 = By.xpath("/html/body/form/input[2]");
	By cell3 = By.xpath("/html/body/form/input[3]");
	By cell4 = By.xpath("/html/body/form/input[4]");
	By cell5 = By.xpath("/html/body/form/input[5]");
	By cell6 = By.xpath("/html/body/form/input[6]");
	By cell7 = By.xpath("/html/body/form/input[7]");
	By cell8 = By.xpath("/html/body/form/input[8]");
	By cell9 = By.xpath("/html/body/form/input[9]");
	By cell10 = By.xpath("/html/body/form/input[10]");
	By cell11 = By.xpath("/html/body/form/input[11]");
	By cell12 = By.xpath("/html/body/form/input[12]");
	By cell13 = By.xpath("/html/body/form/input[13]");
	By cell14 = By.xpath("/html/body/form/input[14]");
	By cell15 = By.xpath("/html/body/form/input[15]");
	By cell16 = By.xpath("/html/body/form/input[16]");
	By cell17 = By.xpath("/html/body/form/input[17]");
	By cell18 = By.xpath("/html/body/form/input[18]");
	By cell19 = By.xpath("/html/body/form/input[19]");
	By cell20 = By.xpath("/html/body/form/input[20]");
	
	

	@Test(dataProvider="trial" , dataProviderClass= dataSource.class)
	public void One(Object ar[][]){
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[0].length;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}
		System.err.println("One Print");
	}
	
	@Test(dataProvider="trial" , dataProviderClass= dataSource.class)
	public void Two(Object ar[][]){
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[0].length;j++){
				System.out.print(ar[i][j]);
			}
			System.out.println("");
		}
		System.err.println("Two");
	}
	
	@Test
	public void Three(){
		System.err.println("Three");
	}
	
	@AfterTest
	public void afterMethod(){
		driver.close();
	}
}