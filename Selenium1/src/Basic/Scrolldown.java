package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/doodles");
		driver.findElement(By.xpath("//a[text()=\"Teachers' Day 2022 (July 06)\"]")).click();
		
        
		//driver.get("https://www.flipkart.com/");
		
		//driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		//driver.findElement(By.xpath("//div[text()=\"Grocery\"]"));
		
		
	}

}
