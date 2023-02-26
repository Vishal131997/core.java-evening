package do_while;

import java.util.Scanner;

public class DoWhile0 {
public static void main(String[] args) {
	int i;
	System.out.println("Eneter any Number to check condition...!");
	Scanner ref = new Scanner(System.in);
	i=ref.nextInt();
	do
	{
		System.out.print(i+ " ");
		i++;
	}
	while(i<=50);
}
}
