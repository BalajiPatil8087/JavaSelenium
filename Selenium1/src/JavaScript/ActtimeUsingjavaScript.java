package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActtimeUsingjavaScript {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  //driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://demo.actitime.com/login.do");
		  
		  WebElement element = driver.findElement(By.id("loginButton"));
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		 
		  jse.executeScript("arguments[0].click()", element);
		  
	}

}
