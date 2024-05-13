
//Assignment 6 by RGB
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RGB1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("login")).click();
		String exceptedvalue = "40, 40, 73";
		String actualvalue = driver.findElement(By.xpath("//div[@class='_9ay7']")).getCssValue("color");
		if (exceptedvalue.equals(actualvalue)) 
		{
			System.out.println("PASS: value is same");
		}else
		{
			System.out.println("Fail: value is different");
		}
		
	}

}
