package OOPConceptsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(5);
		obj.sum(4, 8);
		
		
		
	}
	
	//we can duplicate main method also but with different arguments/parameters.
	public static void main(int b) {
		System.out.println("main method duplication");
		System.out.println(b);
	}

	//Method overloading - When the method name is same with different arguments or input parameters within the same class.
	public void sum() {
		System.out.println("sum method -- zero param");
	}
	
	public void sum(int x) {
		System.out.println("sum method -- single param");
		System.out.println(x);
	}
	
	public void sum(int y, int s) {
		System.out.println("sum method -- two params");
		System.out.println(y+s);
	}
}
