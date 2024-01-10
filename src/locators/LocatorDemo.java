package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Username
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.ENTER);
		
		//Password
		driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys.ENTER);
		
		//Login 
		driver.findElement(By.name("login-button")).click();

		//NoSuchElementException
	//	driver.findElement(By.name("Messi10"));
	}

}
