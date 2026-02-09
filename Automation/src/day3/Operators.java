package day3;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Arithmetic operators  + - * / %;
		
		int a =10, b =100;
		System.out.println("the sum of :" +(a+b));
		System.out.println("the sum of :" +(a-b));
		System.out.println("the sum of :" +(a/b));
		System.out.println("the sum of :" +(a*b));
		System.out.println("the sum of :" +(a%b));
		
		// Relation/ comparison operators > >= < <= != ==
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		// Logical Operators && || !
		boolean ay= true;
		boolean ax= false;
		
		System.out.println(ay&ax);
		System.out.println(ay|ax);
		System.out.println(!ay);
		System.out.println(!ax);
		
		boolean b1 = 10>20;
		System.out.println(b1);
		
		boolean b2 = 30>20;
		System.out.println(b2);
		
		System.out.println(b1&b2);
		System.out.println(b1|b2);
		
		System.out.println((10<20) && (20>10));  // true
		
	}

}
