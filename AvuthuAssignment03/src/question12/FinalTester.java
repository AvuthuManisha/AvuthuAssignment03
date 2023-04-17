package question12;

public class FinalTester {
	final int value = 10;

	// The following are examples of declaring constants:
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
	public void changeValue() {
//		value = 12; // will give an error
	}
	public void displayValue(){
		System.out.println(value);
	}
	public static void main(String[] args) {
		FinalTester t = new FinalTester();
		t.changeValue();
		t.displayValue();
	}


}
