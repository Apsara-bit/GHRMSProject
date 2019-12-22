package seleniumdemooffb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dranganddropdemo {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().window().maximize();

			WebElement src=driver.findElement(By.xpath("//div[@id='box1']"));
			WebElement dest=driver.findElement(By.xpath("//div[@id='box106']"));
			Actions act=new Actions(driver);
			act.dragAndDrop(src, dest).build().perform();
			//act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
	}
}