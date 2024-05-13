//testcase8
package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase3radio {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		  
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  
		  driver.findElement(By.name("user_password")).sendKeys("admin");
		  
		  driver.findElement(By.id("submitButton")).click();
		  
		  driver.findElement(By.linkText("Organizations")).click();
		  
		  driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		  
		  driver.findElement(By.name("accountname")).sendKeys("jspider3");
		  
		   WebElement element = driver.findElement(By.name("emailoptout"));
		   if (element.isSelected()) 
		   {
			   System.out.println("True: Radio button is selected");
		   }
		   else
		   {
			   System.out.println("False: Radio button is not selected");
		   }
		   element.click();
		   
		   Thread.sleep(2000);
		   if (element.isSelected()) 
		   {
			   System.out.println("True: Radio button is selected");
		   }
		   else
		   {
			   System.out.println("False: Radio button is not selected");
		   }
		   
		     WebElement element2 = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			 Actions action=new Actions(driver);
			 action.moveToElement(element2).perform();
			 
			 driver.findElement(By.linkText("Sign Out")).click();

	}

}
