package Assignmentworks;

public class Day6evenandoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//find even and odd number from array
		int a[] = {1,2,3,4,5,6};
		int evencount =0;
		int oddcount = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				evencount++;
		}else
		{
			oddcount++;
		}
			
	}
		System.out.println(evencount +  " Even");
		System.out.println(oddcount +   " Odd");
	}
}
