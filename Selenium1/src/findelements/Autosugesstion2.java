package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosugesstion2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   
		WebDriver driver=new ChromeDriver();
		   
		driver.manage().window().maximize();
		  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		driver.get("https://www.google.com/");
		 
	      driver.findElement(By.name("q")).clear();
		  List<WebElement> allauto = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		 
		  int count=allauto.size();
		  System.out.println("total count="+count);
		
		 
		  String expectedauto = "selenium  foods";
		  for (WebElement ele : allauto) 
		  {
			System.out.println( ele.getText());
			  
			 /* if (ele.getText().equals(expectedauto))
			  {
				  ele.click();
				  break;
				
			}*/
			
		  }


	}

}