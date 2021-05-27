package JavaBasicTraining;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while loop
		
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			i++; //disadvantage of while loop is, if we miss this incremental/decremental part, it will become an infinit loop
		}
		
		//for loop
		for (int j=10;j>=0;j--) // initialization part, conditional part,decremental part 
		{
			System.out.println(j);
		}
		
	}

}
