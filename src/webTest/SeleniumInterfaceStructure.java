package webTest;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInterfaceStructure {

	public static void main(String[] args) {
		
		//Parent interface for selenium
		
		//SearchContext s=new ChromeDriver(); //SearchContext can access only two methods
		
		//Child Interface for selenium
		WebDriver driver=new ChromeDriver();
		

	}

}
