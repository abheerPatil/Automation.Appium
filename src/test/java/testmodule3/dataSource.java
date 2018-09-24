package testmodule3;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataSource {
	
	private static XSSFSheet sheet;

	private static XSSFWorkbook ExcelWBook;

	//private static XSSFCell Cell;

	//private static XSSFRow Row;

	@SuppressWarnings("unused")
	private static String path ;
	
	public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {
			
			path = Path;

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		sheet = ExcelWBook.getSheet(SheetName);

		} catch (Exception e){

			throw (e);

		}

}
	static ArrayList<Integer> index = new ArrayList<Integer>();
	static int count = 1;
	static int row;
	static int col;

	
	
	@DataProvider(name="trial")
	public Object[][] method1() throws Exception {
		
		
		
		System.out.println("MEthod");
		
		//setExcelFile("/Users/kiwitech/Documents/workspace/Automation.Appium/src/test/java/Demo.xlsx", "Sheet1");
		row = sheet.getLastRowNum()+1;
		col = sheet.getRow(0).getLastCellNum();
		for(int i=0;i<row;i++) {
			if((sheet.getRow(i).getCell(1)!=null)&&(sheet.getRow(i).getCell(1).toString().equals("One"))) {
				index.add(i);
			}
		}
		System.out.println(index);
		int p = index.get(0)+1;
		System.out.println(p);
		System.out.println(sheet.getRow(p).getCell(1));
		while(sheet.getRow(p).getCell(1).toString().equals("")) {
			count++;
			p++;
		}
		System.out.println(count);
		String ar[][];
		Object ob[][] = new Object[index.size()][1];
		for(int i=0;i<index.size();i++) {
			ar = new String[count][col];
			for(int j=0;j<count;j++) {
				for(int k=0;k<col;k++) {
					if(sheet.getRow(j+index.get(i)).getCell(k)== null) {
						ar[j][k] = "";
					}
					else {
						ar[j][k] = sheet.getRow(j+index.get(i)).getCell(k).toString();
					}
				}
			}
			ob[i][0] = ar;
		}
		return ob;	
	}
}
