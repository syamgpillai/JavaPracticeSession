package JavaBasicTraining;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static single dimension array
		
		//int array
		//lowest bound/index is 0
		//highest bound/index is n-1 where n is the size of the array.
		
		//disadvantages
		//1.size is limited
		//2.only similar data types can be stored.
		int i[]= new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println(i[4]);
		
		System.out.println(i.length);
		
		//how to print all the values of array - it can be done using for loop
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
			
		}

		String s[]= new String [3];
		s[0]="test";
		s[1]="new test";
		s[2]="check";
		System.out.println(s[2]);
		
		
		//
		
		
	}

}
