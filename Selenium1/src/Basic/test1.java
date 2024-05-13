package Basic;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		driver.get("https://demo.acttime.com/login.do");
		Navigation nav= driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		nav.forward();
		

	}

}
