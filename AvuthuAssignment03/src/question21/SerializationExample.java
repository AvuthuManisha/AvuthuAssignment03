package question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) {
		// Create an object of a serializable class
		Person person = new Person("John", 30);
		// Serialize the object to a byte stream
		try {
			FileOutputStream fileOut = new FileOutputStream("person.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(person);
			out.close();
			fileOut.close();
			System.out.println("Object serialized and saved to person.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Deserialize the byte stream back into an object
		try {
			FileInputStream fileIn = new FileInputStream("person.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			Person deserializedPerson = (Person) in.readObject();
			in.close();
			fileIn.close();
			System.out.println("Object deserialized from person.ser");
			System.out.println("Name: " + deserializedPerson.getName());
			System.out.println("Age: " + deserializedPerson.getAge());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
