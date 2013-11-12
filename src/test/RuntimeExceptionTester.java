package test;

public class RuntimeExceptionTester {

	public static void main(String[] args) {
		try {
			throw new TestException();
		} catch (TestException e) {
			System.out.println("rt exception caught!");
		}
		
		System.out.println("continue?");
	}

}
