package seleniumdemooffb;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNGdataprdemowithxl {
  @Test(dataProvider = "logindata")
  public void logindata(String username, String password) {
	  System.out.println(username+""+password);
  }

  @DataProvider
  public Object[][] Loginusingxldata() {
   Object[][] values=ReadExcel.getData("sheet1");
   return values;
    };
  }

