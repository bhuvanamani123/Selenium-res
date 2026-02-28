package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.htmlelements.com/demos/dropdownlist/checkboxes/");
        driver.manage().window().maximize();

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total frames: " + frames.size());

        // Switch to correct iframe
        driver.switchTo().frame(1);

        // Click dropdown
       driver.findElement(By.cssSelector("smart-drop-down-list")).click();
      
        //select single option
        //driver.findElement(By.xpath("/html/body/smart-drop-down-list/div[1]/div/div[2]/smart-list-box/div[1]/div[2]/div[2]/smart-list-item[2]")).click();
       List<WebElement> allOptions = driver.findElements(
               By.xpath("//smart-list-item")
       );

       System.out.println("Total options: " + allOptions.size());

       
//       for(int i=1; i<allOptions.size(); i++) {
//    	   allOptions.get(i).click();
//       }
       
       // Click all options
//       for (WebElement option : allOptions) {
//    	  
//           option.click();
//       }
//      
       WebElement scrollPanel = driver.findElement(By.cssSelector(".smart-list-box"));
       JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll to bottom slowly
    js.executeScript(
        "arguments[0].scrollTop = arguments[0].scrollHeight",
        scrollPanel
    );
       
       
      // 4. select multiple option
       
       for (WebElement option : allOptions) {
     	  
    	   String op = option.getText();
    	   System.out.println(op);
    	   
    	   if(op.equals("Eiskaffee") || op.equals("Espresso")|| op.equals("Iced Coffee﻿")) {
    		  
    		   option.click();
    	   }
           
        }
           
       
       
    }
}