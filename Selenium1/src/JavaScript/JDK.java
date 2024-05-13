package JavaScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK {

	public static void main(String[] args) throws InterruptedException 
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		  
		  driver.findElement(By.linkText("jdk-11.0.15.1_linux-aarch64_bin.deb")).click();
		  
		  Thread.sleep(2000);
		  
		  WebElement element = driver.findElement(By.linkText("Download jdk-11.0.15.1_linux-aarch64_bin.deb"));
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		 
		  jse.executeScript("arguments[0].click()", element);
		

	}

}
