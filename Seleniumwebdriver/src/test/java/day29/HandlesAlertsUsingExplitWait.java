package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlesAlertsUsingExplitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.manage().window().maximize();
		
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
		
		Alert Myalret = mywait.until(ExpectedConditions.alertIsPresent()); //caputre alret
		
	//	driver.switchTo().alert().accept();
		//or multiple
		
		
		System.out.println(Myalret.getText());
		Myalret.accept();
		
		
	
	}

}
