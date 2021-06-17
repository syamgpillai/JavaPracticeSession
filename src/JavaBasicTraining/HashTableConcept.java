package JavaBasicTraining;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		
		h.put("A", "Syam");
		h.put("B", "Tom");
		h.put("C", "Kumar");
		
		System.out.println(h.size());
		
		h.put(1, "you");
		h.put(2, "100");
		
		System.out.println(h.size());
		
		System.out.println(h.get(1));
		System.out.println(h.get("B"));
		
		//restricting the input data types
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(2, 100);
		//h1.put("C", "String");//only allows integer, it gives error.
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(2, "String");
		
		
	}

}
