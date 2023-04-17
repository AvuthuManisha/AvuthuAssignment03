package question23;

public class Person {
	public static void main(String[] args) {
		String name = "Minnie";
		name.concat("Mickey");
		System.out.println("name : " +name);
		Thread th = new Thread(new Runnable() {
			public void run() {
				name.concat("Mouse");
				System.out.println("Thread: " +name);
			}
		});
		Thread t = new Thread(new Runnable() {
			public void run() {
				name.concat("Happy");
				System.out.println("Thread1 : " +name);
			}
		});
		th.start();
		t.start();
	}
}
