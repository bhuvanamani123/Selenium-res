package day18;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		try {
		System.out.println(100 / num); // ArithmaticExecption
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid data");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");

	}

}
