package seleniumdemooffb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class thedemositecouk {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		login.click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Apsara");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A@123");
		driver.findElement(By.xpath("//input[@name='FormsButton2']")).click();
		WebElement verifylogin=driver.findElement(By.xpath("//strong[contains(text(),'The status was')]"));
		if(verifylogin.isDisplayed()) {
		System.out.println("**Failed Login** ");
		}
		else
		System.out.println("login credential needed");
	}
	}
	


