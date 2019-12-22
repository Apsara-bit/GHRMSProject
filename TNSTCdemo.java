package seleniumdemooffb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TNSTCdemo {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tnstc.in/TNSTCOnline/");
		driver.manage().window().maximize();

		WebElement from = driver.findElement(By.xpath("//input[@id='matchStartPlace']"));
		from.sendKeys("CHE");
		Actions act = new Actions(driver);
		act.moveToElement(from).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		WebElement to = driver.findElement(By.xpath("//input[@id='matchEndPlace']"));
		to.sendKeys("CHE");
		Thread.sleep(2000);
		Actions act1 = new Actions(driver);
		act1.moveToElement(to).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		//driver.findElement(By.xpath("//input[@id='txtdeptDateRtrip']")).sendKeys("17/12/2019");
		WebElement time=driver.findElement(By.xpath("//select[@id='selectOnwardTimeSlab']"));
		
		Select select=new Select(time);
		select.selectByValue("00:00-12:00");
		
		driver.findElement(By.xpath("//input[@id='txtAdultMales']")).sendKeys("2");
		
		driver.findElement(By.xpath("//input[@id='txtAdultFemales']")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='txtChildMales']")).sendKeys("1");
		
		driver.findElement(By.xpath("//input[@id='txtChildFemales']")).sendKeys("1");
		
		WebElement serviceclass=driver.findElement(By.xpath("//select[@id='selectClass']"));
		Select select1=new Select(serviceclass);
		select1.selectByValue("141");
		
		driver.findElement(By.xpath("//a[contains(text(),'search Available services')]")).click();

	}
}

/*
 * int count = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).size();
 * System.out.println(count); for (int i = 0; i < count; i++) { String fromplace
 * = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).getText();
 * if (fromplace.equalsIgnoreCase("CHENNAI EGMORE")) {
 * System.out.println(fromplace);
 * driver.findElements(By.xpath("//ul[@id='ui-id-1']/li")).get(i).click();
 * System.out.println(fromplace); } }
 */

/*
 * WebElement to=driver.findElement(By.xpath("//input[@id='matchEndPlace']"));
 * to.sendKeys("CHE"); int
 * count1=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li")).size();
 * System.out.println(count1); for(int j=0;j<count1;j++) { String
 * toplace=driver.findElements(By.xpath("//ul[@id='ui-id-2']/li")).get(j).
 * getText(); if(toplace.equalsIgnoreCase("CHENNAI TIRUVOTRIYUR")) {
 * System.out.println(toplace);
 * driver.findElements(By.xpath("//ul[@id='ui-id-2']/li")).get(j).click();
 */
