package day3;

public class Ternaryoperators {

	public static void main(String[] args) {
		
		// var = exp ? result1 : result2;
		int a=12, b=45;
		
		int x = (a<b)? a:b;
System.out.println(x);

//int xy  = (1==1)?100:200;
//System.out.println(xy);


int xyz  = (1==2) ? 1000 :200;
System.out.println(xyz);

int person_age = 30;
String res = (person_age<=18) ? "E" : "Not";
System.out.println(res);

	}

}
