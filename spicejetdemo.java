package seleniumdemooffb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class spicejetdemo {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_ddl_originStation1_CTXT]")).sendKeys("Che");
		int tablecount = driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).size();
		for (int i = 0; i < tablecount; i++) {
			String depaturecity = driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).get(i).getText();
			System.out.println("depaturecity");
			if (depaturecity.equals("Chennai (MAA)")) {
				driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).get(i).click();
				System.out.println("depature city selected as Chennai (MAA)");
			}
		}

		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("ko");
		int secondtablecount = driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).size();
		System.out.println(secondtablecount);
		for (int j = 0; j < secondtablecount; j++) {
			String arrivalcity = driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).get(j).getText();
			if (arrivalcity.equals("Kochi (COK)")) {
				driver.findElements(By.xpath("//li[contains(@class,'livecl')]")).get(j).click();
				System.out.println("arrivalcity is kochi");
			}
		}

		WebElement date = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']"));
		date.click();
		int datecounts = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group-first')]//table//tbody//tr//td//a")).size();
		System.out.println(datecounts);
		for (int k = 0; k < datecounts; k++) {
			String selecteddate = driver.findElements(By.xpath(
					"//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group-first')]//table//tbody//tr//td//a")).get(k).getText();
			if (selecteddate.equalsIgnoreCase("5")) {
				driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[contains(@class,'ui-datepicker-group-first')]//table//tbody//tr//td//a")).get(k).click();
				System.out.println(selecteddate);
			}
		}
		//Thread.sleep(2000);

		WebElement todate=driver.findElement(By.xpath("//div[@id='Div1']//button[@class='ui-datepicker-trigger']"));
		//Thread.sleep(2000);
		todate.click();
		int datecounts1 = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td//a")).size();
		System.out.println(datecounts1);
		for (int l = 0; l < datecounts1; l++) {
			String selectedtodate = driver.findElements(By.xpath(
					"//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td//a"))
					.get(l).getText();
			if (selectedtodate.equalsIgnoreCase("5")) {
				driver.findElements(By.xpath(
						"//div[@id='ui-datepicker-div']//div[@class='ui-datepicker-group ui-datepicker-group-first']//table//tbody//tr//td//a"))
						.get(l).click();
				System.out.println(selectedtodate);
			}
		}

		// driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

		Select sel = new Select(ele1);
		sel.selectByValue("1");
		System.out.println("adult selected as 1");

		WebElement ele2 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));
		Select sel1 = new Select(ele2);
		sel1.selectByIndex(0);
		System.out.println("child selected as 0");

		WebElement ele3 = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Infant']"));
		Select sel2 = new Select(ele3);
		sel2.selectByValue("0");
		System.out.println("infant selected as 0");

		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select currencyobj = new Select(currency);
		currencyobj.selectByValue("AED");
		System.out.println("selected currency is AED");

		driver.findElement(By.cssSelector("input[id=ctl00_mainContent_btn_FindFlights]")).click();

	}
}
