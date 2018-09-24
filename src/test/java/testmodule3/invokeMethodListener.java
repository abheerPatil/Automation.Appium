package testmodule3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class invokeMethodListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		if(result.getMethod().getMethodName().toString().equals("One")){
			try {
				dataSource.setExcelFile("/Users/kiwitech/Documents/workspace/Automation.Appium/src/test/java/Demo.xlsx", "Sheet1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(result.getMethod().getMethodName().toString().equals("Two")){
			try {
				dataSource.setExcelFile("/Users/kiwitech/Documents/workspace/Automation.Appium/src/test/java/Demo.xlsx", "Sheet2");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	

}
