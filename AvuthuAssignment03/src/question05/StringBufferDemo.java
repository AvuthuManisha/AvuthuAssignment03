package question05;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("Demo");
		System.out.println(a.toString());
		//updating the string
		a.append(" to StringBuffer");
		System.out.println(a.toString());
		}


}
