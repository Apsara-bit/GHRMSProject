package seleniumdemooffb;

import java.io.FileInputStream;

import org.testng.annotations.Test;

public class TEstNGreadfxlfile {
	public static String TESTDATA_EXCELPATH=System.setProperty("user.dir", "");
	public static WorkBook book;
	public static Sheet sheet;
	
	Object[][] getdata(String sheetname){
		FileInputStream fis=new FileInputStream(TESTDATA_EXCELPATH);
		book=WorkBookFactory.create(fis);
		sheet=book.getSheet(sheetname);
		
	}
 
}
