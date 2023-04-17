package question25;

public class DefaultMethod implements Default {
	@Override
	public void sayMore(String msg) {
	System.out.println(msg); 
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	DefaultMethod dm1 = new DefaultMethod(); 
	dm1.say(); // calling default method 
	dm1.sayMore("Assignment 03 for practice work"); // calling abstract method 
	} 
}
