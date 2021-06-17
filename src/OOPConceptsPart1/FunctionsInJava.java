package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int i = obj.abc();
		System.out.println(i);
		
		String sd = obj.bcd();
		System.out.println(sd);
		
		int ab = obj.division(10, 5);
		System.out.println(ab);
	}

	//non static methods
	
	//return type of test method is void - means doesnot return any value
	public void test() {//no input no output
		System.out.println("test method");
	}
	
	//retrun type of abc method is int
	public int abc() { //no input but some output
		System.out.println("abc method");
		
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// return type of bcd method is string
	public String bcd() {//no input but some output
		System.out.println("bcd method");
		String s = "Selenium";
		
		return s;
	}
	
	//
	public int division(int x, int y) { //some input and some output
		System.out.println("division method");
		System.out.println(x);
		
		int d = x/y;
		
		return d;
	}
	
	
	
	
}
