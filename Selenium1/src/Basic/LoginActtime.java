package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActtime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("loginButton")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("container_tasks")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("usersManagementBodyTagId")).click();
	    
	    
		
		
	}
	

}