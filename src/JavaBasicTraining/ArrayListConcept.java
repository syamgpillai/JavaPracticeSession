package JavaBasicTraining;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();
		ar.add(100); //0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		ar.add("string");//4
		ar.add("12.33");//5
		ar.add("true");//6
		ar.add("M");//7
		ar.add(500);
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());

		
		System.out.println(ar.get(7));
		
		for (int j=0;j<ar.size();j++) {
			System.out.println(ar.get(j));
		}
		
		
		//how to restric array list to a particular datatype
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);
		//ar1.add("string"); //will show error
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("name");
		//ar2.add(100);//will show error
		
		
	}

}
