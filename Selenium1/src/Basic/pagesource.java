package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesource {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");//used to open the browser
		//Scenario=verify that user can able to get complete HTML code of web page.use get page source
		//String element =driver.getpagesource();
		String pxpectedpagesource ="please identify yourself";
		String actualpagesource=driver.getPageSource();
		//System.out.println();
		
		if (actualpagesource.contains(actualpagesource)) //1st use equal and then instead of it
		{
			System.out.println("PASS:pagesource is present");
			
		}
		else
		{
			System.out.println("FAIL: pagesource is not present");
		}
		//Scenario=verify that user can able  to close the web page.
		driver.close();
		
		

	}

}
