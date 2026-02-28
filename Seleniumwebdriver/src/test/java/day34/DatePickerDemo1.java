package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {

	static void selectmonthAndyear(WebDriver driver,String month, String year) throws InterruptedException {

		//Select month & year
		while(true) {
			String CurrentMonth = 	driver.findElement(By.xpath("//div//span[@class='ui-datepicker-month']")).getText();
			String Currentyear	= driver.findElement(By.xpath("//div//span[@class='ui-datepicker-year']")).getText();
			
			if(CurrentMonth.equals(month) && Currentyear.equals(year)) {
				
				break;
				}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //perioves	
	}
	}	
		
		//Select date
		
		static void selectDate(  WebDriver driver, String date) throws InterruptedException {
			List<WebElement> alldates = driver
					.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
//System.out.println(alldates);
			for (WebElement dt : alldates) {
				//System.out.println(dt.getText()+"tredf");
				//Thread.sleep(5000);
				if (dt.getText().equals(date)) {
					//System.out.println("rt"+dt.getText());
					dt.click();
				break;
			}
		}
		
		}
		

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// switch to frame

		driver.switchTo().frame(0);

		// method1 : using sendkeys()
		// driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/11/2026");
		// //mm//dd//yyyy.

		// method1 : using click()

		String year = "2026";
		String month = "April";
		String date = "10";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // open date picker
		
		
		selectmonthAndyear(driver, month, year);
		selectDate(driver, date);
		

		

	}

}


