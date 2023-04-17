package question13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]){    
		//creating arraylist         
		List arrayList = new ArrayList(); 

		//adding object in arraylist 
		arrayList.add("Maggie");   
		arrayList.add("Samy");    
		arrayList.add("Pinky");    
		arrayList.add("Hency");    

		//traversing elements using Iterator  
		Iterator itr=arrayList.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}    
	}    


}
