package day9;

public class StringComparsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sc1
	/*	String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true

*/
		
		//case2
		/*String s1 = new String("Welcome");
		String s2 = new String("Welcome");
		System.out.println(s1); 
		System.out.println(s2);
		
		System.out.println(s1==s2);//false //to compare the objects
		System.out.println(s1.equals(s2));//true   //to compare value of  objects
		*/
		//case 3
		/*String s1 ="abc";
		String s2 = new String("abc");
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //false
		*/
		
		//case 4
		String s1 ="abc";
		String s2 = new String("abc");
		String s3 =s2;
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		System.out.println(s2==s3); //true
		System.out.println(s2.equals(s3));//true
		
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
		
	}

}
