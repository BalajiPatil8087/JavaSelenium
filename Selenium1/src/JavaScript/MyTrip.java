package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTrip {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  //driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.easemytrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=14425253924&utm_content=128139253602&utm_term=easemytrip&utm_campaign=14425253924&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=128139253602&gclid=CjwKCAjwlqOXBhBqEiwA-hhitAy9s29GSjpmcUhtCzFHoMmCcDpBE8KZ6oS4TbvUGdVCNvTgFEjXtRoClu8QAvD_BwE");
		  
		  WebElement element = driver.findElement(By.id("ddate"));
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		 
		  jse.executeScript("arguments[0].value='05/08/2022'", element); 
		

	}

}
