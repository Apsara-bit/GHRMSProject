package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leavebal {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ghrms.csscorp.com/HRMS/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='ssoid']")).sendKeys("css105111");
		driver.findElement(By.xpath("//input[@id='ssopass']")).sendKeys("Welcome.123456");
		driver.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();

		driver.findElement(By.xpath("//button[@id='ext-gen109']")).click();


		//driver.findElement(By.xpath("//span[@id='ext-gen898']")).click();
		int count = driver.findElements(By.xpath("//ul[@id='ext-gen526']/li")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String viewleavebal = driver.findElements(By.xpath("//ul[@id='ext-gen526']/li")).get(i).getText();
			if (viewleavebal.equalsIgnoreCase("View Leave Balance")) {
				driver.findElements(By.xpath("//ul[@id='ext-gen526']/li")).get(i).click();
				System.out.println(viewleavebal);
}
}
	}
}
