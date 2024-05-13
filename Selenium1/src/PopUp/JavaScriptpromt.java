package PopUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptpromt {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		  
		  driver.get("file:///D:/HTML/seleniumhtml/Javascriptpromt.html");
		  
		  Thread.sleep(2000);
		  
		  driver.switchTo().alert().sendKeys("i love satara");

	}

}
