package day9;

public class StringvsStringBuffervsStringBulider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s =new String("Welcome");
		s.concat("to java");
		System.out.println(s);
		*/
		
		//StringBuffer - mutable
		
//		StringBuffer s =new StringBuffer("Welcome");
//		s.append("to java");
//		System.out.println(s);

		//StringBuilder - mutable
		
				StringBuilder s =new StringBuilder("Welcome");
				s.append("to java");
				System.out.println(s);

	}

}
