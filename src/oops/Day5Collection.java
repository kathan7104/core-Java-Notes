package oops;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day5Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Create an ArrayList of strings, add 5 names, and print them using a for-each loop.
		Insert an element at a specific index and remove an element by value.*/
		
		ArrayList<String> name=new ArrayList<String>();
		
		//add 5 names
		name.add("kathan");
		name.add("Dhruval");
		name.add("omik");
		name.add(null);
		name.add("idrish");
		
		//print them using a for-each loop
		for(String names: name) {
			System.out.println(names);
		}
		
		//Insert an element at a specific index
		name.add(3,"arsh");
		System.out.println(name);
		//remove an element by value
		name.remove("arsh");
		System.out.println(name);
		
		
		/*LinkedList

Store 10 integers in a LinkedList and display them in reverse order.
Use addFirst() and addLast() methods to manipulate the list.*/
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		//Store 10 integers in a LinkedList
		for(int i=1;i<=10;i++) {
			ll.add(i);
		}
		//display them in reverse order
		for(int j=ll.size()-1;j>=0;j--) {
			System.out.print(ll.get(j)+"->");
		}
		//Use addFirst() and addLast() methods to manipulate the list
		ll.addFirst(11);
		ll.addLast(14);
		
		System.out.print("\n"+ll);
		
		
	}

}
