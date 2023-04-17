package question22;

public class ImmutableDriver {
	public static void main(String[] args) {
		Immutable obj1 = new Immutable("Manisha", 24);
		System.out.println("Name: " + obj1.getName());
		System.out.println("Date: " + obj1.getAge());
		}
}
