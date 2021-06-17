package OOPConceptPart2;

public class BMW extends Car{ //has-a relationship -- class to class relationship

	public void start() { //overridden method. Method overriding.
		System.out.println("BMW -- start");
	}
	
	public void performance() {
		System.out.println("BMW---performance");
	}
}
