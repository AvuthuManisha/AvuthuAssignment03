package question24;

public class Garbage {
	protected void finalize() throws Throwable{
		System.out.println("Finalize called,hence garbage collector triggered");
	}
	public static void main(String[] args) {
		Garbage t = new Garbage();
		System.out.println("Calling garbage collector before making null");
		System.gc();
		t = null;
		System.out.println("Calling garbage collector after making null");
		System.gc();
	}
}
