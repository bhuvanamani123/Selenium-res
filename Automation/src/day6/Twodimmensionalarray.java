package day6;
/*
 * 1.declare an array
 * 2.add values into array
 * find length of an array
 * 4.read single value from an array
 * 5.read multiple values from an array
 * 
 */
public class Twodimmensionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaraing array
		
		//Approach
		/*int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] =300;
		a[1][1] = 400;
		
		a[2][0] = 500;
		a[2][1] =600;
	*/
		
		// Approach2
		int a[][]= {
				{100,200, 5001},
				{300, 400,500},
				{500,600, 3000}
		};
		//find a length of an array
		
//		System.out.println("length of array "+ a.length);
//		System.out.println("length of column" +a[0].length);
//		// read single value from an array
//		System.out.println(a[2][1]);
//		System.out.println(a[0][2]);
		
		
		// normal for
//		
//		for(int r=0; r<a.length; r++) {
//			for(int c=0; c<a[r].length; c++){
//				System.out.println(a[r][c] +" ");
//			}
//			System.out.println();
//		}
		
		for(int arr[] :a) {
			for(int x:arr) {
				System.out.println(x);
			}
			System.out.println();
			}
		}
		
	}

