//Assignment 6 byHexa.

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rgb {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String expectedhexavalue="47, 84, 116";
		String actualvalue = driver.findElement(By.id("headerContainer")).getCssValue("color");
		if (expectedhexavalue.equals(actualvalue)) 
		{
			System.out.println("PASS: value is same");
			
		}else
		{
			System.out.println("Fail: value is different");
			
		}


	}

}
