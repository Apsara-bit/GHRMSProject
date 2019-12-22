package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class toolsqa {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(driver.findElement(By.xpath("//h1[text()='Practice Automation Form']")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[text()='PERSONAL INFORMATION']")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[text()='Partial Link Test']")).getText());
		System.out.println(driver.findElement(By.xpath("//strong[text()='Link Test']")).getText());

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Apsara");
		System.out.println("Firstname is printed");
		driver.findElement(By.cssSelector("input[id=lastname]")).sendKeys("Srinivasan");
		System.out.println("Lastname is printed");

		//driver.findElement(By.xpath("//button[text()='Simple Button']")).click();
		//System.out.println("simple  button clicked on");

		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		System.out.println("Radio button Male clicked on");

		driver.findElement(By.cssSelector("input[id=exp-0]")).click();
		System.out.println("Radio button 1 clicked on");

		driver.findElement(By.xpath("//input[id='datepicker']")).sendKeys("01/01/2000");
		System.out.println("date entered");

		Select sele = new Select(driver.findElement(By.xpath("//input[id='continents']")));
		sele.selectByVisibleText("Africa");

		Select sel = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		sel.selectByVisibleText("Navigation Commands");
		sel.selectByVisibleText("Switch Commands");

		sel.deselectByVisibleText("Switch Commands");

	}
}
