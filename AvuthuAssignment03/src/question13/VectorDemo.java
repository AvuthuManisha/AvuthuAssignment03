package question13;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]){      
		Vector vector=new Vector();//creating vector  

		// adding object in vector
		// using the add() method

		vector.add("Swe");

		// adding object in vector
		// using the addElement() method
		vector.addElement("Pop"); 
		vector.addElement("John");
		vector.addElement("Andrew");

		//traversing elements using Enumeration  
		Enumeration enm=vector.elements();  
		while(enm.hasMoreElements()){  
			System.out.println(enm.nextElement());  
		}
	}
}


