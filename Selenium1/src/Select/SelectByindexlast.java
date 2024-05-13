package Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectByindexlast {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  //driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("https://www.facebook.com/signup");
		  
		  WebElement element = driver.findElement(By.id("month"));
		  
		  Select s=new Select(element);
		  
		  List<WebElement> allopt = s.getOptions();
		 
		 for(WebElement ele: allopt)
		 {
			s.selectByIndex(allopt.size()-1);
		 }
			
		

		
	}

}
