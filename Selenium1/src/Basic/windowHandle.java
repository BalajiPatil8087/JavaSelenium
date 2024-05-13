package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String st:windows)
		{
			System.out.println(st);
			driver.switchTo().window(st);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			
		}
		
		
	}

}
