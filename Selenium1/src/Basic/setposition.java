package Basic;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
//18/06/2022

public class setposition {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//verify that user can able set position of web page or not
		//to set manually position then we need to create object
		Point targetPosition=new Point(80,70);//2nd line
		driver.manage().window().setPosition(targetPosition);//1st line

	}

}
