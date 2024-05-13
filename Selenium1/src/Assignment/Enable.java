package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		boolean element = driver.findElement(By.xpath("//input[@class='_3704LK']")).isEnabled();
		System.out.println(element);
		

	}

}
