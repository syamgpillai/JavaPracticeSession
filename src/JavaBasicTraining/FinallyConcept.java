package JavaBasicTraining;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		division();
	}

	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("this is inside finally blockj");
		}
	}
	
	public static void test2()	{
		try {
			System.out.println("this is inside test2 method");
		}
		finally {
			System.out.println("this is inside finally block2");
		}
	}
	
	public static void division() {
		int i = 10;
		try {
			System.out.println("this is inside division");
			int x = i/10;
		} catch(ArithmeticException e) {
			System.out.println("this is arithametic exception");
			System.out.println("division by zero error");
		}
		
		finally {
			System.out.println("this code need to be executed");
		}
	}
}
