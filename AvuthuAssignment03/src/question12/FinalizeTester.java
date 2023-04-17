package question12;

public class FinalizeTester {
	public void finalize() throws Throwable{
		System.out.println("Object garbage collected.");
	}
	public static void main(String[] args) {

		FinalizeTester test = new FinalizeTester();
		test = null;
		System.gc();
	}


}
