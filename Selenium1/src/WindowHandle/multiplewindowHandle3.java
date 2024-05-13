package WindowHandle;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindowHandle3 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.salesforce.com/in/?ir=1");
		
		  driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
		  
		  Set<String> handles = driver.getWindowHandles();
		  System.out.println(handles);
		  
		 Iterator<String> iterator = handles.iterator();
		 String parentwindow = iterator.next();
		 System.out.println(parentwindow);
		
		 String childwindow = iterator.next();
	     System.out.println(childwindow);
	     
	     Thread.sleep(2000);
		
		 driver.switchTo().window(childwindow);
		
		WebElement element1 = driver.findElement(By.id("UserFirstName-g9hG"));
        WebElement element2 = driver.findElement(By.id("UserLastName-VbeQ"));
        
        
		 JavascriptExecutor jse =(JavascriptExecutor)driver;
		 
		 jse.executeScript("arguments[0].value='sagar'", element1);
		 jse.executeScript("arguments[1].value='sagar'", element2);
        driver.switchTo().window(parentwindow);
	}

}
