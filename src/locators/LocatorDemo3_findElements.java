package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3_findElements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//Global Wait - always add after driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Number of input boxes
		List<WebElement> textboxes=driver.findElements(By.tagName("input"));
		System.out.println("Total number of text boxes: "+textboxes.size());
		
		//Number of images
		int count=driver.findElements(By.tagName("img")).size();
		System.out.println("Total number of images: "+count);
		
		//Number of Links 
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are: "+link.size());
		
		String expLink="https://www.youtube.com/c/OrangeHRMInc";

		for(WebElement i:link)
		{
		System.out.println(i.getAttribute("href"));
		System.out.println(i.getText());
		if(i.getAttribute("href").contains(expLink))
		{
			System.out.println("The Youtube Link is found...Test Passed!");
			i.click();
			break; ///break is used to exit from the loop
		}	
		}
	}

}
