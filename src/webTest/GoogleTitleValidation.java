package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) {
	/*   
	 Test Case: Test for Google application title
	 
	 Step 1: Open Google application browser
	 Step 2: Access current page title
	 Step 3: Validate with expected title
	 Step 4: Print the result
	 Step 5: Close the browser
	 */
		
		//Test for Google application title
		WebDriver driver=new ChromeDriver();
		
		//Step 1: Open Google application browser -get()
		driver.get("https://www.google.com/");
		
		//Step 2: Access current page title- getTitle() returns string type
		String title=driver.getTitle();
		System.out.println("Current title of Google page is: "+title);
		
		//Step 3 & 4: Validate with expected title and Validate with expected title
		if(title.equals("Google"))
		{
			System.out.println("Test Pass!...Title is matched");
		}
		else
		{
			System.out.println("Test Fail!...Title is not matched");
		}
		
		//Step 5: Close the browser
		         // close() - closes a particular window
		         // quit() - closes the entire browser
		driver.close();

	}

}
