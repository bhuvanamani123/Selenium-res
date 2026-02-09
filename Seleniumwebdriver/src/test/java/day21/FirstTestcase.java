package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Test case
 * --------
 * 1) Launch browser (Chrome)
 * 2) open url https://demo.opencart.com/
 * 3)validate title should be "your store"
 * 4)close browser
 * 
 * 
 * 
 */


public class FirstTestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	1) Launch browser (Chrome)
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		//2) open url https://demo.openchat.com/
		
		 //driver.get("https://example.com/");
		 driver.get("https://example.com/");
		// 3)validate title should be "your store"
		 
		String act_title = driver.getTitle();
		if(act_title.equals("Example Domain")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4)close browser
		//driver.close();
	}

}
