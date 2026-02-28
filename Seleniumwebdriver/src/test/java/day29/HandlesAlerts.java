package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Normal alrets with ok button
	/*	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Thread.sleep(3000);
	//	driver.switchTo().alert().accept();
		//or multiple
		
		Alert Myalret = driver.switchTo().alert();
		System.out.println(Myalret.getText());
		Myalret.accept();
		*/
		
		//2) confirmation Alrets - ok & cancel 
		
		/*driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept(); //close alery using ok button
		
		driver.switchTo().alert().dismiss();
		*/
		
		//3. pass the input values in alrets
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
Alert Myalrets = driver.switchTo().alert();

Myalrets.sendKeys("Welcome");

Myalrets.accept();
		
		
		
		
	}

}
