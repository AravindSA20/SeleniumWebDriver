package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo8_XpathAxies {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://automationplayground.com/crm/customers.html?email-name=test123%40gmail.com&password-name=test12&submit-name=");
	
	//To get the ancestor of John , //tagname[@attribute='value']//ancestor::ancestor tagname
	System.out.println("----To get the ancestor of John-----");
	WebElement ele1=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody"));
	System.out.println(ele1.getText());
	
	//To get the parent of John , //tagname[@attribute='value']//parent::parent tagname
    System.out.println("----To get the Parent of John-----");
	WebElement ele2=driver.findElement(By.xpath("//td[text()='John']//parent::tr"));
	System.out.println(ele2.getText());
	
	//To get the child of row 4 , //tagname[@attribute='value']//child::child tagname
    System.out.println("----To get the Child for row 4-----");
    List<WebElement> ele3=driver.findElements(By.xpath("(//tbody//tr)[4]//child::td"));
    System.out.println("Total number of Child elements are: "+ele3.size());
	for(WebElement i:ele3)
	{
		System.out.println(i.getText()); //Fifth element wont be printed because it has no text
	}
    
	//To get all the preceding(previous) elements of John , //tagname[@attribute='value']//preceding::preceding tagname
    System.out.println("----To get all the preceding elements of John-----");
    List<WebElement> ele4=driver.findElements(By.xpath("//td[text()='John']//preceding::td"));
    System.out.println("Total elements previous of John: "+ele4.size());
    for(WebElement i:ele4)
    {
    	System.out.println(i.getText());
    }
    
   //To get all the preceding(previous) sibling of John , //tagname[@attribute='value']//preceding-sibling::preceding tagname
    System.out.println("----To the preceding sibling of John-----");
    WebElement ele5=driver.findElement(By.xpath("//td[text()='John']/preceding-sibling::td"));
    System.out.println(ele5.getText());
    
    //To get all the following elements of John , //tagname[@attribute='value']//following::following tagname
    System.out.println("----To get all the Following elements of John-----");
    List<WebElement> ele6=driver.findElements(By.xpath("//td[text()='John']//following::td"));
    System.out.println("Total elements following John: "+ele6.size());
    for(WebElement i:ele6)
    {
    	System.out.println(i.getText());
    }
    
    //To get all the following sibling of John , //tagname[@attribute='value']//following-sibling::following tagname
    System.out.println("----To get the Following sibling of John-----");
    List<WebElement> ele7=driver.findElements(By.xpath("//td[text()='John']/following-sibling::td")); //To get a particular sibling , we can use index value
    System.out.println("Total number of following sibling of John are: "+ele7.size());
    for(WebElement i:ele7)
    {
    	System.out.println(i.getText());
    }
    
    
	Thread.sleep(5000);
	driver.close();
}
}
