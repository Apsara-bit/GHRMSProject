package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class GHRMSProject1 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ghrms.csscorp.com/HRMS/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login module
		driver.findElement(By.xpath("//input[@id='ssoid']")).sendKeys("css105111");
		driver.findElement(By.xpath("//input[@id='ssopass']")).sendKeys("Welcome.123456");
		driver.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();

		// Leave attendance-View attendance display module of Nov 2019
		WebElement ele = driver.findElement(By.xpath("//button[@id='ext-gen109']"));
		ele.click();
        WebElement ele1 = driver.findElement(By.xpath("//img[contains(@class,'x-form-trigger x-form-arrow-trigger')]"));
		ele1.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		WebElement ele3=driver.findElements(By.xpath("//td[contains(text(),'92% ')]")).get(0);
		if(ele3.equals(100)) {
			System.out.println("Eligible to take further leaves");
		}
		else {
			System.out.println("Not eligible for further leave");
		}
	
	}

}
