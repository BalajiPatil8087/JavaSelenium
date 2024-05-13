package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Hexa {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String exceptedhexavalue = "#1877f2";
		String actualhexavalue = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).getCssValue("color");
		actualhexavalue=Color.fromString(actualhexavalue).asHex();
		if (actualhexavalue.equals(exceptedhexavalue)) 
		{
			System.out.println("PASS: value is same");
			
		}
		else
		{
			System.out.println("FAIL: value is diiferent");
		}
		
	}

}
