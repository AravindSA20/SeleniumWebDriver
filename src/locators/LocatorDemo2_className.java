package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_className {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//E-mail using id
		driver.findElement(By.id("input-email")).sendKeys("kane09@gmail.com",Keys.ENTER);
		
		//Password using name
		driver.findElement(By.name("password")).sendKeys("goalmachine",Keys.ENTER);
		
		//Login using className - try to ignore className as it is used in so many places
	//	driver.findElement(By.className("btn btn-primary")).click(); //this clicks on Continue button because of same className
		
		//className using cssSelector
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click(); //input is +  tagName --tagName.className
	}

}
