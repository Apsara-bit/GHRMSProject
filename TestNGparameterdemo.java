package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGparameterdemo {
	WebDriver driver;
	
	//To pass the parameter and the value is browser name
  
  
    //functionality of drag and drop by Actions class in @Test
  @Test
  public void draganddrop1() {

			WebElement src = driver.findElement(By.xpath("//div[@id='box1']"));
			WebElement dest = driver.findElement(By.xpath("//div[@id='box106']"));
			Actions act = new Actions(driver);
			act.dragAndDrop(src, dest).build().perform();
			// act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
	
  }
  
  @Parameters({"browser"})
  
//Browser launching

  @BeforeClass   
  public void browserSetup(String browserName) {
	  if(browserName.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
	  }else if(browserName.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.firefox.driver", "C:\\Users\\Sabari\\Downloads\\geckodriver-v0.26.0-win64.zip\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
}


