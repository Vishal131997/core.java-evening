package while_loop;

import java.util.Scanner;

public class While00 {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter any Value");
		Scanner ref = new Scanner(System.in);
		i=ref.nextInt();
		while(i<=10) {
			System.out.println("Hello Java...!");
			i++;
		}
	}

}
