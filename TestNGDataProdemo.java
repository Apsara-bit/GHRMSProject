package seleniumdemooffb;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNGDataProdemo {
  @Test(dataProvider = "logindata")
  public void login(String username, String password) {
	  System.out.println(username+""+password);
  }

  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
    	{"user1","password1"},{"user2","password2"},{"user3","password3"}
    };
  }
}
