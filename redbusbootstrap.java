package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class redbusbootstrap {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		/*
		 * driver.findElement(By.cssSelector("#src")).sendKeys("Che"); int count =
		 * driver.findElements(By.cssSelector("ul[class=autoFill]>li")).size(); for (int
		 * i = 0; i < count; i++) { String value =
		 * driver.findElements(By.cssSelector("ul[class=autoFill]>li")).get(i).getText()
		 * ; System.out.println(value); if (value.equalsIgnoreCase("Alandur, Chennai"))
		 * { System.out.println(value);
		 * driver.findElements(By.cssSelector("ul[class=autoFill]>li")).get(i).click();
		 */

		/*
		 * driver.findElement(By.cssSelector("input[id=dest]")).sendKeys("Mud"); int
		 * number=driver.findElements(By.cssSelector("ul[class=autoFill]>li")).size();
		 * for(int i1=0;i1<number;i1++) { 
		 * String value1=driver.findElements(By.cssSelector("ul[class=autoFill]>li")).get(i1).
		 * getText(); System.out.println(value1); if(value1.equalsIgnoreCase("Mudgal"))
		 * {
		 * driver.findElements(By.cssSelector("ul[class=autoFill]>li")).get(i1).click();
		 */
Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=onward_cal]")).click();
		int count = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']")).size();
		for (int n = 0; n < count; n++) {
			String datevalue = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']")).get(n).getText();
			if (datevalue.equalsIgnoreCase("22")) {
				System.out.println(datevalue);
				driver.findElements(By.xpath("//table[@class='rb-monthTable first last']")).get(n).click();
			}
		}
	}
}