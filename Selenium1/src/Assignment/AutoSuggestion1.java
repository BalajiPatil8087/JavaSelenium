package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allauto = driver.findElements(By.xpath("//li[@class='sbct' and not(@id='YMXe')]"));
		int count = allauto.size();
		System.out.println("total count" +count);
		String expected = "java";
		
		for (WebElement ele : allauto) 
		{
			System.out.println(ele.getText());
			if (ele.getText().equals(expected)) 
			{
				ele.click();
				break;
				
			}
			
		}

	}

}
