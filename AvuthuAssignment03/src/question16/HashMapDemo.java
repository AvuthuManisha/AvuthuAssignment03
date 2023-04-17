package question16;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String args[]) {
		Map<String,String> myMap = new HashMap<String,String>();
		myMap.put("Manisha", "M");
		myMap.put("Dattu", "D");
		myMap.put("Vyshu", "V");
		myMap.put("Sweety", null);
		myMap.put(null, null);
		myMap.put(null, "Annu");
		System.out.println("Elements in Hashtable are:\n" + myMap.entrySet());
		System.out.println(myMap.get("Dattu"));
		System.out.println(myMap.get("Annu"));
	}
}


