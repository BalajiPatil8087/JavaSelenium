package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("https://www.flipkart.com/");
		  
		  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  
		 WebElement element = driver.findElement(By.xpath("//div[text()='Fashion']"));
		 
		 Actions action=new Actions(driver);
		 
		 action.moveToElement(element);
		  
		 action.perform();
		  
	}

}
