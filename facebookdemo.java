package seleniumdemooffb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookdemo {
	public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("apsara.cse@gmail.com");
		driver.findElement(By.cssSelector("input[id=pass]")).sendKeys("1234");
		
		//driver.findElement(By.cssSelector("input[id=u_0_4]")).click();
		driver.findElement(By.cssSelector("input[id=u_0_m]")).sendKeys("Apsara");
		driver.findElement(By.cssSelector("input[id=u_0_o]")).sendKeys("Srinivasan");
		driver.findElement(By.cssSelector("input[id=u_0_r]")).sendKeys("9865045686");
		driver.findElement(By.cssSelector("input[id='u_0_w']")).sendKeys("9865045686");

		WebElement ele=driver.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(ele);
		select.selectByValue("4");
		
		WebElement elem=driver.findElement(By.xpath("//select[@id='month']"));
		Select select1=new Select(elem);
		select1.selectByIndex(3);
		
		WebElement element=driver.findElement(By.xpath("//select[@id='year']"));
		Select select2=new Select(element);
		select2.selectByVisibleText("2016");
		
		//driver.findElement(By.cssSelector("#u_0_17")).click();
		
		//IsDisplayed verification method
		
		 WebElement img=driver.findElements(By.cssSelector("img[class=img]")).get(0);
		Boolean val=img.isDisplayed();
		if(val==true)
			System.out.println("FB homepage opened");
		else
			System.out.println("FB home page not opened");
		Thread.sleep(3000);
		
		//IsSelected verification method
		
		driver.findElement(By.xpath("//input[@id='u_0_9']")).click();
		Boolean val1=driver.findElement(By.cssSelector("input[id=u_0_9]")).isSelected();
		if(val1==true)
			System.out.println("radio button selected");
		else
			System.out.println("radio button not selected");
		
		//Switching window/Tab
		
		String parent=driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//a[@id='cookie-use-link']")).click();
		for(String handle:driver.getWindowHandles()) {
			driver.switchTo().window(handle);
			System.out.println(handle);
			driver.switchTo().window(parent);
		}
		
	}
}