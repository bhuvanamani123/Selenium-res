package day30;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleframes {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("ww");
		driver.switchTo().defaultContent();

		// frame 2
		WebElement frame2 = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@id=\"id2\"]/div/input")).sendKeys("bh");
		driver.switchTo().defaultContent();

		// frame 3

		WebElement frame3 = driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("sel");
		driver.switchTo().frame(0);
		WebElement rdbutton = driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", rdbutton);

		// driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();
		// checkbox

		// driver.findElement(By.xpath("//*[@id=\"i21\"]/div[2]")).click();

		List<WebElement> checkbox = driver.findElements(By.xpath("//div[@class=\"uHMk6b fsHoPb\"]"));
		for (int i = 0; i < checkbox.size(); i++) {

			checkbox.get(i).click();
		}

		driver.switchTo().defaultContent();

		WebElement frame4 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//*[@id=\"id5\"]/div/input")).sendKeys("ghj");
		// driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/center/a")).click();

		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/p[4]/a")).click();
		//// *[@id="logo"]/img

		boolean loog = driver.findElement(By.xpath("//*[@id=\"logo\"]/img")).isDisplayed();
		System.out.println(loog);
		driver.switchTo().defaultContent();
		
		// frame 2
				WebElement frame5 = driver.findElement(By.xpath("/html/frameset/frameset/frame[3]"));
				driver.switchTo().frame(frame5);
				driver.findElement(By.xpath("//*[@id=\"id4\"]/div/input")).sendKeys("suriya");
				driver.switchTo().defaultContent();
		

	}

}
