package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo3x.opencartreports.com/admin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-username\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("demo");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
driver.findElement(By.xpath("//*[@id=\"menu-sale\"]/a")).click();
driver.findElement(By.xpath("//*[@id=\"collapse4\"]/li[1]/a")).click();
		
String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div[2]/div/div[2]/div/div[2]")).getText();
int total_integer = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));

		

//repeating pages

for(int p=1; p<=total_integer; p++) {
	
	if(p>1) {
	WebElement active_page	=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
	active_page.click();
	}
	
	//reading data from data..
int	noofrows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
	for(int r=1; r<noofrows; r++) {
String 	customerName =driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
	 
String email = 	 driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();

String status = 	 driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[5]")).getText();
System.out.println(customerName+"\t"+email+"\t"+status);

	 
	 
	 
	}
	
	
}









	}

}
