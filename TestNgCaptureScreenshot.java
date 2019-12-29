package seleniumdemooffb;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestNgCaptureScreenshot {
	
	public static void getImage(WebDriver driver, String imageName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(System.getProperty("C:\\Users\\Sabari\\eclipse-workspace1\\seleniumdemo\\src\\seleniumdemooffb")+"/screenshots/"+imageName+".png");
		FileHandler.copy(srcFile, destFile);
	}
}
