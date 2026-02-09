package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.get("https://www.w3schools.com/");
		driver.get("https://elementalselenium.com/tips");
		driver.manage().window().minimize();
		
		//Xpath with single attribute.
		
		//driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[7]")).click();
		
		// xpath with text()
		driver.findElement(By.xpath("//*[text()='72 - How To Run Your Tests Headlessly with Chrome']")).click();
		
		
		
		
	}

}
