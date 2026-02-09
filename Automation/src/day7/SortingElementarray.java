package day7;

import java.util.Arrays;

public class SortingElementarray {

	public static void main(String[] args) {
		int a[] = {100,500,800,600,400,200,300,500};
		System.out.println("Before tstoring array "+ a);
		System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        
        System.out.println("after storing array "+ a);
		System.out.println(Arrays.toString(a));
		
	}

}
