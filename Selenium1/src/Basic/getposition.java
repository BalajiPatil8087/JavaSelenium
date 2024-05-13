package Basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class getposition {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//for printing purpose Create local variable point
		//Scenario =verify that user can able to get the x and y position of the web page
		
		Point point = driver.manage().window().getPosition();
		System.out.println("Startx="+point.getX());
        System.out.println("Starty="+point.getY());
	}

}
