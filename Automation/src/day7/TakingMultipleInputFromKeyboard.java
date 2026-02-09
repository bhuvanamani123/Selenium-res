package day7;

import java.util.Scanner;

public class TakingMultipleInputFromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter First number: ");
//		int num1 =sc.nextInt();
//		
//		System.out.println("Enter Second number: ");
//		int num2 =sc.nextInt();
//		
//		System.out.println("Addition of two number: " +(num1+num2));
//		

		System.out.println("Enter your name: ");
		String name =sc.next();
		System.out.println(name);
		
		System.out.println("Enter your age: ");
		int age =sc.nextInt();
		System.out.println(age);
		
		System.out.println("Enter unknown: ");
		Object  unknown =sc.next();
		System.out.println(unknown);
		
		
	}

}
