package do_while;

public class NaturalNumbers {
	public static void main(String[] args) {
		int i = 1, x = 1, a = 5, y=1;
		do {
			System.out.print(i + " ");
			i++;
		} while (i <= 10);

		System.out.println("\n" + "Adding one more value");
		do {
			System.out.print(x + " ");
			x++;
		} while (x <= 20);

		do {
			System.out.print(a);
			
			a++;
		} while (a <= 10);
		
		do
		{
			System.out.print(y);
			y++;
		}
		while(y<=10);

	}
}
