package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://demo.nopcommerce.com/

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");

		driver.manage().window().maximize();
		
		
		// tag id  tag#id
		
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");	
		
		// tag class tag.classname
		//search-box-text ui-autocomplete-input
		
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Mobile");
		//tag attribute tag[attribute="Value"]
		
		
				//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("Mobile");	
		//tag class attribute
		
		driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("Mobile");
		
				
	}

}
