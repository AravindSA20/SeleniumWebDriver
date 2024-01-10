package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkAutomation_CRM {

	public static void main(String[] args)
	{	
		// Creating WebDriver session and opening CRM website
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm");
		
		// Sign In using linkText() and partialLinkText()
	//  driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.partialLinkText("In")).click();
		
		//Email address
		driver.findElement(By.id("email-id")).sendKeys("test123@gmail.com",Keys.ENTER);
		
		//Password
		driver.findElement(By.name("password-name")).sendKeys("hi123",Keys.ENTER);
	
		//Checkbox
	    driver.findElement(By.id("remember")).click();
	    
	    //Clicking Submit button
	  	driver.findElement(By.name("submit-name")).click();
	  	
	  	//Clicking Sign Out button
	  	driver.findElement(By.linkText("Sign Out")).click();	
	  	
	  	//To get text using getText()
	  	WebElement ele=driver.findElement(By.tagName("p"));
	  	System.out.println("Text is :"+ele.getText()); 
	}

}
