package seleniumdemooffb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GHRMSProintestNG {

	static WebDriver driver;

	@BeforeMethod
	// Login
	public void browserSetup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ghrms.csscorp.com/HRMS/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Login module
		driver.findElement(By.xpath("//input[@id='ssoid']")).sendKeys("css105111");
		driver.findElement(By.xpath("//input[@id='ssopass']")).sendKeys("Welcome.123456");
		driver.findElement(By.xpath("//button[contains(text(),'Sign On')]")).click();

		driver.findElement(By.xpath("//button[@id='ext-gen109']")).click();
	}

	@Test(priority=1)
	public void viewAttendanceOfNov2019() {
		
		WebElement ele = driver.findElement(By.xpath("//button[@id='ext-gen109']"));
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
		WebElement ele1 = driver.findElement(By.xpath("//img[contains(@class,'x-form-trigger x-form-arrow-trigger')]"));
		ele1.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		WebElement ele3 = driver.findElements(By.xpath("//td[contains(text(),'92% ')]")).get(0);
		if (ele3.equals(100)) {
			System.out.println("Eligible to take further leaves");
		} else {
			System.out.println("Not eligible for further leave");
		}

	}

	@Test(priority=2)
	public void viewLeaveBalance() {
		driver.findElements(By.xpath("//ul[@class='x-tree-node-ct']/li/div")).get(2).click();
		System.out.println("clicked on view balance");

		WebElement leavebalance = driver
				.findElements(By.xpath(
						"//table[contains(@id,'ext-gen')]//tbody//tbody//tr//td[@class='listLeaveContent_label']"))
				.get(5);
		String Numberoflavebalance = leavebalance.getText();
		System.out.println("Number of leave balance is" + " " + "is" + " " + Numberoflavebalance + " " + "days");
	}

	@Test(priority=3)
	public void viewHolidaysOf2019() {
		List<WebElement> ele1 = driver.findElements(By.xpath("//td[text()='Entity']/following-sibling::td/div/img"));
		ele1.get(0).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele1);
		System.out.println("displayed");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ENTER).build().perform();

		List<WebElement> elee = driver.findElements(By.xpath("//td[text()='Entity']/following-sibling::td/div/img"));
		elee.get(1).click();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", ele1);
		System.out.println("displayed branch");

		Actions act1 = new Actions(driver);
		act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//button[contains(text(),'Fetch')]")).click();

	}

	@Test(priority=4)
	public void verifiesDOJ() throws InterruptedException {
		WebElement element1 = driver.findElement(By.xpath("//span[@id='ext-gen396']"));
		element1.click();
		Thread.sleep(3000);
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'View My Details')]"));
		element2.click();

		// getting doj

		WebElement element3 = driver.findElement(By.xpath("//td[@class='txtbox_field']//br[5]"));
		String DOJverifies = element3.getText();
		System.out.println(DOJverifies);

		if (DOJverifies.equals("    01-Oct-2014")) {

			System.out.println("DOJ verified successfully");
		} else {
			System.out.println("DOJ mentioned as wrong");
		}

	}

	@Test(priority=5)
	public void searchByName() {
		// click on search
		driver.findElement(By.xpath("//button[@id='ext-gen82']")).click();

		driver.findElement(By.xpath("//input[@name='EmpName']")).sendKeys("vino");

		int count = driver
				.findElements(By.xpath("//div[contains(@class,'x-combo-list-item') and contains(text(),'Vino')]"))
				.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			List<WebElement> el = driver
					.findElements(By.xpath("//div[contains(@class,'x-combo-list-item') and contains(text(),'Vino')]"));
			String empname = el.get(i).getText();
			if (empname.equalsIgnoreCase("Vinod Antony(105111)")) {
				System.out.println("Entered emp name is" + " " + empname);
				el.get(i).click();
				break;
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'Fetch')]")).click();
	}

	@AfterMethod
	// logout
	
	public void tearDown() {
		driver.findElement(By.xpath("//button[contains(text(),'Logout')]")).click();
	}
}
