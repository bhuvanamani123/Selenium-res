package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declaration
		ArrayList myList = new ArrayList();
//List myList = new ArrayList();
		// ArrayList<string> myList = new arrayList<string>();
		// Adding data into arratList

		myList.add(100);
		myList.add(10.5);
		myList.add("Welcome");
		myList.add('A');
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);

		// size of arrayList
		System.out.println("size of an arraylist:" + myList.size());

		System.out.println(myList);

		myList.remove(5);
		System.out.println(myList);
		myList.add(2,"java");
		System.out.println(myList);

		myList.set(2,"Python");
		System.out.println(myList);
		
		myList.get(3);
		System.out.println(myList);
		
		//Reading all the elements from arrayList
		//using normal for loop
		
		
//		for(int i=0; i<myList.size();i++) {
//			System.out.println(myList.get(i));
//		}
		
		//using for..each loop
//		for(Object x: myList) {
//			System.out.println(x);
//		}
		
		//using iterator
		Iterator<Object> it = myList.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}

		System.out.println(myList.isEmpty()); // false (if it had elements)

		ArrayList myList2  = new ArrayList();
		myList.add(100);
		myList2.add("welcome");
		
		myList.removeAll(myList2);
		System.out.println("After removing multiple value"+myList);
		

		
		
	}

}
