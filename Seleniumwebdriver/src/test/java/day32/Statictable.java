package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Statictable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of row
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // multiple table

		// int row = driver.findElements(By.tagName("tr")).size(); //single table
		System.out.println("Number of rows: " + row);

		// find total number  of columns in a table
		
		
		int col = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); // multiple table
		
		//int col = driver.findElements(By.tagName("th")).size(); //single table
		System.out.println("Number of cols: " + col);
		
		
		//read data from specific row and column (ex: 5th row and 1st column)

		String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(book); //Master In Selenium
		

		String books = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println(books); //javascript
		
		
		//read data from all row and column
		
/*		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		
		String text ="";
		for(int r=2; r<=row; r++) 
		{
			
			for(int c=1; c<=col; c++) {
				String value=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				text +=  value+"\t";
			
			}
			System.out.println(text);
			text = ""; */
//			System.out.println();
	/*		
		for(int r=2; r<row; r++) {
			String authornaNE = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//System.out.println(authornaNE);
		
		if(authornaNE.equals("Mukesh")) {
			String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
			System.out.println(bookname+"\t"+authornaNE);
			} */
		
		
		//6) find total price of all the books
		
		int total = 0;
		
		for(int r=2; r<row; r++) {
			String Price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			
		 total = total+Integer.parseInt(Price);
		
		}
		
		System.out.println(total);
	}

}
