package Basic;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//for printing purpose create local variable dimension.
		//Scenario=verify that the height and width of web page
		Dimension dim = driver.manage().window().getSize();
		System.out.println("width="+dim.getWidth());//this methods of dimension class.
		System.out.println("Height="+dim.getHeight());
		
		
	}

}
