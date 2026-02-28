package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement drpcountryele = driver.findElement(By.xpath("//*[@id=\"country\"]"));
		Select drpcountry = new Select(drpcountryele);
		//drpcountry.selectByVisibleText("India");
		//drpcountry.selectByValue("france");	
		//drpcountry.selectByIndex(2);
		
		//capture the option from the dropdown
		List<WebElement> option = drpcountry.getOptions();
		System.out.println(option.size());
		
		
		//printing the all option 
	/*0	for(int i=0; i<option.size(); i++ ) {
			System.out.println(option.get(i).getText());
		}
		*/
		for(WebElement options:option) {
			System.out.println(options.getText());
		}
		
	}

}
