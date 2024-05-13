package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orangehrm 
{

	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		   
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/");
		  
		  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		  
		  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		  
		  driver.findElement(By.id("btnLogin")).click();
		  
		  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		  
		  driver.findElement(By.id("menu_pim_viewPimModule")).click();
		  
		  driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		  
		  driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		  
		  driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		  
		  driver.findElement(By.id("menu__Performance")).click();
		  
		  driver.findElement(By.id("menu_dashboard_index")).click();
		  
		  driver.findElement(By.id("menu_directory_viewDirectory")).click();
		  
		  driver.findElement(By.id("menu_maintenance_purgeEmployee")).click();
		  
		  driver.findElement(By.id("menu_buzz_viewBuzz")).click();
		  
		  driver.findElement(By.id("welcome")).click();
		  
		  driver.findElement(By.linkText("Logout")).click();

	}

}
