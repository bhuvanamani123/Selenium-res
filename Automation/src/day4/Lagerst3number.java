package day4;


/*
 * a>b & a>c  --a is largest
 * b>a & b>c  --b is largest
 * c>a & c>b  --c is largest
 * 
 */
public class Lagerst3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//largest of 3 numbers;
		
int  a=10, b=20, c=30;

if(a>b && a>c) {
	System.out.println("a is largest");
	
}else if(b>a && b>c) {
	System.out.println("b is largest");
}
else {
	System.out.println("c is largest");
}



	}

}
