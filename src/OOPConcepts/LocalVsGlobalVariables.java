package OOPConcepts;

public class LocalVsGlobalVariables {

	//Global variable - Class variable
	String name = "Syam";
	int age = 35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10; //this is local variable
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		int x = obj.test();
		System.out.println(x);
	}

	public int test() {
		int i=10;
		int j=20;
		int age=36; //i, j, and age are local variables.
		
		return age;
	}
}
