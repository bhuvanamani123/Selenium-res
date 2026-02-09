package day8;

import java.util.Arrays;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Welcome";
//		String s = new String("welcome");
//		System.out.println(s);
		
		
//		length() -- returns length of a string(number of characters)
		String s ="welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat() -- joining strings
		
		String s1 = "Welcome";
		String s2 ="to java";
		String s3 ="automation";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
        System.out.println(s1+s2+s2);
        System.out.println(s1.concat(s2).concat(s3));
	
	//trim() --remove space right and left side
        s= "   welcome    ";
        
    System.out.println("Before triming : "+s.length());
	System.out.println(s);// print string along with space
	System.out.println("After triming : "+s.trim().length());
	 //chartAt() -- 
	s = "welcome";
	System.out.println(s.charAt(3)); //c
	System.out.println(s.charAt(0));
	
	//contains()  --returns true/false;
	
	System.out.println(s.contains("wel"));//true
	System.out.println(s.contains("come"));//true
	System.out.println(s.contains("Wel"));//false
	
	//equals(), equalsIgnorecase()--compare strings
	s1 ="welcome";
	s2="welcome";
	 System.out.println(s1==s2);
	 System.out.println(s1.equals(s2));
	 System.out.println(s1.equals("Welcome"));//false
	 

	 System.out.println(s1.equalsIgnoreCase("Welcome")); //true
	 
	 //replace() -replace single/multiple(sequance) of characters in a string
	 
	
	s="welcome to selenium java selenium python selenium c#";
	System.out.println(s.replace('e', 'x'));
	
	System.out.println(s.replace("selenium", "playwright"));
	
	//substring() -extract substring from the main string
	//starting index -0
	//ending index -1
	
	System.out.println(s.substring(0,3)); //wel
	
	//touppercase() toLowecase()
	s = "Welcome";
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	
	s="abc@gmail.com";
	String a[] = s.split("@");
	System.out.println(a[0]);//abc
	System.out.println(a[1]);//@gmail.com
	
	System.out.println(Arrays.toString(a));
	//ex1
	String amount ="$15,20,55";
	System.out.println(amount.replace("$", ""));
	System.out.println(amount.replace("$","").replace(",",""));
	//ex2
	s = "abc, 123@xyz";  //abc  123  xyz
	String arr1[]=s.split(",");
	System.out.println(Arrays.toString(arr1));
	
	String arr2[] = arr1[1].split("@");
	System.out.println(Arrays.toString(arr2));
	
	System.out.println(arr1[0]);
	System.out.println(arr2[0]);
	System.out.println(arr2[1]);
	
	//ex3
	s ="abc 123 xyz";
	String ar[]=s.split(" ");
	System.out.println(Arrays.toString(ar));
	
	// * % ^ & () --you cannot use as delimeters
	
	//ex4 
	String name = "John kenedy";
	//System.out.println(name.contains("john")); //false
	
	System.out.println(name.replace('J', 'j').contains("john"));
	System.out.println(name.toLowerCase().contains("john"));
	}

}
