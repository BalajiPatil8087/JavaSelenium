package JavaScript;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doodles {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.google.com/doodles");
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;  //Down casting line
		 
		  try
		  {
			  driver.findElement(By.partialLinkText("Mother's Day 2022 (May 30)")).click();
		  }
		  catch(NoSuchElementException e)
		  {
			  jse.executeScript("window.scrollBy(0,600)");
			  
		  }
		  
		

	}

}
