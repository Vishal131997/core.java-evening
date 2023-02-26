package for_loop;

public class ForA {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
	}

}
