package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllListScenario_OpenCart {

	public static void main(String[] args) {
		
		//Printing every options of menu in the console
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/success");
	
		List<WebElement> allOptions=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		System.out.println("Total Elements: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}

}
