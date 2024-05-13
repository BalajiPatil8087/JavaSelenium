package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragdropBy {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		   
		 driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		 driver.get("https://jqueryui.com/draggable/");
		 
		 driver.switchTo().frame(0);      //driver control from parent to child
		 
	     WebElement source = driver.findElement(By.id("draggable"));
		 
	     Actions action=new Actions(driver);
		 
		 action.dragAndDropBy(source, 100, 100);
		  
		 action.perform();
		
	}

}
