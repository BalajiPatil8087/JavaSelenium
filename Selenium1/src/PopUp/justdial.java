	
	
package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justdial {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("https://www.justdial.com/");
			
		  Robot rt=new Robot();
         
		  rt.keyPress(KeyEvent.VK_TAB);
		  rt.keyRelease(KeyEvent.VK_TAB);
		  
		  Thread.sleep(2000);
		  
		  rt.keyPress(KeyEvent.VK_ENTER);
		  rt.keyRelease(KeyEvent.VK_ENTER);
		  
		
	}

}
