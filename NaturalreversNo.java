package do_while;

import java.util.Scanner;

public class NaturalreversNo {
	public static void main(String[] args) {
		int n, r;
		System.out.println("Enter any  Number ");
		Scanner ref =new Scanner (System.in);
		n=ref.nextInt();
		while(n>0)
		{
			r= n % 10;
			System.out.println("Reverse Order"+ ref);
			n=n/10;
		}
	}

}
