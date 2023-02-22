package page;

public class Book {
	public static void main(String[] args) {
		Book b = new Book();
		System.out.println("Before calling gc");
		b = null;
		System.gc();
		System.out.println("after calling gc");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Ready for garbaze collection");
	}

}
