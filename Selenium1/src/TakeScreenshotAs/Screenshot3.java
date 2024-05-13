package TakeScreenshotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot3 
{
	public static void main(String[] args) throws IOException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.google.com/");
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  
		 File tempfile = ts.getScreenshotAs(OutputType.FILE);
		 
		 //System.out.println(tempfile.getAbsolutePath());
		 
		 File destFile = new File("./Errorshots/Googlepage.png");
		 
		 //tempfile.renameTo(destFile);
		 
		 FileUtils.copyFile(tempfile, destFile);
		 
		
	}

}
