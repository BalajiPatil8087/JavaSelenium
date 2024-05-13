package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testcase21 {

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		  
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  
		  driver.findElement(By.name("user_password")).sendKeys("admin");
		  
		  driver.findElement(By.id("submitButton")).click();
		  
		 WebElement element = driver.findElement(By.linkText("Contacts"));
		 
         Actions action=new Actions(driver);
		  
		  action.doubleClick(element).perform();
		  
		  driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		  
		  driver.findElement(By.name("lastname")).sendKeys("patil");
		  
		  driver.findElement(By.name("imagename")).click();
		  
		/*  driver.findElement(By.xpath("//input[@src='themes/images/clear_field.gif']")).click();
		  
		  driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		  
		 // driver.findElement(By.name("button")).click();
		
		  WebElement element2 = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			 Actions action=new Actions(driver);
			 action.moveToElement(element2).perform();
			 
			 driver.findElement(By.linkText("Sign Out")).click();
		*/

	}

}
