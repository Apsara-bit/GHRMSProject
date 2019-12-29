package seleniumdemooffb;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGdataproviderdemo {
	WebDriver driver;

	@Test(dataProvider = "loginData")
	public void facebookLogin(String userName, String passWord) {
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("apsara.cse@gmail.com");
		driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("1234");
		//driver.findElement(By.cssSelector("input[id=u_0_4]")).click();
		try {
			TestNgCaptureScreenshot.getImage(driver, "Facebook2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] { { "user1", "password1"},{ "user2", "password2"}, {"user3", "password3" } };
	}

	@BeforeClass
	
	public void browserSetup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
}
