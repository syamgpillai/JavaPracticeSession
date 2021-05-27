package JavaBasicTraining;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//post and pre increments
		
		int i=1;
		int j=i++; // post increment, first the value of i will be given to j and then increase the value of i by one.
		System.out.println(i);
		System.out.println(j);
		
		int a=1;
		int b=++a; //pre increment, first the value of a will be increased by 1 and assign it to b, and a will have new value as its already increased by one. 
		System.out.println(a);
		System.out.println(b);
		
//similarly post decrement and pre decrements are there
		
	}

}
