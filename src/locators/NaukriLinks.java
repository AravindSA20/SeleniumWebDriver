package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriLinks {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		//Number of Links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links in the Homepage: "+links.size());
		
		String expLink="https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i:links)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
			try {
			if(i.getAttribute("href").contains(expLink))
			{
				System.out.println("The Freshers Job link is found...Test is passed!");
				break;
			}
			}catch(NullPointerException n)
			{
				System.out.println("Attribute href value is null");
			}
			
		}
	}

}
