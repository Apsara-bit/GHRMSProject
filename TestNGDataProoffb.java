package seleniumdemooffb;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestNGDataProoffb {
	WebDriver driver;

	@BeforeClass
	public void launchbrwoser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "logindata")
	public void login(String username, String password) {
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id=pass]")).sendKeys(password);

		driver.findElement(By.cssSelector("input[id=email]")).clear();
		driver.findElement(By.cssSelector("input[id=pass]")).clear();

	}

	@DataProvider
	public Object[][] logindata() {
		return new Object[][] { { "user1", "password1" }, { "user2", "password2" }, { "user3", "password3" },
				{ "user4", "password4" } };
	}
}
