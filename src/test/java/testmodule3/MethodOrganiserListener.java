package testmodule3;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;




public class MethodOrganiserListener extends Thread implements IMethodInterceptor {

	@SuppressWarnings("unused")
	private ArrayList<String> testModuleName = new ArrayList<String>();
	private ArrayList<String> testCaseName = new ArrayList<String>();
	private List<IMethodInstance> method = new ArrayList<IMethodInstance>();
	private List<String> methodName = new ArrayList<String>();
	
	Thread thread1 = new Thread() {
	    @Override
		public void run() {
	    try {	
	    	
	    	FileInputStream ExcelFile = new FileInputStream("src/main/java/utility/VALUECHEK.xlsx");
    		@SuppressWarnings("resource")
			XSSFWorkbook  ExcelWBook = new XSSFWorkbook(ExcelFile);
	    /*	
	    	//ModuleNameSheet
	    				
	    	XSSFSheet sheet = ExcelWBook.getSheet("Sheet1");
	    				
	    	int i = 1;
	    				
	    	while(sheet.getRow(i).getCell(1).toString()!="") {
	    					
	    		if(sheet.getRow(i).getCell(2).toString().equals("Y")||sheet.getRow(i).getCell(2).toString().equals("y")) {
	    			testModuleName.add(sheet.getRow(i).getCell(1).toString());
	    		}
	    		i++;
	    	}
	    	*/			
	    	//TestCasesNamesSheet
   				
    		XSSFSheet sheet = ExcelWBook.getSheet("Sheet1");
	    				
    		int i = 1;
	    	try{
	    		while(sheet.getRow(i).getCell(2).toString()!= "") {
					
//		   			if((testModuleName.contains(sheet.getRow(i).getCell(1).toString()))&&((sheet.getRow(i).getCell(4).toString().equals("Y"))||(sheet.getRow(i).getCell(4).toString().equals("y")))) {
//		  				testCaseName.add(sheet.getRow(i).getCell(2).toString());
//		  			}
	    			if(sheet.getRow(i).getCell(4).toString().equalsIgnoreCase("Y")){
	    				testCaseName.add(sheet.getRow(i).getCell(1).toString());
	    				i++;
	    			}
		  			
		  		}
	    	}
	    	catch(Exception e){
	    		
	    	}
	    	
	    }
	    catch(Exception e) {
	    	System.err.println("Exception in Thread 1 - MethodOrganiserListener" +e);
	    }
	  }
	};

	Thread thread2 = new Thread() {
	    @Override
		public void run() {
	    	try {
	    		for(IMethodInstance m : method) {
	    			methodName.add(m.getMethod().getMethodName());
	    		}
	    	}
	    	catch(Exception e) {
	    		System.err.println("Exception in Thread 2 - MethodOrganiserListener"+e);
	    	}
	    }
	};
	
	public List<IMethodInstance> intercept(List<IMethodInstance> arg0, ITestContext arg1) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		method = arg0;
		
		try {
			
			thread1.start();
			thread2.start();
			
			thread1.join();
			thread2.join();
		} 
		catch (InterruptedException e) {
			System.err.println("Exception in Thread start or Joining - MethodOrganiserlistener"+e);
		}
		for(int i=0;i<testCaseName.size();i++) {
			if(methodName.contains(testCaseName.get(i))) {
				result.add(method.get(methodName.indexOf(testCaseName.get(i))));
			}
		}
		return result;
	}
}