package testListners;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportingListener implements ITestListener{

	 protected static ExtentReports reports;
	 protected static ExtentTest test;
	 
	 public void onTestStart(ITestResult result) {
	  test = reports.startTest(result.getMethod().getMethodName());
	  test.log(LogStatus.INFO, result.getMethod().getMethodName() , MethodInterceptorListner.testDetails.get(result.getMethod().getMethodName()));
	 }
	 public void onTestSuccess(ITestResult result) {
	  test.log(LogStatus.PASS,"", result.getMethod().getMethodName() + " TEST PASS");
	 }
	 public void onTestFailure(ITestResult result) {
	   test.log(LogStatus.FAIL,"", result.getMethod().getMethodName() + " TEST FAIL");
	   test.log(LogStatus.FAIL, result.getMethod().getMethodName() + " TEST FAIL", result.getThrowable().getMessage());
	 }
	 public void onTestSkipped(ITestResult result) {
	  test.log(LogStatus.SKIP,"" , result.getMethod().getMethodName() + " TEST SKIPPED");
	 }
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	 }
	 public void onStart(ITestContext context) {
		 
	  reports = new ExtentReports("ExtentReport/"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date())+"report.html");
	 }
	 public void onFinish(ITestContext context) {
	  reports.endTest(test);
	  reports.flush();
	 }
	
}
