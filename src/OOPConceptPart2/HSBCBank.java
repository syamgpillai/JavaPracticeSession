package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ //we are achieving multiple inheritance
	//Is-a relationship --- interface to class relationship

	//if a class is implementing an interface, then its mandatory to define/override all the methods of the interface.
	//overriding from USBank
	public void credit() {
		System.out.println("HSBC credit");
	}
	
	public void debit() {
		System.out.println("HSBC debit");
	}
	
	public void transfer() {
		System.out.println("HSBC transfer");
	}
	//Separate methods from HSBC bank
	public void educationloan() {
		System.out.println("HSBC education loan");
	}
	
	public void carloan() {
		System.out.println("HSBC car loan");
	}
	//Overriding from Brazil bank
	public void mutualfund() {
		System.out.println("Brazil mutal fund");
	}
	
}
