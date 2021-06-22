package JavaBasicTraining;

public class ConstructorConcept {
	
	//1. constructor is having the structure of a method
	//2. Constructor does not contain any return value
	//3. Default constructor will be there even if we dont define it explicitly.

	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("single param constructor");
		System.out.println("the value of i is "+i);
	}
	
	public ConstructorConcept(int j, int k) {
		System.out.println("two param constructor");
		System.out.println("the value of j is "+j);
		System.out.println("the value of k is "+k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

	}

}
