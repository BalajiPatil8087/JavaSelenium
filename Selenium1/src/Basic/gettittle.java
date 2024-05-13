package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class gettittle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String expectedtitle="Please verify thatyourself";
		String actualtitle=driver.getTitle();
		
		if (actualtitle.equals(expectedtitle)) 
		{
			System.out.println("PASS:title is same");
			
		}
		else
		{
			System.out.println("FAIL:title is different");
		}
		


	}

}
