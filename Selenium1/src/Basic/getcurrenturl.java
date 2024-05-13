package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl {

	public static void main(String[] args) 
	{
		//launching an empty ChromeDriver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();//object of ChormeDriver
		
		
		//if user want to open,navigate any browser then use 3rd getCurrenyurl() method of selenium
		driver.get("https://demo.actitime.com/login.do");
		
		//Scenario=To verify that current url is same or not
		
		String expectedurl="https://demo.actitime.com/login.do";
		String actualurl=driver.getCurrentUrl();
		
		if (actualurl.equals(expectedurl)) 
		{
			System.out.println("PASS: is same");
		}
		else
		{
			System.out.println("FAIL: is different");
		}
			
			
			
		}

	}


