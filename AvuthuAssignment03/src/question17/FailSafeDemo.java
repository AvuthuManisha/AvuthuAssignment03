package question17;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
	public static void main(String args[])   
	{   
		CopyOnWriteArrayList<Integer> myList = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });   
		Iterator itr = myList.iterator();   
		while (itr.hasNext()) {   
			Integer i = (Integer)itr.next();   
			System.out.println(i);   
			if (i == 7)   
				myList.add(15); // It will not be printed  
				//This means it has created a separate copy of the collection  
		}   
	}  
}
