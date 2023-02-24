package all_patterns;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int x;
		int count = 0;

		Scanner sc = new Scanner(System.in);
				x=sc.nextInt();
		for(int i=0; i<x; i++) {
			if(x%i==0 ) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is Prime Number");
			System.out.println(x);
		}
		else {
			System.out.println("Given number is not Prime Number..!");
		}

	}
}
