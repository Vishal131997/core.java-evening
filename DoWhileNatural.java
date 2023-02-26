package do_while;

import java.util.Scanner;

public class DoWhileNatural {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter Number");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		do
		{
			System.out.print(n+ " ");
			n++;
		}
		while(n<=10);
	}

}
