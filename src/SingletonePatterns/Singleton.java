package SingletonePatterns;

public class Singleton {

	// In OOP, a singleton class is a class that have only one object (instances of
	// class) at a time.
	// How to design a singletone class?
	// 1. Make constructor as private
	// 2. write a static method which has return type of the object of this
	// singleton class (Lazy Initialization)

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "This is singleton constructor";
	}

	public static Singleton getInstances() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();

		return singleton_instance;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton x = Singleton.getInstances();
		Singleton y = Singleton.getInstances();
		Singleton z = Singleton.getInstances();
		
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		z.str=(z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
	}

}
