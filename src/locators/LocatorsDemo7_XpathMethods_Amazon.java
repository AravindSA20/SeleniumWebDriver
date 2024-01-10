package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo7_XpathMethods_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//text() method for Mobiles ----> //tagname[text()='visible text']
		driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
		System.out.println("BestSellers Title: "+driver.getTitle());
		
		WebElement ele=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]"));
		System.out.println("Text of the Page count is : "+ele.getText());
		
		//BestSellers ---> Cart  ---- To avoid any spaces normalize-space() method is used --//tagname[normalize-space()='value']
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		//Message displayed on Cart page
		WebElement msg=driver.findElement(By.xpath("//div[normalize-space()='Your Amazon Cart is empty']"));
		System.out.println("Message displayed on Cart page is: "+msg.getText());
		
		//Using contains() - Cart page --> SearchBox --> Bags   ----  //tagname[contains(text(),'text)]
		WebElement search=driver.findElement(By.xpath("//input[contains(@id,'search')]"));
		search.click();
		search.sendKeys("Bags",Keys.ENTER);
		
		//Using starts-with(prefix) ---> validate prefix value --> //tagname[starts-with(@attribute,'value')]
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabs'")).clear(); //To clear the searchbox
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@id,'twotabs'")).sendKeys("Nike Shoe",Keys.ENTER); //To search Nike shoes in SearchBox
	}

}
