package JavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException
	{
		 
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  //driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.amazon.in/");
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;    //Down casting line
		  
		  jse.executeScript("window.scrollBy(0,600)");
		 
		  Thread.sleep(2000);
		  
		  jse.executeScript("window.scrollBy(0,-600)");

	}

}
