package OOPConceptsPart1;

public class CallByValAndCallByRef {

		int p;
		int q;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		obj.callbyvalue(x, y); //this is called call by value or pass by value. 
		
		obj.p = 40;
		obj.q = 50;
		System.out.println("before swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swap(obj);
		System.out.println("after swapping");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

	public int callbyvalue(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCallByRef t) { //here we are passing the reference value "obj"
		int temp;
		temp = t.p; //temp will be assigned with the value 40
		t.p = t.q; // t.p will get the value 50
		t.q = temp; //t.q will get the value 40
		
	}
}
