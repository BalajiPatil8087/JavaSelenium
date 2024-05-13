
//custom is select or not
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		boolean element = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input[@type='radio']")).isSelected();
        System.out.println(element);
	}

}
