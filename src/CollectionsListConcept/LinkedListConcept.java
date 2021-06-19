package CollectionsListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add()
		
		ll.add("testing");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("Jmeter");
		
		System.out.println("LinkedList contents : "+ll);
		
		//addFirst()
		
		ll.addFirst("Divisions");
		
		System.out.println("LinkedList contents : "+ll);
		
		//addLast()
		
		ll.addLast("Cucumber");
		
		System.out.println("LinkedList contents : "+ll);
		
		//get()
		
		System.out.println(ll.get(0));
		
		//set()
		
		ll.set(0, "Departments");
		
		System.out.println(ll);
		
		//remove last and first element or from a specific position
		
		ll.removeFirst();
		ll.removeLast();
		ll.remove(1);
		
		System.out.println(ll);
		
		System.out.println("****************************************************************");
		//how to print all the values of LinkedList
		//1. For loop
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
		//2. advanced for loop
		System.out.println("************ advanced for loop");
		for(String abc : ll) {
			System.out.println(abc);
		}

		
		//3. Using iterator
		System.out.println("************ using iterator");
		
		Iterator<String> l = ll.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		//4. while loop
		System.out.println("************ while loop");
		
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
	}

}
