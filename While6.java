package while_loop;

import java.util.Scanner;

public class While6 {
	public static void main(String[] args) {
		int n=0;
		System.out.println("Enter Any value");
		Scanner ref = new Scanner(System.in);
		n = ref.nextInt();
		while (n <= 10) {
			System.out.println("Hello Bhai");
			++n;
		}
	}
}
