package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit 
{

	public static void main(String[] args) 
	{
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   driver.get("https://demo.actitime.com/login.do");
		   
		   driver.findElement(By.id("username")).sendKeys("admin");
		   
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   
		   driver.findElement(By.id("loginButton")).click();
		   
		   driver.findElement(By.id("logoutLink")).click();
		
	}

}
