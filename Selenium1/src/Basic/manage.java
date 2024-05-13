package Basic;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//Create a object of window instead of calling differently each  method
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().maximize();
		//if you are calling multiple time method then create object of window class.
		//if multiple test cases are perform
		Window window= driver.manage().window();
		window.maximize();
		Thread.sleep(2000);
		window.minimize();
		Thread.sleep(2000);
		window.fullscreen();

	}

}
