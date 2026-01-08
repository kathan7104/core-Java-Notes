package oops;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
		
		
		List al=new ArrayList();
		
		al.add(10);
		al.add("java");
		
		System.out.print("\n"+al+"\n");
		
		
		
		
		// Create Stack
        Stack<Integer> stack = new Stack<>();

        // Check if empty
        System.out.println("Is stack empty? " + stack.empty());

        // Push elements
        stack.push(78);
        stack.push(113);
        stack.push(90);
        stack.push(120);

        //
        System.out.println("Stack elements: " + stack);

        // Peek top element
        System.out.println("Top element (peek): " + stack.peek());

        // Pop element
        System.out.println("Removed element (pop): " + stack.pop());

        // Print stack again
        System.out.println("Stack after pop: " + stack);

        // Search element
        System.out.println("Position of 78 (from top): " + stack.search(78));
        
        //Deque
        Deque<String> dq = new ArrayDeque<>();

        
        dq.addFirst("Front-A");
        dq.addLast("End-B");
        dq.add("Middle");   
        dq.addFirst("Front-C");

        System.out.println("Deque Elements: " + dq);

       
        System.out.println("Removed from Front: " + dq.removeFirst());
        System.out.println("Removed from End: " + dq.removeLast());

        
        System.out.println("First Element: " + dq.peekFirst());
        System.out.println("Last Element: " + dq.peekLast());

        System.out.println("Final Deque: " + dq);
		
	}

}
