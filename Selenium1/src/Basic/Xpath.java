
package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[1]/a/div/div/img")).click();//top offers
		Thread.sleep(2000);
		
		Navigation nav=driver.navigate();
		nav.back();
		nav.refresh();
		Thread.sleep(2000);
	   

		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[2]/a/div/div/img")).click();//grocery
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div["
				+ "2]/div/div/div[3]/a/div/div/img")).click();//mobile
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[4]/a/div/div/img")).click();//fashion
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[6]/a/div[1]/div/img")).click();//home
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[5]/a/div/div/img")).click();//electronic
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[7]/a/div/div/img")).click();//Appliance
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[9]/a/div/div/img")).click();//Beauty Toy
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("html/body/div/div/div[2]/div/div/div[8]/a/div/div/img")).click();//Travel
		nav.back();
		nav.refresh();
		
		Thread.sleep(2000);
		
	}

}
