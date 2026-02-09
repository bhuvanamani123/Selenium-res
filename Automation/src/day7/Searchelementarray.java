package day7;

public class Searchelementarray {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,50, 50};
		int search_element=130;
		
		boolean status =false;
		
/*		for(int i=0; i<a.length; i++) {
			if (a[i] == search_element)
			{
				System.out.println("Element found");
				status = true;
				break;
			}
			}
	*/
		// nested for loop
		for(int x:a) {
			if(x==search_element) {
				System.out.println("element found");
				status=true;
				break;
			}
		}
		
		if(status==false ) {
			System.out.println("Element not fount");
		}
	}

}
