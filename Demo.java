package all_patterns;

public class Demo {
	
	public static void main(String[] args) {
		Demo d = new Demo();

		d = null;
		System.gc();

	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Ready for garbaze collection");
	}


}
