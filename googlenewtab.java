package seleniumdemooffb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googlenewtab {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			//WebElement ele=driver.findElement(By.cssSelector("#body"));
			Actions act=new Actions(driver);
			act.sendKeys(Keys.CONTROL+"t").build().perform();
	}
}


