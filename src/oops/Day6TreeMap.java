/**
 * TreeMap Demonstration Program
 * This program demonstrates various operations on TreeMap including:
 * - Creating and adding key-value pairs
 * - Sorted order demonstration
 * - Retrieving keys and values
 * - Removing entries
 * - Checking key existence
 * - Getting first and last keys
 * - Iterating using entrySet() and keySet()
 * - Demonstrating no duplicate keys
 * - Student roll number and name example
 * - Descending order sorting
 */
package oops;

import java.util.*;

public class Day6TreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("=== TreeMap Demonstration Program ===\n");
		
		// ++. Create a TreeMap and add 5 key-value pairs
		System.out.println("1. Creating TreeMap and adding 5 key-value pairs:");
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(5, "Banana");
		treeMap.put(2, "Kivi");
		treeMap.put(8, "Orange");
		treeMap.put(1, "Apple");
		treeMap.put(9, "Book");
		System.out.println("TreeMap after adding: " + treeMap);
		System.out.println();
		
		// 2. Demonstrate how TreeMap stores keys in sorted order
		System.out.println("2. Demonstrating sorted order:");
		System.out.println("Notice that keys are automatically sorted: " + treeMap);
		System.out.println("Keys were added in order: 5, 2, 8, 1, 9");
		System.out.println("But TreeMap stores them sorted: " + treeMap.keySet());
		System.out.println();
		
		// 3. Retrieve and display all keys and values
		System.out.println("3. Retrieving and displaying all keys and values:");
		System.out.println("All Keys: " + treeMap.keySet());
		System.out.println("All Values: " + treeMap.values());
		System.out.println("Key-Value pairs:");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("  Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		System.out.println();
		
		// 4. Remove an entry from TreeMap using a key
		System.out.println("4. Removing entry with key 5:");
		System.out.println("Before removal: " + treeMap);
		treeMap.remove(5);
		System.out.println("After removal: " + treeMap);
		System.out.println();
		
		// 5. Check whether a key exists in TreeMap
		System.out.println("5. Checking key existence:");
		int keyToCheck = 8;
		if (treeMap.containsKey(keyToCheck)) {
			System.out.println("Key " + keyToCheck + " exists. Value: " + treeMap.get(keyToCheck));
		} else {
			System.out.println("Key " + keyToCheck + " does not exist.");
		}
		
		keyToCheck = 5;
		if (treeMap.containsKey(keyToCheck)) {
			System.out.println("Key " + keyToCheck + " exists. Value: " + treeMap.get(keyToCheck));
		} else {
			System.out.println("Key " + keyToCheck + " does not exist.");
		}
		System.out.println();
		
		// 6. Get firstKey() and lastKey() from TreeMap
		System.out.println("6. Getting first and last keys:");
		if (!treeMap.isEmpty()) {
			System.out.println("First Key: " + treeMap.firstKey());
			System.out.println("Last Key: " + treeMap.lastKey());
			System.out.println("First Entry: " + treeMap.firstEntry());
			System.out.println("Last Entry: " + treeMap.lastEntry());
		}
		System.out.println();
		
		// 7. Iterate through TreeMap using entrySet() and keySet()
		System.out.println("7. Iterating through TreeMap:");
		
		System.out.println("Using entrySet():");
		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
		}
		
		System.out.println("Using keySet():");
		for (Integer key : treeMap.keySet()) {
			System.out.println("  " + key + " -> " + treeMap.get(key));
		}
		System.out.println();
		
		// 8. Demonstrate that TreeMap does not allow duplicate keys
		System.out.println("8. Demonstrating no duplicate keys:");
		System.out.println("Current TreeMap: " + treeMap);
		System.out.println("Attempting to add duplicate key 2 with value 'Duplicate':");
		String previousValue = treeMap.put(2, "Duplicate");
		System.out.println("Previous value for key 2: " + previousValue);
		System.out.println("TreeMap after adding duplicate key: " + treeMap);
		System.out.println("Notice: The value was replaced, not duplicated!");
		System.out.println();
		
		// 9. Store student roll number as key and student name as value
		System.out.println("9. Student roll number and name example:");
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(101, "Kathan");
		students.put(102, "Idrish");
		students.put(103, "Omik");
		students.put(104, "Dhruval");
		students.put(105, "Arsh");
		
		System.out.println("Student records (sorted by roll number):");
		for (Map.Entry<Integer, String> student : students.entrySet()) {
			System.out.println("  Roll No: " + student.getKey() + ", Name: " + student.getValue());
		}
		System.out.println();
		
		// 10. Sort TreeMap keys in descending order
		System.out.println("10. TreeMap with descending order:");
		TreeMap<Integer, String> descendingMap = new TreeMap<>(Collections.reverseOrder());
		descendingMap.put(5, "Five");
		descendingMap.put(2, "Two");
		descendingMap.put(8, "Eight");
		descendingMap.put(1, "One");
		descendingMap.put(9, "Nine");
		
		System.out.println("Descending order TreeMap: " + descendingMap);
		System.out.println("Keys in descending order: " + descendingMap.keySet());
		System.out.println();
		
		
	}

}
