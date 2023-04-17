package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CSL {
	public static void main (String[] args)
	{
		List<String> myList = Collections.synchronizedList(new ArrayList<String>());

		myList.add("pranathi");
		myList.add("corri");
		myList.add("queen");

		synchronized(myList)
		{
			// must be in synchronized block
			Iterator itr = myList.iterator();

			while (itr.hasNext())
				System.out.println(itr.next());
		}
	}
}
