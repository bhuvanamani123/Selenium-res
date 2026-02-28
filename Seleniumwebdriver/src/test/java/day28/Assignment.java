package day28;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://testautomationpractice.blogspot.com/");

//provide some string search for it
driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

//Count number of link

List <WebElement> links = driver.findElements(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-results\"]//a"));
System.out.println("TOtal number of link "+ links.size());


// Click each link

for(WebElement link : links) {
	
	link.click();
}

//get window id's for every browser window
String parentWindow = driver.getWindowHandle();
Set	<String> windowIDs = driver.getWindowHandles();
for(String windids : windowIDs) {
	if(!windids.equals(parentWindow)) {
		driver.switchTo().window(windids);
		System.out.println("Title: " + driver.getTitle());
		System.out.println("URL: "+ driver.getCurrentUrl());
		driver.close();
	}
	
}
driver.switchTo().window(parentWindow);


	}
	
	

}
