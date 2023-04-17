package question09;

import java.io.File;
import java.util.Scanner;

public class TryResourceDemo {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(new File("sample.txt")); ) {
		while (sc.hasNext()) {
		System.out.println(sc.nextLine());
		}
		} catch (Exception e){
		System.out.println("FilenotFound Exception is thrown" + e);
		}
		}


}
