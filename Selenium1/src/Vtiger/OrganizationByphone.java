//test case28

package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrganizationByphone {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		  
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  
		  driver.findElement(By.name("user_password")).sendKeys("admin");
		  
		  driver.findElement(By.id("submitButton")).click();
		  
		  driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		  
		 WebElement element = driver.findElement(By.id("bas_searchfield"));
		 
		 element.click();
		 
		 Select s=new Select(element);
		 s.selectByIndex(4);
		 
		 driver.findElement(By.name("submit")).click();
		 
		 Thread.sleep(2000);
		 
		  
		 WebElement element2 = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
		 Actions action=new Actions(driver);
		 action.moveToElement(element2).perform();
		 
		 driver.findElement(By.linkText("Sign Out")).click();
		  
		

	}

}
