package JavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMeassage {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://demo.actitime.com/login.do");
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;  //Down casting line
		  
		  jse.executeScript("window.alert('Enter your name')");
		

	}

}
