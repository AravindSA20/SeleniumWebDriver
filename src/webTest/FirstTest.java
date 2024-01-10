package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

	public static void main(String[] args) 
	{
		//Create Driver Session
		System.out.println("Launching the Chrome Browser!");
		WebDriver driver1=new ChromeDriver();  //Cntrl+shift+o -->to resolve import issue
		
		System.out.println("Launching the Firefox Browser!");
		WebDriver driver2=new FirefoxDriver();
		
		System.out.println("Launching the Edge Browser!");
		WebDriver driver3=new EdgeDriver();
		
		driver1.close();
		driver2.close();
		driver3.close();
	 
	} 

}


