/**
 * 
 */
package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *#1 
 */
class STD implements Comparable<STD>{
	int id;String name;double marks;

	public STD(int id,String name,double mark){
		this.id=id;
		this.name=name;
		this.marks=mark;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public double getMark() {
		return marks;
	}
	
	@Override
	public int compareTo(STD o) {
		// TODO Auto-generated method stub
		if(this.marks>o.marks) {
			return 1;
		}
		else if(this.marks<o.marks) {
			return -1;
		}else {
			return 0;
		}
	}
	
	public String toString() {
		return "Student [id= "+id+", name= "+name+", marks= "+marks+"]";
	}
	
	
}

public class Day9Comp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<STD> std=new ArrayList<>();
		
		System.out.println("How many student data you going to enter?:");
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter "+(i+1)+"student Data.");
			
			System.out.println("ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("NAME: ");
			String name=sc.nextLine();
			
			System.out.println("MARKS: ");
			double mark=sc.nextDouble();
			sc.nextLine();
			
			std.add(new STD(id,name,mark));
			
		}
		
		System.out.println("\nBefore sorting:");
		for(STD s:std) {
			System.out.println(s);
		}
		
		// Sort the students by marks using Comparable
		Collections.sort(std);
		
		System.out.println("\nAfter sorting by marks (ascending):");
		for(STD s:std) {
			System.out.println(s);
		}
		
		sc.close();
	}

}
