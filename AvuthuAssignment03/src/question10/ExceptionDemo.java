package question10;

public class ExceptionDemo {
	public void sampleMethod() {
		System.out.println("Subclass method");
	}
	public static void main(String[] args) {
		ExceptionDemo obj = new ExceptionDemo();
		obj.sampleMethod();
	}


}
