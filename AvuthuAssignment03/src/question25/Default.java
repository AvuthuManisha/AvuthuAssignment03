package question25;

public interface Default {
	public default void say(){ 
		System.out.println("Hello, this is default method"); 
		}
		// Abstract method 
		public void sayMore(String msg); 
}

