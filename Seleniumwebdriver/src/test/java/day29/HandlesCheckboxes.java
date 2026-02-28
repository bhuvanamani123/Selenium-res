package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesCheckboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
       driver.manage().window().maximize();
       
       //Select specific checkbox
       
       //driver.findElement(By.xpath("//*[@id=\"sunday\"]")).click();
      
       // 2) Select all the checkbox
       
       List <WebElement> checkbox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type = 'checkbox']"));

       
       // calculate how many check boxes there
       int totalCheckboxes = checkbox.size();
       System.out.println("Total checkboxes: " + totalCheckboxes);
       //       for(int i=0; i<checkbox.size(); i++) {
//    	   checkbox.get(i).click();
//       }
//       
       
//       for(WebElement check : checkbox) {
//    	   check.click();
//       }
//       
       
       
       // 3) Select last 3 checkboxes
       //total no of checkbox how many checkbox want to select =starting index
       //7-3 = 4 (Stating index)
//for(int i=4; i<checkbox.size(); i++) {
//	checkbox.get(i).click();
//}
       
/* 4) Select first 3 checkboxes

for(int i=0; i<3;i++) {
	checkbox.get(i).click();
}
*/
       
       //5) unselect checkboxes if they are selected
       
       for(int i=0; i<3; i++) {
    	   checkbox.get(i).click();
       }
       
       Thread.sleep(5000);

       for(int i=0; i<3; i++) {
    	   checkbox.get(i).click();
       }
       
       
       
       
       
       
       
       
       
       
	}

}
