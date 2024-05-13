//Explicit wait
package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class URL 
{
	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		   
		   
		   driver.get("https://demo.actitime.com/login.do");
		   
		   driver.findElement(By.id("username")).sendKeys("admin");
		   
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   
		   driver.findElement(By.id("loginButton")).click();
		  
		   String Exceptedurl = "https://demo.actitime.com/user/submit_tt.do";
		   
		  wait.until(ExpectedConditions.urlToBe(Exceptedurl));
		   
		  
		   String actualurl = driver.getCurrentUrl();
		   
		   System.out.println(actualurl);
		   
		   if (actualurl.contains(Exceptedurl)) 
		   {
			   System.out.println("pass");
			
		  }
		   else
		   {
			   System.out.println("fail");
		   }
		  
		  
	}

}
