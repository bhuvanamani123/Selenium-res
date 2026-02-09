package day17;

public class DataconversationMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String --> int

		// String s = "Welcome";// cannot convert to int
//		
//		String s = "123456" ;
//		int sint = Integer.parseInt(s);
//		
//		String s1 = "10" ;
//		String s2 = "20";
//		
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

		// String -->double
//		String s1 = "10.5";
//		String s2 ="20.0";
//		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
//		

//		String s ="True";  //othet than true,. if you pass any string that will return false...
//		System.out.println(Boolean.parseBoolean(s));
//		
		// int,double,bool,char -->string

		int a = 100;
		double d = 10.5;
		char c = 'A';
		boolean bool = true;

		String s = String.valueOf(a);
		System.out.println(s);
		s = String.valueOf(a);
		System.out.println();
	}

}
