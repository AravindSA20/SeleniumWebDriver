package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_CssSelector {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Sign In
		driver.findElement(By.cssSelector("input.oxd-input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input.oxd-input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Sign Out
		driver.findElement(By.cssSelector("span.oxd-userdropdown-tab")).click();
		driver.findElement(By.cssSelector("a[href='/web/index.php/auth/logout']")).click();
	}
}
