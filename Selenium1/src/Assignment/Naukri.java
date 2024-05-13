package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukri {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.naukri.com/");
		  
		   driver.findElement(By.id("login_Layer")).click();
		  
		 
		 WebElement element = driver.findElement(By.xpath("//input[@class='err-border']"));
		 JavascriptExecutor jse =(JavascriptExecutor)driver;
		 
		 jse.executeScript("arguments[0].value='pune'", element);
		  
	

	}

}
