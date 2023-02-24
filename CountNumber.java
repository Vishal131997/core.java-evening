package all_patterns;

public class CountNumber {

	public static void main(String[] args) {

		String name = "Hello Boss I I am in Xworkz Boss ";

		String[] name1 = name.split(" ");

		int a = name1.length;
		System.out.println(name1.length);
		System.out.println(a);

		for (int i = 0; i < name1.length; i++) {
			int count = 0;

			for (int j = 0; j < name1.length; j++) {
				if (name1[i].equals(name1[j])) {
					count++;
				}
			}
			System.out.println(name1[i] + " " + count);
		}
		
		

	}

}
//Question----- count the number of Occurrence in given string/sentence and 