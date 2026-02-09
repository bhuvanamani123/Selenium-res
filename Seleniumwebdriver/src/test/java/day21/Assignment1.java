package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demo.nopcommerce.com/");
		 String title = driver.getTitle();
		 if(title.equals("nopCommerce demo store. Home page title")) {
			 System.out.println("Test Passed");
			 
			 
		 }
		 else {
			 System.out.println("Test Failed");
		 }

	}

}
