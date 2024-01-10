package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		//Google
		driver.get("https://www.google.com/");
		System.out.println("Title: "+driver.getTitle());
		//Static wait in Selenium
		Thread.sleep(2000);
		
		//Google ---> Facebook
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title: "+driver.getTitle());
		Thread.sleep(2000);
		
		//Google <- Facebook - back() 
		driver.navigate().back();
		Thread.sleep(2000);
		
		//Google -> Facebook - forward()
		driver.navigate().forward();
		
		//refresh()
		driver.navigate().refresh();
	}
}
