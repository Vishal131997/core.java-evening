package all_patterns;

import java.util.Scanner;

public class EvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a Number");
		a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Given number is Even..!");
		} else {
			System.out.println("Given number is Odd..!");
		}
		
	}

}
