package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class password {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    Rectangle element = driver.findElement(By.name("pass")).getRect();
	    System.out.println("Hight:" +element.getHeight());
		System.out.println("width:" +element.getWidth());
		

	}

}
