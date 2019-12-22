package seleniumdemooffb;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizefb {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\Desktop\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Dimension d=new Dimension(500,600);
			driver.manage().window().setSize(d);
			System.out.println(d);
		    driver.close();
	}
}


//Dimension class in Selenium and method is setSize()