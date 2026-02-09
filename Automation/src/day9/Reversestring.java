package day9;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach  --length(),chartAt()
		String s ="Welcome";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev =rev+s.charAt(i);
		}
 System.out.println("Reverse string is:"+rev);
 
//Approach -2 without using string methods
 String sa ="Welcome";
 String revs = "";
 
 char a[] = sa.toCharArray();
 for(int i= a.length-1; i>=0; i--)
 {
	
	 revs = revs+a[i];
 }
 System.out.println("reverse String: "+revs);

// Approach: 3 using String Buffer class 
 StringBuffer saa = new StringBuffer("Welcome");
 System.out.println("Reverse String is: "+saa.reverse());
	
	
	//Approach: 4 using String Builder class 
 StringBuilder saas = new StringBuilder("Welcome");
 System.out.println("Reverse String is: "+saas.reverse());
	}
}
