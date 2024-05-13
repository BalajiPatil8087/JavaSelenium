package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class acti {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		  
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		  // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		   
		  // driver.get("https://demo.actitime.com/login.do");
		  // List<WebElement> alllist = driver.findElements(By.tagName("a"));

		   driver.get("https://www.flipkart.com/");
		   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		  List<WebElement> alllist = driver.findElements(By.tagName("a"));
		   
		   
		   for (WebElement ele : alllist) 
		   {
			   //System.out.println(ele.getText());
			   String st=ele.getText();
			   if (!st.isEmpty()) 
			   {
				   System.out.println(st);
				
			   }
			
		   }
	}

}
