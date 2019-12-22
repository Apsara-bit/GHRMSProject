package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumdeforswitchframe {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://selenium.dev/selenium/docs/api/java/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.switchTo().frame(2);
			System.out.println("moved to third frame");
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@href='com/thoughtworks/selenium/package-summary.html']")).click();
		    driver.switchTo().defaultContent();
		    WebElement ele=driver.findElement(By.xpath("//frame[@name='packageFrame']"));
			driver.switchTo().frame(ele);
			driver.findElement(By.xpath("//a[contains(text(),'AbstractAnnotations')]")).click();
	}
	}