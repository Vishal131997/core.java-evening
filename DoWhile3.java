package do_while;

import java.util.Scanner;

public class DoWhile3 {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter Any value");
		Scanner ref = new Scanner(System.in);
		i=ref.nextInt();
		do
		{
			System.out.print(i + " ");
			i++;
		}
		while(i<=100);
		
	}

}
