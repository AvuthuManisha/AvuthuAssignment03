package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class Student {
	public static void main(String args[])
	{
		//----------hashtable -------------------------
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		ht.put(101," ankitha");
		ht.put(101,"Vyshu");
		ht.put(102,"Rana");
		ht.put(103,"Rahul");
		System.out.println("-------------Hash table--------------");
		for (Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

		//----------------hashmap--------------------------------
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Amrutha");
		hm.put(104,"Ahem"); 
		hm.put(101,"Vinay");
		hm.put(102,"Rahul");
		System.out.println("-----------Hash map-----------");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
}
