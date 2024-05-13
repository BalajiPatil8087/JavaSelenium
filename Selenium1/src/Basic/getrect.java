package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrect {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	    Rectangle element = driver.findElement(By.name("pwd")).getRect();
	    System.out.println("Hight"+element.getHeight());
		System.out.println("width"+element.getWidth());
		System.out.println("Startx"+element.getX());
		System.out.println("Starty"+element.getY());
		

	}

}
