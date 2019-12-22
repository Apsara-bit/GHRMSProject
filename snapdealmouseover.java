package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdealmouseover {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//mouse over on an element
		WebElement signin=driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		Actions act=new Actions(driver);
		act.moveToElement(signin).build().perform();
		//Right click
		WebElement rightclickongiftcards=driver.findElement(By.xpath("//span[@data-index='1']"));
		act.moveToElement(rightclickongiftcards).contextClick(rightclickongiftcards).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		//using shift keys
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		act.moveToElement(searchbox).click(searchbox).keyDown(Keys.SHIFT).sendKeys("mobile").keyUp(Keys.SHIFT).doubleClick(searchbox).build().perform();
		}

}
