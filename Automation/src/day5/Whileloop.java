package day5;

public class Whileloop {

	public static void main(String[] args) {
		//Example1: print 1.....10 numbers
		
//		int i=1; // initilization
//while(i<=10)   //condition.
//{
//	System.out.println(i);
//	i++;  //inc..
//}
	
		
		//Example2: print hello message 10 times
		
//		int i=1;
//		while(i<=10) {
//			System.out.println("Hello");
//			
//			i++;
//		}
		
		//Example2: print even number between 1...10
		
//		
//		int i=2;
//		while(i<=10){
//			System.out.println(i);
//			i+=2;
		
		
		
		//Appraoch 2
//		
//		int i = 1;
//		while(i<=10) {
//			if(i%2==0)
//			{
//				System.out.println(i);
//				i++;
//			}
//			
//		}
		
		
		//Example4: 1..........10
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i+"Even");
			}else {
				System.out.println(i+"odd");
			}
			i++;
		}
		
		
	}

}
