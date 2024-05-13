package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup1 {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("https://licindia.in/");
		  
		   WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Pay Premium through')]"));
		  
		  JavascriptExecutor jse=(JavascriptExecutor)driver;
		   
		  jse.executeScript("window.scrollBy(0,400");
		  
		  driver.switchTo().alert().accept();
		  
		  
		  
         
	}

}
