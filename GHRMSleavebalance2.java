package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GHRMSleavebalance2 {
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
		
		driver.findElement(By.xpath("//button[@id='ext-gen109']")).click();
		
		//clicking on view leave balance
		Thread.sleep(3000);
		
		driver.findElements(By.xpath("//ul[@class='x-tree-node-ct']/li/div")).get(2).click();
		System.out.println("clicked on view balance");
		
		WebElement leavebalance=driver.findElements(By.xpath("//table[contains(@id,'ext-gen')]//tbody//tbody//tr//td[@class='listLeaveContent_label']")).get(5);
		String Numberoflavebalance=leavebalance.getText();
		System.out.println("Number of leave balance is"+" "+"is"+" "+Numberoflavebalance+" "+"days");
}
}
