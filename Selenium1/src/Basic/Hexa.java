package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hexa 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String element=driver.findElement(By.xpath("//span[@class='errormsg' and not(@id='errorSpan')]")).getCssValue("colors");
		System.out.println(element.isEmpty());
		String expectedhexavalue = "";
		
	}

}
