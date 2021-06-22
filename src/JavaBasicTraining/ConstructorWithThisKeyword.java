package JavaBasicTraining;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name=name; //if the global variable and local variable are same, we can map and access global variable with "This" keyword
		this.age=age;
		
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Syam",20);
	}

}
