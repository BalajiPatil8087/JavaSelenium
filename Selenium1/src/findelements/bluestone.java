package findelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bluestone
{
	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   
		   WebDriver driver=new ChromeDriver();
		   
		   driver.manage().window().maximize();
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://www.bluestone.com/");
		  
		   driver.findElement(By.id("confirmBtn")).click();
		  
		   driver.findElement(By.xpath("//a[text()='Rings ']")).click();
		   
		   driver.findElement(By.xpath("//a[text()='Engagement']")).click();
		  
		   driver.findElement(By.id("pid_1815")).click();
		  
		   driver.findElement(By.id("buy-now")).click();
		  
		  
		  
		
	}

}
