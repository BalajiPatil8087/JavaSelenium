package JavaScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToreturn
{

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  //driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.naukri.com/");
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		  
		 /* Object ht = jse.executeScript("window.scrollTo(return document.body.scrollHeight)");
		  
		  long height=(long)ht;*/
		  
		  long height=(long)jse.executeScript("return document.body.scrollHeight");
		  
		  System.out.println("total height= "+height);
		
		  Thread.sleep(2000);
		  
          long width=(long)jse.executeScript("return document.body.scrollHeight");
		  
		  System.out.println("total width= "+width);
		
		  
      }

}
