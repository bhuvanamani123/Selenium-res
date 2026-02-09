package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_classes.asp");

//		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("my-text")).sendKeys("Mac");
		
		
		// id
//		boolean textDisplaystatus = driver.findElement(By.id("my-text-id")).isDisplayed();
//		System.out.println(textDisplaystatus);
		
	// LINKTEXT & PARTIAL LINK TESXT
		//driver.findElement(By.linkText("Return to index")).click();		
				
		//this is one not refer
		
		//driver.findElement(By.partialLinkText("Return")).click();
		
		
//List <WebElement>	headerLinks = driver.findElements(By.className("ga-nav"));
//System.out.println("Total number"+headerLinks.size());
		
		//tag name
		
//		List <WebElement>	Links= driver.findElements(By.tagName("a"));
//		System.out.println("Total number Links: "+Links.size());
	
// img
	
		List <WebElement>	images= driver.findElements(By.tagName("img"));
		System.out.println("Total number images: "+images.size());
		
	}

}
 