package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMLoginLogout {
	public static void main(String[] args)
	{
		// Creating WebDriver session and opening CRM website
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm");
		
		//Clicking Sign In button
		driver.findElement(By.id("SignIn")).click();
		
		//Email address
		driver.findElement(By.name("email-name")).sendKeys("mitzi@gmail.com",Keys.ENTER);
		
		//Password
		driver.findElement(By.name("password-name")).sendKeys("hi123",Keys.ENTER);
		
		//Clicking Submit button
		driver.findElement(By.id("submit-id")).click();
		
		//Clicking Sign Out button
		driver.findElement(By.className("nav-link")).click();	
	}
}
