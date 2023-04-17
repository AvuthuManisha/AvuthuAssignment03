package question25;

public class FunctionalInterface implements FunctionalInterfaceDemo  {
	public void say(String msg){ 
		System.out.println(msg); 
		} 
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface fi = new FunctionalInterface(); 
		fi.say("Hello Hi"); 
		}


}
