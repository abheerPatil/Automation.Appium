package testListners;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class ExtentReportingListener implements ITestListener{

	 protected static ExtentReports reports;
	 protected static ExtentTest test;
	 protected List<String> params; 
	 
	 public String convertToString(Object[] objects){
		String s = "{ ";
		 if(objects.length!=0){
			 s = s+objects[0];
		 }
		 for(int i = 1 ; i < objects.length ; i++)
		 {
			 s = s + " , " + objects[i];
		 }
		 s = s + " }";
		 return s;
	 }
	 
	 public void onTestStart(ITestResult result) {
	  test = reports.startTest(result.getMethod().getMethodName());
	  test.log(LogStatus.INFO, result.getMethod().getMethodName() , MethodInterceptorListner.testDetails.get(result.getMethod().getMethodName()));
	 }
	 public void onTestSuccess(ITestResult result) {
	  test.log(LogStatus.PASS,result.getMethod().getMethodName() , " TEST PASS");
	  test.log(LogStatus.PASS,"DATA USED :-", convertToString(result.getParameters()));
	  
	 }
	 public void onTestFailure(ITestResult result) {
	   test.log(LogStatus.FAIL, result.getMethod().getMethodName() , " TEST FAIL");
	   test.log(LogStatus.FAIL,"DATA USED :-", convertToString(result.getParameters()));
	 }
	 public void onTestSkipped(ITestResult result) {
	  test.log(LogStatus.SKIP, result.getMethod().getMethodName() ," TEST SKIPPED");
	  test.log(LogStatus.SKIP, "DATA USED :-",convertToString(result.getParameters()));
	 }
	 public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	 }
	 public void onStart(ITestContext context) {
		 
	  reports = new ExtentReports("ExtentReport/"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date())+"report.html");
	  reports.assignProject("VALUECHEK");
	  
	 }
	 public void onFinish(ITestContext context) {
	  reports.endTest(test);
	  reports.flush();
	 }
	
}
