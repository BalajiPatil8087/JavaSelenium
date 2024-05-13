
//closing child window using selenium
package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		String parentwindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> allwindowId=driver.getWindowHandles();
		
		allwindowId.remove(parentwindowId);
		for(String st:allwindowId)
		{
			driver.switchTo().window(st);
			driver.close();
		}
		
		
	}

}
