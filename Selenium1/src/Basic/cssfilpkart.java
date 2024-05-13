package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssfilpkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Grocery']")).click();//Grocery
		
		
		Navigation nav=driver.navigate();
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Mobiles']")).click();//Mobile
		Thread.sleep(2000);
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt='Travel']")).click();//Travel
		Thread.sleep(2000);
		nav.back();
		nav.refresh();
		
		driver.findElement(By.cssSelector("img[alt='Fashion']")).click();//Fashion
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Home']")).click();//Home
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Electronics']")).click();//electronic
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("img[alt='Appliances']")).click();//Appliances
		nav.back();
		nav.refresh();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("img[alt='Beauty, Toys & More']")).click();//Beauty & Toys
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
	
		
		
		
		
	}

}
