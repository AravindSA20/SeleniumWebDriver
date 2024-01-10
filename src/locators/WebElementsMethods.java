package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		System.out.println("Text :"+ele.getText()); //there is no text in searchbox
		System.out.println("Attribute :"+ele.getAttribute("id")); //id for searchbox
		System.out.println("CSS valu: "+ele.getCssValue("color")); //color 
		System.out.println("Location: "+ele.getLocation()); // to get location of search box in X,Y coordinates of the page
		System.out.println("Size: "+ele.getSize()); //To get size of the searchbox in dimensions
		
	}

}
