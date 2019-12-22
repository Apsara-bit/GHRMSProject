package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class phptraveldemo {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		WebElement Features=driver.findElement(By.xpath("//button[@class='popover-trigger marketing-nav__item marketing-nav__item--primary']"));
		WebElement DesktopAppFeatures=driver.findElements(By.xpath("//button[@class='popover-trigger marketing-nav__item marketing-nav__item--child']")).get(1);
		WebElement desktopapp=driver.findElements(By.xpath("//a[contains(text(),'Desktop App')]")).get(0);
		Actions act=new Actions(driver);
		act.moveToElement(Features).moveToElement(DesktopAppFeatures).moveToElement(desktopapp).click(desktopapp).build().perform();
		
		WebElement company=driver.findElements(By.xpath("//button[@class='popover-trigger marketing-nav__item marketing-nav__item--user']")).get(1);
		WebElement partners=driver.findElement(By.xpath("//ul[@class='popover-content__list']/li//a[contains(text(),'Partners')]"));
		act.moveToElement(company).click(partners).build().perform();
		//act.moveToElement(company).moveToElement(partners).contextClick(partners).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
}