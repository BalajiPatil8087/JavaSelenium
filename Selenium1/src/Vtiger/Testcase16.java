//testcase15
package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase16 {

	public static void main(String[] args) throws InterruptedException
	{
		
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			 
			WebDriver driver= new ChromeDriver();
			  
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			driver.manage().window().maximize();
			  
			driver.get("http://localhost:8888/index.php?action=Login&module=Users");
			  
			driver.findElement(By.name("user_name")).sendKeys("admin");
			
			driver.findElement(By.name("user_password")).sendKeys("admin");
			
			driver.findElement(By.id("submitButton")).click();
			
			driver.findElement(By.linkText("Organizations")).click();
			
			driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
			
			driver.findElement(By.name("accountname")).sendKeys("Qspd");
			
			Thread.sleep(2000);
			
			WebElement check = driver.findElement(By.name("notify_owner"));
			check.click();
			
			if(check.isEnabled())
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("False");
				Thread.sleep(2000);
			}

		     WebElement element2 = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			 Actions action=new Actions(driver);
			 action.moveToElement(element2).perform();
			 
			 driver.findElement(By.linkText("Sign Out")).click();
	}
	 
}


