package Basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//Scenario= verify that user able to set size of the web page dynamically or not
		
		Dimension targetsize= new Dimension(200,300);//set the dimension of the web page
		driver.manage().window().setSize(targetsize);

	}

}
