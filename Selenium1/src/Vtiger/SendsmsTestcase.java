package Vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendsmsTestcase {

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
		  
		  driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		  
		  driver.findElement(By.id("3")).click();
		  
		  driver.findElement(By.xpath("//input[@onclick=\"SMSNotifierCommon.displaySelectWizard(this, 'Accounts');\"]")).click();
		  
		  Thread.sleep(2000);
		 
		  driver.findElement(By.xpath("//input[@class='small crmbutton cancel']")).click();
		  

		     WebElement element2 = driver.findElement(By.cssSelector("img[src='themes/softed/images/user.PNG']"));
			 Actions action=new Actions(driver);
			 action.moveToElement(element2).perform();
			 
			 driver.findElement(By.linkText("Sign Out")).click();

	}

}
