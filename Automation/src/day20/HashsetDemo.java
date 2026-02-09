package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DEclaration
		//Set myset = new Set();
		
		HashSet myset = new HashSet();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add('A');
		myset.add(true);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);
		//Remove
		
		myset.remove(10.5);
		System.out.println(myset);
		
		//Inseting element - not Possible
		//Convert Hashset -->arryList
		
		ArrayList al = new ArrayList();
		System.out.println(al);
		System.out.println(al.get(2));
		
//		for(Object x:myset) {
//			System.out.println(x);
//		}
//		
		
		//using iterstor
		Iterator<Object> it = myset.iterator();
		while (it.hasNext()) {
		    System.out.println(it.next());
		}

	}

}
