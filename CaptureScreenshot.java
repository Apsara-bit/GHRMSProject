package seleniumdemooffb;

	


	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.io.FileHandler;

	public class CaptureScreenshot {

		public void getImage(String imgname) throws IOException {
		 WebDriver driver = null;
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcfile=ts.getScreenshotAs(OutputType.FILE);
			File destfile=new File(System.getProperty("C:\\Users\\Sabari\\eclipse-workspace1\\seleniumdemo\\src\\seleniumdemooffb")+"/screenshots"+imgname+".png");
			
			FileHandler.copy(srcfile, destfile);
		}

	}



