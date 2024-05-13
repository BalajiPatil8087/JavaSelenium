package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class hexa1 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String expectedhexavalue="#f02849";
		driver.findElement(By.name("login")).click();
		String actualvalue=driver.findElement(By.xpath("//div[@class='_9ay7']")).getCssValue("color");
		String actualhexavalue=Color.fromString(actualvalue).asHex();
		if (actualhexavalue.equals(expectedhexavalue)) 
		{
			System.out.println("PASS: value is same");
			
		}
		else
		{
			System.out.println("FAIL: value is diiferent");
		}
		
		
		
		
		
		/*String expectedhexavalue="#1877f2";
		String actualvalue=driver.findElement(By.name("login")).getCssValue("background-color");
		String actualhexavalue=Color.fromString(actualvalue).asHex();
		if (actualhexavalue.equals(expectedhexavalue)) 
		{
			System.out.println("PASS: value is same");
			
		}
		else
		{
			System.out.println("FAIL: value is diiferent");
		}*/
	

	}

}