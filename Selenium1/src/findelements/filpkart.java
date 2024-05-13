package findelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart 
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   
		 WebDriver driver=new ChromeDriver();
		   
		 driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		 driver.get("https://www.flipkart.com/");
		  
          driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		  
		  driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		
		  driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		  
		  driver.findElement(By.xpath("//a[text()='Realme']")).click();
		  
		  driver.findElement(By.xpath("//div[text()='Realme Narzo 50i (Carbon Black, 32 GB)']")).click();
		  
		  driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
	}

}
