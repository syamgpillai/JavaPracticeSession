package OOPConceptPart2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void transfer();
	
	public void debit();
	
	//only method declaration
	//no method bodies in interface
	//in interface we can declare the variables and by default vars are static
	//vars value will not be changed, its Final in nature
	//no static methods in interface
	//no main method
	//we cannot create object for interface
	//Interface is abstract in nature
	
}
