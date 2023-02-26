package do_while;

import java.util.Scanner;

public class DoWhiereverse {
	public static void main(String[] args) {
		int n,r;
		System.out.println("Enter any numbers");
		Scanner ref = new Scanner(System.in);
		n=ref.nextInt();
		
		while(n>0) {
			r=n%10;
			System.out.print(r);
			n=n/10;
			System.out.println();
		}
		
		int x=1;
		do
		{
			System.out.print(x+ "");
			x++;
		}
		while(x<=10);
	}

	
}
