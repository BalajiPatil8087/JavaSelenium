package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable3 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		driver.findElement(By.partialLinkText("jdk-11.0.15_linux-aarch64_bin.deb")).click();
		boolean element = driver.findElement(By.xpath("//div[@class='obttn bttn-disabled']")).isEnabled();
		System.out.println(element);
		
	}

}
