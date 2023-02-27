package all_patterns;

public class ReverseString1 {
	public static void main(String[] args) {

		int l, i;
		String r = "MAD";
		String r2 = "";
		l = r.length(); // l=3

		for (i = l - 1; i >= 0; i--) { // i=2
			r2 = r2 + r.charAt(i);
		}
		System.out.println(r2);
	}

}
