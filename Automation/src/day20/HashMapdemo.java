package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration
		//HashMap hm = new HashMap();
		
		HashMap map = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		//Adding pairs
		hm.put(101, "john");
		hm.put(102, "scott");
		hm.put(103, "mary");
		hm.put(104, "scott");
		hm.put(102, "David");

		System.out.println(hm);//{101 = john, 102 = david, 103 = mary, 104 = scott}
hm.remove(103);
System.out.println("After removing pair:"+hm);

//access value of the key
System.out.println(hm.get(102)); // 102 is key //david


//get all the keys from hashmap

System.out.println(hm.keySet());
System.out.println(hm.values());
System.out.println(hm.entrySet());

//reading data from hashmap
//using for ..each

for(int k:hm.keySet()) {
	
	System.out.println(k+ " "+ hm.get(k));
	
	
}
	//using Iterator

Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
	while(it.hasNext()) 
	{
		Entry<Integer,String> entry = it.next();
		System.out.println(entry.getValue()+" "+entry.getValue());
	}
		hm.clear();
		System.out.println(hm.isEmpty());
		
	}

}
