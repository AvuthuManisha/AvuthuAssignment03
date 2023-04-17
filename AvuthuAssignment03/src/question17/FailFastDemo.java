package question17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	public static void main(String[] args) {   
		Map<String, String> myMap = new HashMap<String, String>();   
		myMap.put("Albany", "New york");   
		myMap.put("Los Angeles", "LA");   
		myMap.put("Scarlett", "NC");   
		Iterator itr = myMap.keySet().iterator();   
		while (itr.hasNext()) {   
			System.out.println(myMap.get(itr.next()));   
			// adding an element to Map   
			// exception will be thrown on next call   
			// of next() method.   
			myMap.put("paris", "France");   
		}   
	}   
}
