package question18;

public class ThreadDemo {
	public static void main(String args[]){
		//creating thread.
		Test t = new Test();
 
		//start the thread.
		t.start();
 
		//again start the thread which is already started.
		//IllegalThreadStateException here.
		t.start();
	}
}
