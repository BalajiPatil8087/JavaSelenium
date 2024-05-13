package WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindow2 
{
	   static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.salesforce.com/in/?ir=1");
		  
		 String parentwindowid = driver.getWindowHandle();
		 System.out.println(parentwindowid);
		  
		  driver.findElement(By.xpath("//a[@aria-label='Start my free trial with Salesforce CRM']")).click();
		  
		  Set<String> handles = driver.getWindowHandles();
		  
		  ArrayList<String> hList = new ArrayList<String>(handles);
		  
		  //System.out.println(hList);
		  
		  if(SwitchtoRightWindow("Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN", hList))
		  {
			  System.out.println(driver.getCurrentUrl() + ":"+ driver.getTitle());
		  }
		  
		  closeWindow(parentwindowid,hList);
		
		  
		
		

	}
	 public static void closeWindow(String parentwindowid,List<String> hList)
	 
	 {
		 for (String e : hList) 
		 {
			 if (!parentwindowid.equals(e)) 
			 {
				driver.switchTo().window(e).close();
			}
			
		}
		 
	 }
	  public static boolean SwitchtoRightWindow(String windowTitle,List<String> hList)
	  {
		  for (String e : hList) 
		  {
			String title = driver.switchTo().window(e).getTitle();
			  
			if (title.contains(windowTitle)) 
			   {
				   System.out.println("Found right window..");
				   
				   return true;
			   }
		  }
		return false;
		  
	  }

}
