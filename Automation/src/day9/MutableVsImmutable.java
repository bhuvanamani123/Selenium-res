package day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mutable.
		int a[] = {40,60,10,30,80};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		// immutable
		String s =new String("Welcome");
		s.concat("to java");
		// its possible but we can create new variable
			//String con = s.concat("to java");
	System.out.println(s); // welcome ---> immutable - we cannot change. 
	//System.out.println(con);
	
	}

}
