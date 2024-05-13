package PopUp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 // WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("https://www.naukri.com/");
		  
		  driver.findElement(By.id("login_Layer")).click();
		  
		  WebElement element1 = driver.findElement(By.xpath("//div[text()='Please enter your Email ID / Username']"));
		  
		  element1.clear();
		  
		  element1.sendKeys("patilsagar@gmail.com");
		  
		 WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
		 
		 element2.clear();
		 
		 element2.sendKeys("8087213448");
		 
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
			
	
     
		  
	

	}

}
