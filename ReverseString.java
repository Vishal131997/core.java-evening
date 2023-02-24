package all_patterns;

public class ReverseString {
	public static void main(String[] args) {

		// 1st way
		String str = "word"; //

		char chars[] = str.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}

		System.out.println();
		// 2nd way
		String strng = "word";
		String rev = "";
		int len = strng.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + strng.charAt(i);
			System.out.print(rev);
		}
		System.out.println();

		// 3rd way
		StringBuffer sb = new StringBuffer(str);
		System.out.print(sb.reverse());
	}

}
