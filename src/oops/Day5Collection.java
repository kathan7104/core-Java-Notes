package oops;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

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

        
        dq.addFirst("Front-A	");
        dq.addLast("End-B");
        dq.add("Middle");   
        dq.addFirst("Front-C");

        System.out.println("Deque Elements: " + dq);

       
        System.out.println("Removed from Front: " + dq.removeFirst());
        System.out.println("Removed from End: " + dq.removeLast());

        
        System.out.println("First Element: " + dq.peekFirst());
        System.out.println("Last Element: " + dq.peekLast());

        System.out.println("Final Deque: " + dq);
        
        
        //sorting list:
        List<String> names = new ArrayList<String>();
        names.add("Rahul");
        names.add("Zara");
        names.add("Amit");
        names.add("Priya");
        
        
        System.out.println("unsorted list: "+names);
        Collections.sort(names);
        System.out.println("sorted list: "+names);
		
        
        /*1)Write a program to store 5 fruits in a List and print them using:
✔ for loop
✔ enhanced for loop
✔ Iterator
Concepts covered:
sing a Set.
Example Input:
 ["Apple", "Banana", "Apple", "Mango", "Banana"]
Output:
 ["Apple", "Banana", "Mango"]
Concepts covered:
 List → Set conversion, Collections, unique elements.
*/
        List<String> fruits=new ArrayList<String>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        
        //forloop
        for(int i=0;i<=fruits.size()-1;i++) {
        	System.out.print("\n"+fruits.get(i)+" ");
        }
        
        //foreach loop
        for(String f: fruits) {
        	System.out.print("\n"+f+" ");
        }
        
        //Iterator
        Iterator<String> i=fruits.iterator();
        while(i.hasNext()) {
        	String fruit=i.next();
        	System.out.println(fruit);
        }
        
        /*2)Write a Java program to remove duplicate elements from a List u Coding */
        
        Set<String> hs=new HashSet<String>(fruits);
        
        System.out.print(hs);
        
        /*3)Write a program to count the frequency of each word using HashMap.
Input:
 ["Apple", "Banana", "Apple", "Mango", "Banana", "Apple"]
Output:
Apple → 3
Banana → 2
Mango → 1
Concepts covered:
 Map, Generics, forEach loop.
*/
        
        fruits.add("Apple");
        Map<String,Integer> wf=new HashMap<>();
        
        for(String f:fruits) {
        	int c=wf.getOrDefault(f, 0);
        	wf.put(f, c+1);
        	
        	
        	
        }
        
        
        
        System.out.print("\n\n\n"+wf+"\n\n");
        	
        
        /*4. Write a generic method that prints elements of any List.*/
        dispaly(fruits);
        
        /* 5. Create a List of Integers and find the largest number.
Input:
 [10, 30, 20, 50, 40]
Output:
 Largest number = 50
Concepts covered:
 List, Collections, loop logic.
*/
        List<Integer> num=new ArrayList<Integer>();
        num.add(10);
        num.add(50);
        num.add(59);
        num.add(40);
        num.add(20);
        
        int max=num.get(0);
        
        for(int j=1;j<=num.size()-1;j++) {
        	if(num.get(j)>max) {
        		max=num.get(j);	
        	}
        }
        
        System.out.print("\n\nLargest number = "+max);
        
        /*Linked Hash Set*/
        Scanner sc=new Scanner(System.in);
        Set<Integer> lhs=new LinkedHashSet<Integer>();
        
        for(int l=0;l<=6;l++) {
        	int n=sc.nextInt();
           	lhs.add(n);
        }
        
        
        for(int r:lhs) {
        	System.out.print("\n\n"+r+" ");
        }
        
        System.out.print("\n\nTotal number of Uniqu element: "+lhs.size());
        
        /*Tree set*/
        Set<String> emp=new TreeSet<String>();
        for(int l=0;l<=6;l++) {
        	String n=sc.next();
           	emp.add(n);
        }
        
        
        for(String r:emp) {
        	System.out.print("\n\n"+r+" ");
        }
        System.out.print("First Emp: "+((TreeSet<String>) emp).first());
        System.out.print("First Emp: "+((TreeSet<String>) emp).last());
        
        String name1=sc.next();
        emp.remove(name1);
        
        
        /*Hash map*/
        
        Map<Integer, Integer> std=new HashMap<Integer, Integer>();
        
        std.put(1, 63);
        std.put(2, 53);
        std.put(3, 36);
        std.put(4, 90);
        std.put(5, 85);
        std.put(6, 33);
        
        for(Map.Entry<Integer,Integer> ent:std.entrySet()) {
        	if(ent.getValue()>60) {
        		System.out.println("Roll no: "+ent.getKey()+" Marks: "+ent.getValue());
        	}
        }
        
        int totalMarks = 0;
        for (int marks : std.values()) {
            totalMarks += marks;
        }

        double averageMarks = (double) totalMarks / std.size();
        System.out.printf("\nAverage marks of all students: %.2f%n", averageMarks);
        
        /*Linked Hash Map*/
        LinkedHashMap<String, Integer> inventory = new LinkedHashMap<>();

        // Adding initial items
        System.out.println("--- Adding Items ---");
        inventory.put("Laptop", 5);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 2);  // Low stock example
        inventory.put("Monitor", 15);
        inventory.put("HDMI Cable", 3); // Low stock example

        // 2. Display all items (LinkedHashMap preserves insertion order)
        System.out.println("\n--- Current Inventory (Insertion Order) ---");
        System.out.print(inventory);
        // 3. Update the quantity of an existing item
        System.out.println("\n--- Updating 'Mouse' quantity to 45 ---");
        if (inventory.containsKey("Mouse")) {
            inventory.put("Mouse", 45); // .put() updates value if key exists
            System.out.println("Update Successful.");
        } else {
            System.out.println("Item not found.");
        }

        // 4. Remove items where quantity is less than a specific value (e.g., 5)
        System.out.println("Enter min quantity: ");
        int minqnt = sc.nextInt();
        System.out.println("\n--- Removing items with quantity < " + minqnt + " ---");

        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();
        
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            
            // Check the condition
            if (entry.getValue() < minqnt) {
                System.out.println("Removing: " + entry.getKey());
                iterator.remove(); // Safely removes the current item
            }
        }
        
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Item: " + entry.getKey() + " | Qty: " + entry.getValue());
        }
        
       
        
        
	}
public static <String> void dispaly(List<String> fruits){
	for(String item:fruits) {
		System.out.print(item+" ");
	}
}
}