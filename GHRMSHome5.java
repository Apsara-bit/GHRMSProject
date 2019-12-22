package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GHRMSHome5 {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://ghrms.csscorp.com/HRMS/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	
	driver.findElement(By.xpath("//input[@id='ssoid']")).sendKeys("css105111");
	driver.findElement(By.xpath("//input[@id='ssopass']")).sendKeys("Welcome.123456");
	driver.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();
	Thread.sleep(3000);
	
 WebElement element1=driver.findElement(By.xpath("//span[@id='ext-gen396']"));
 element1.click();
 Thread.sleep(3000);
 WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'View My Details')]"));
 element2.click();
 
 //getting doj
 
 WebElement element3=driver.findElement(By.xpath("//td[@class='txtbox_field']//br[5]"));
 String DOJverifies=element3.getText();
 System.out.println(DOJverifies);
  
if(DOJverifies.equals("    01-Oct-2014")) {
	
	System.out.println("DOJ verified successfully");
}
	else {
		System.out.println("DOJ mentioned as wrong");
	}
	
	}


}

