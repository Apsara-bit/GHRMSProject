package seleniumdemooffb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GHRMSsearch4 {
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

		// click on search
		driver.findElement(By.xpath("//button[@id='ext-gen82']")).click();

		driver.findElement(By.xpath("//input[@name='EmpName']")).sendKeys("vino");

		int count = driver.findElements(By.xpath("//div[contains(@class,'x-combo-list-item') and contains(text(),'Vino')]")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			List<WebElement> el=driver.findElements(By.xpath("//div[contains(@class,'x-combo-list-item') and contains(text(),'Vino')]"));
			String empname = el.get(i).getText();
			if (empname.equalsIgnoreCase("Vinod Antony(105111)")) {
				System.out.println("Entered emp name is" + " " + empname);
				el.get(i).click();
				break;
				
			}

		}
		driver.findElement(By.xpath("//button[contains(text(),'Fetch')]")).click();
	}
}
