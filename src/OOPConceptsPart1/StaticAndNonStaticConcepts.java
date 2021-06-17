package OOPConceptsPart1;

public class StaticAndNonStaticConcepts {

	static String name ="Syam";
	int age = 35;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to call static method
		//1. Direct calling
		abcd();
		
		//2. Calling by Classname
		StaticAndNonStaticConcepts.abcd();
		
		
		//how to call static variables
		//1. Direct calling
			System.out.println(name);
				
		//2. Calling by Classname
		System.out.println(StaticAndNonStaticConcepts.name);
				
	}

	public static void abcd() {
		System.out.println("static abcd method");
	}
	
	public void pqr() {
		System.out.println("non static pqr method");
	}
}
