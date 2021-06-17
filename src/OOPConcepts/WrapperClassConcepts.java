package OOPConcepts;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Data conversion -- string to integer
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//wrapper classes available for all data types --> Integer,Double,Character,Boolean
		
		//string to double conversion
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//string to boolean
		
		String k = "true";
		boolean bool = Boolean.parseBoolean(k);
		
		
		//int to string
		
		int m = 4;
		System.out.println(m+10);
		String st = String.valueOf(m);
		System.out.println(st+10);
	}

}
