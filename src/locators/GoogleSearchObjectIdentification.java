package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchObjectIdentification {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
      //1. Identify + Validate + Action
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		//Validation on WebElement
		System.out.println("Is the Searchbox is Displayed? : "+ele.isDisplayed()); //True
		System.out.println("Is the Searchbox is enabled? : "+ele.isEnabled()); //True
		
		//Action
		ele.sendKeys("Shinchan",Keys.ENTER);   
		
	  //Identify +Action in single line
		//driver.findElement(By.id("APjFqb")).sendKeys("Shinchan",Keys.ENTER);
		
		
		
 /*    	//2. By Locator Technique
		 * By is a class in selenium
		 * By class helps you get/provide the locator
		 * By.locator always returns By class object
		 
		By searchEle=By.id("APjFqb");
		
		//To identify same address - WebElement is an interface
		WebElement searchBox=driver.findElement(searchEle);
		
		//Actions on WebElement
		searchBox.sendKeys("Shinchan");
		
		searchBox.sendKeys(Keys.ENTER);
*/
		driver.close();
	}

}
