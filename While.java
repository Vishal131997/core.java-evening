package while_loop;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter value for condition");
		Scanner ref = new Scanner(System.in);
		n = ref.nextInt();
		while (n >= 10) {
			System.out.println("I am Vishal");
		}
	}
}
