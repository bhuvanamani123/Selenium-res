package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
//	driver.get("https://demo.nopcommerce.com/");
	driver.get("https://testautomationpractice.blogspot.com/");
	
	driver.manage().window().maximize();
	
	//isDisplayed
	
//boolean	dis=driver.findElement(By.xpath("/html/body/div[6]/header/div[2]/div[1]/a/img")).isDisplayed();
//	System.out.println(dis);
		
	// isEnabled()
	
	boolean en = driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).isEnabled();
	System.out.println(en);
	
	//is selected
		
		
	WebElement male_rd = driver.findElement(By.xpath("//*[@id=\"male\"]"));
	WebElement female_rd = driver.findElement(By.xpath("//*[@id=\"female\"]"));
		System.out.println("Before Selection.....");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("after Selection.....");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());

		
		WebElement sunday = driver.findElement(By.xpath("//*[@id=\"sunday\"]"));
		System.out.println("Before Selection.....");
		System.out.println(sunday.isSelected());
		System.out.println("after Selection.....");
		sunday.click();
		System.out.println(sunday.isSelected());
	}

}
