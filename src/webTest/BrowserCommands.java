package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) 
	{
		//Creating Driver session
		WebDriver driver=new ChromeDriver();
		
		//Open web application using get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//To get title of web application using getTitle()
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		
		//To get current URL of web application using getCurrentUrl()
		String cUrl=driver.getCurrentUrl();
		System.out.println("Current URL is: "+cUrl);
		
		//To get page source using getPageSource()
		String pgSource=driver.getPageSource();
		System.out.println(pgSource);
		
		//To close the browser -close() / quit()
		driver.quit();
	}

}
