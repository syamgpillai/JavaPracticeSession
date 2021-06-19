package CollectionsListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		//static array
		int i[] = new int[3];		//this is a size limited array

		//dynamic array
		//1. size is not limited
		//2. can contain duplicate values/elements
		//3. maintain insertion order
		//4. non synchronized
		//5. allows random access to fetch the element because it stores the values on the basis of index.
		//6. There are non-generic and generic arraylists. Generic are the ones where we define the data types. 
		//7. Generic type eg: ArrayList<Integer> ar1 = new ArrayList<Integer>();
		//8. In the generic arraylist, we used to pass "E" if we are not sure about the data types the array list accepting.t
		
		ArrayList ar = new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		System.out.println(ar.size());
		
		for(int a=0;a<ar.size();a++) {
			System.out.println(ar.get(a));
		}
		
		
		//non-generic vs generic ArrayList
		//Below are the generic form
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(12);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("String");
		
		ArrayList<E> ar3 = new ArrayList<E>(); //"E" is used if we are not sure about the datatypes.
		
		
		//Creating employee class object (to demonstrate how we are storing class objects in arraylist)
		
		Employee e1 = new Employee("Syam", 35, "QA");
		
		Employee e2 = new Employee("Kumar", 25, "Automation");
		
		
		Employee e3 = new Employee("Vishnu", 30, "HR");
		
		//create array list with class object
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator is the method we use to traverse the values
		
		Iterator<Employee> it = ar4.iterator(); //iterator method will be stored as Iterator reference
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
//		videolink : https://www.youtube.com/watch?v=Plob9dBGyEY&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=18
		
		
		//****************************************************
		
		//addall() method
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("String");
		ar5.add("user");
		ar5.add("type");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("add");
		ar6.add("all");
		ar6.add("method");
		
		ar5.addAll(ar6);
		
		System.out.println(ar5.get(4));
		System.out.println(ar5.size());
		
		
		
		//removeall() method
		
		ar5.removeAll(ar6);
		System.out.println(ar5.size());

		
		
		//retainAll() this method will collect only the common value among the two objects
		
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("String");
		ar7.add("user");
		ar7.add("type");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("add");
		ar8.add("user");
		
		ar7.retainAll(ar8);
		for(int j=0;j<ar7.size();j++) {
			System.out.println(ar7.get(j));
		}
		System.out.println(ar7.size());
	
	
		System.out.println(ar8);
		
		//set new value
		ar8.set(0, "new");
		System.out.println(ar8);
	
	
	}

}
