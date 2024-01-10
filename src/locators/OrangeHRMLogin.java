package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		//Global Wait - always add after driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//User Name
		driver.findElement(By.name("username")).sendKeys("Admin");

		//Password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//Clicking Sign In
		driver.findElement(By.className("oxd-button")).click();
		
		//Clicking List to sign out
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(2000);
		
		//Clicking Sign Out
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
