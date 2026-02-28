package day28;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();
Set	<String> windowIDs = driver.getWindowHandles();
	



for(String wind:windowIDs ) {
	String title = driver.switchTo().window(wind).getTitle();
	System.out.println(title);
	
	if(title.equals("OrangeHRM") || title.equals("some")){
		
		
		driver.close();
	}
	
}
/*
//Appoach1
List <String> windowList = new ArrayList(windowIDs);
String ParentID = windowList.get(0);
String ChildID = windowList.get(1);



//Switch to child window
driver.switchTo().window(ChildID);
System.out.println(driver.getTitle());


//Switch to Parent window
driver.switchTo().window(ParentID);
System.out.println(driver.getTitle());


*/

//Appoach2

//for(String winId : windowIDs) {
//	String title = driver.switchTo().window(winId).getTitle();
//	if(title.equals("OrangeHRM"))
//	{
//		System.out.println(driver.getCurrentUrl());
//	}
//	else
//	{
//		System.out.println(driver.getCurrentUrl());
//	}
//	
//}



	}

}
