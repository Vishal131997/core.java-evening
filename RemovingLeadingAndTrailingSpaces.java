package all_patterns;

public class RemovingLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		// 1st way
		removeSpaces("   Vishal    ");

	}

	public static void removeSpaces(String s) {
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				System.out.print(c);
			}
		}
	}

}

/*
 * //2nd way 
 * String str = "   Vishal CB   ";
 * 
 * System.out.println("Before Removing Spaces : "+ str);
 * System.out.println("After. Removing Spaces : "+ str.trim());
 */
