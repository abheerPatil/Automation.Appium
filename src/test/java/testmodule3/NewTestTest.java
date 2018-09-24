package testmodule3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTestTest {
	
	@BeforeTest
	public void something(){
		System.out.println("BEFORE");
	}

	 @Test (dataProvider="dopp" , dataProviderClass=dataSource.class , testName = "something")
	    public void testMethod(String ob) {
	        System.err.println("testMethod()");
	        //System.out.println(ob);
	    }

	    @Test(dataProvider="dopp" , dataProviderClass=dataSource.class)
	    public void anotherTestMethod(String ob) {
	        System.err.println("anotherTestMethod()");
	    }

	    @Test(dataProvider="dopp" , dataProviderClass=dataSource.class)
	    public void thirdTestMethod(String ob) {
	        System.err.println("thirdTestMethod()");
	    }
}
