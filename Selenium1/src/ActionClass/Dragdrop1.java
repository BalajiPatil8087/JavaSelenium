package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragdrop1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		   
		 driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		 driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		  
		 WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		 
		 WebElement des = driver.findElement(By.xpath("//div[@class='column sidebar']"));
		  
		  Actions action=new Actions(driver);
		  
		  //action.dragAndDrop(src, des);
		  action.clickAndHold(src).moveToElement(des).release();
		  
		  action.perform();
		  
		

	}

}
