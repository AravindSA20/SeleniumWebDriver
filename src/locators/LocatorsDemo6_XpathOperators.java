package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo6_XpathOperators {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		// xpath using tagname and attribute - //tagname[@attribute='value] -------- firstname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Shinchan"); //Class names are same but it always considers first classname
		
		//and operator - //tagname[@attribute1='value' and @attribute2='value'] -------- lastname
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Mitzi"); // Both condition should pass, so both xpath should be written correctly 
		
		//or operator - //tagname[@attribute1='value' or @attribute2='value'] --------- gmail
		driver.findElement(By.xpath("//input[@type='email' or @class='form-contr']")).sendKeys("shinchu@gmail.com"); // One condition should fail, so one xpath is trimmed
		
		//index - (//tagname[@attribute='value])[index number] -------- phone number
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("9870129931");
		
		//position -(xpath)[position()=index] ------- password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("pswd123");
		
		//using index -------- password confirmation
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("pswd123");
		
		//radio button using index
	//	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//get all radio buttons and select radio button which is not selected default
		List<WebElement> list=driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//input")); // to click yes radio btn
		for(WebElement i:list)
		{
			if(!i.isSelected()) //! used for not selected
			{
				i.click(); // to click yes  the radio btn which is not selected
				break;
			}
		}
		
		//checkbox clicking
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		
		//clicking submit button by using submit() instead of click()
		driver.findElement(By.xpath("//input[@value='Continue']")).submit();
		
	}

}
