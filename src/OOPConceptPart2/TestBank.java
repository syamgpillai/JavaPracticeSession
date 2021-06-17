package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfer();
		hs.educationloan();
		hs.carloan();
		
		//dynamic polymorphism
		//child class object can be referred by parent class/interface reference variable
		
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transfer();
		
		System.out.println(hs.min_bal);
		System.out.println(USBank.min_bal);
	}

}
