package JavaBasicTraining;

public class ConstructorWithSuperKeywordB extends ConstructorWithSuperKeywordA{

	public ConstructorWithSuperKeywordB() {
		super(20);//super keyword is used to call parent constructor from child class
		//even if we do not use super keyword it will call the default constructor from parent class, if the constructor is defined.
		System.out.println("this is child class of A");
	}
	
	public static void main(String[] args) {
		ConstructorWithSuperKeywordB obj = new ConstructorWithSuperKeywordB();
	}
}
