package seleniumdemooffb;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GHRMSviewholidays3 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ghrms.csscorp.com/HRMS/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login module
		driver.findElement(By.xpath("//input[@id='ssoid']")).sendKeys("css105111");
		driver.findElement(By.xpath("//input[@id='ssopass']")).sendKeys("Welcome.123456");
		driver.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();
		
        driver.findElement(By.xpath("//button[@id='ext-gen109']")).click();
		
		//clicking on view leave holidays
		Thread.sleep(3000);
		
		driver.findElements(By.xpath("//ul[@class='x-tree-node-ct']/li/div")).get(6).click();
		System.out.println("clicked on view holidays");
		
		
		Thread.sleep(3000);
		List<WebElement> ele1=driver.findElements(By.xpath("//td[text()='Entity']/following-sibling::td/div/img"));
		ele1.get(0).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele1);
		System.out.println("displayed");
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		List<WebElement> elee=driver.findElements(By.xpath("//td[text()='Entity']/following-sibling::td/div/img"));
		elee.get(1).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele1);
		System.out.println("displayed branch");
		
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Fetch')]")).click();
		
	}
}
