package day6;
/*
 * 1.declare an array
 * 2.add values into array
 * find length of an array
 * 4.read single value from an array
 * 5.read multiple values from an array
 * 
 */
public class Singledimensionalarray {

	public static void main(String[] args) {
		
		//declaring array
		//Approach
		
/*		int a[]=new int[5];
		a[0] =100;
		a[1] =200;
		a[2] =300;
		a[3] =400;
		a[4] =500;
*/
		//Approach
		int a[] = {100,200,300,400,500};
		// find length of array
		System.out.println("Length of array "+a.length);
		// read single value from an array
		
		//System.out.println(a[4]);
		// read all value from an array
		// normal for loop
		
//		for(int i=0; i<=4; i++) {
//			System.out.println(a[i]);
//		}
		
//		for(int i=0; i<=a.length-1; i++) {
//			System.out.println(a[i]);
//		}
		
//		for(int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		//enhached for loop/ foe..each loop
		
		for(int x:a)
		{
			System.out.println(x);
		}
	}

}
