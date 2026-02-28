package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// get() --open the url on the brower

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// getTitle() -- returns title of page
//
//		System.out.println(driver.getTitle());
//
////getcurrents() -- returns url of page	
//
//		System.out.println(driver.getCurrentUrl());
//
////getpageSource() - returns soucepage of page	
//		System.out.println(driver.getPageSource());

//getHandle() - returns id of the single Brower 
		String windowid = driver.getWindowHandle();

		System.out.println("Window ID: " + windowid); //BBC892B43A2C6344980156D3E5BC1A67
//56D135B6A24C66187A6B6F105AF0B1B6
		
		//getHandles() - returns id of the single Browser 
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowids = driver.getWindowHandles(); 
		System.out.println(windowids);
	}

}
