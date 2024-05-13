package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Point element = driver.findElement(By.id("username")).getLocation();
		System.out.println("Startx"+element.getX());
		System.out.println("Starty"+element.getY());
		
		
		Point element1=driver.findElement(By.className("pwd")).getLocation();
		System.out.println("Startx"+element1.getX());
		System.out.println("Starty"+element1.getY());
		
		if (element==element1) 
		{
			System.out.println("point ae same");
			
		}
		else
		{
			System.out.println("points are not same");
		}
		
		
	}

}
