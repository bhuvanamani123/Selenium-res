package day18;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedExeption {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Program started...");
		System.out.println("Program in progres........");
		
		FileInputStream file = new FileInputStream("C:\\Text.Txt");
Thread.sleep(5000);
Thread.sleep(5000);
Thread.sleep(5000);
		
	//	try
//		{
//			Thread.sleep(5000);
//		}
//		catch(InterruptedException e){
//			
//		}
		
		System.out.println("program finised...");
		System.out.println("program exited...");
		
		
		
		
	}

}
