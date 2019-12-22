package seleniumdemooffb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class TestNGdemo1 {
	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void draganddropdemo() {

		try {
			WebElement src = driver.findElement(By.xpath("//div[@id='box1']"));
			WebElement dest = driver.findElement(By.xpath("//div[@id='box106']"));
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest).build().perform();
			// act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");
		}
	}

	

	@AfterClass
	public void afterClass() {

	}

}
