package WindowHandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiplewindow 
{
	  static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		   driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		  String parentwindowId = driver.getWindowHandle();
		  
		  //Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		  
		  driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		  
		  driver.findElement(By.xpath("(//a[@target='_blank'])[3]")).click();
		  
		  driver.findElement(By.xpath("(//a[@target='_blank'])[4]")).click();
		  
		  Set<String> handles = driver.getWindowHandles();
		  
		  List<String> hList = new ArrayList<String>(handles);
		  
		  //System.out.println(hList);
		  
		  if(switchToRightWindow("Facebook", hList)) 
		  {
			System.out.println(driver.getCurrentUrl() + ":"+ driver.getTitle());
		  }
		  
		  closeAllwindow(hList, parentwindowId);
		  
		  switchToParentWindow(parentwindowId);
		  System.out.println(driver.getCurrentUrl() + ":"+driver.getTitle());
		  
		  
	}
	 
	public static void  closeAllwindow(List<String> hList,String parentwindowId)
	{
		for (String e: hList) 
		{
			if (!e.equals( parentwindowId))
			{
				driver.switchTo().window(e).close();
				
			}
			
		}
		
	}
	  public static void switchToParentWindow(String parentwindowId) 
	  {
		  driver.switchTo().window(parentwindowId);
	  }


	public static boolean switchToRightWindow(String windowTitle, List<String> hList)
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
