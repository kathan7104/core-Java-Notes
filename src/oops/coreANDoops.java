/**
 * 
 */
package oops;

/**
 * 
 */
//class HelloWorld { 
//	private double balance;//a private variable balance 
//
//	public void setBalance(double balance) {
//	  this.balance = balance; //puttig the value in the balance field 
//	}
//	
//	public double getBalance() {
//	  return balance; //accessing the value of balance
//	}
//	/*public static void main(String[] args) {
//		HelloWorld acc = new HelloWorld();
//	  acc.setBalance(5000);
//	  System.out.println(acc.getBalance());
//	}*/
//}
//
//public class coreANDoops {
//	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		HelloWorld acc = new HelloWorld();//object of HelloWorld class 
//		acc.setBalance(5000);//setting the value 5000 in balance field
//		System.out.println(acc.getBalance());//displaying the value
//		
//	}
//
//}
//Example of Class
class HelloWorld {
int id;
String name;
void study() {
    System.out.println("Student is studying");
}
public static void main(String args[]) {
	//Object
    HelloWorld obj = new HelloWorld();
    obj.study();
}
}





//Class & Object
//-- A class is a blueprint, and an object is a real instance of that class.
//class HelloWorld {
// int id;-- integer/numeric field id 
// String name;-- character field name
//
// void display() //method for displaying the data{ 
//     System.out.println(id + " " + name);//printing the data 'id name'
// }
//
// public static void main(String[] args) {
// 	HelloWorld s1 = new HelloWorld(); // object creation of HelloWorld class
//     s1.id = 101; //assigning value '101' to id field by accessing it with object 's1'
//     s1.name = "Kathan"; //assigning value 'Kathan' to name field by accessing it with object 's1'
//     s1.display(); //calling display method of HelloWorld class for display the data '101 Kathan' 
// }
//}







//Encapsulation
//-- Wrapping data + methods together and protecting data using private variables.
//class HelloWorld {
// private double balance;//a private variable balance 
//
// public void setBalance(double balance) {
//     this.balance = balance;//puttig the value in the balance field 
// }
//
// public double getBalance() {
//     return balance;//accessing the value of balance
// }
// public static void main(String[] args) {
// 	HelloWorld acc = new HelloWorld();//object of HelloWorld class
//     acc.setBalance(5000);//calling setBalance method for putting the value 5000 in balance field
//     System.out.println(acc.getBalance());//displaying the value
// }
//}



//3. Inheritance
//One class acquires properties of another class.
//class HelloWorld with run() method
//class HelloWorld {
//run() method for printing 'Vehicle is running'
// void run() {
//     System.out.println("Vehicle is running");
// }
//class Bike with speed() method
// class Bike {
//speed() method for printing 'Bike speed is 80 km/h'
//     void speed() {
//         System.out.println("Bike speed is 80 km/h");
//     }
// }
//
// public static void main(String[] args) {
//     HelloWorld obj = new HelloWorld();//object creation of  class HelloWorld
//     HelloWorld.Bike b = obj.new Bike();//object creation of class Bike
//     obj.run();//calling run method using object 'obj'
//     b.speed();//calling speed method using object 'b'
// }
//}







//Polymorphism
       // - Same method name, different behavior.
//Declaration of the Animal class 
//class Animal {
//a display method that print's 'Animal makes a sound'
// void sound() {
//     System.out.println("Animal makes a sound");
// }
//}
//Declaration of Dog class which inherit the Animal class
//class Dog extends Animal {
//a display method that print's 'Dog barks'
// void sound() {
//     System.out.println("Dog barks");
// }
//}
//
//public class HelloWorld {
// public static void main(String[] args) {
//     Animal a = new Dog(); // polymorphism, Reference is Animal, Object is Dog 
//     a.sound();//calling the sound method that display's 'Dog barks'
// }
//}







//Abstraction
         // -- Showing only essential details, hiding implementation.
//Definition of the Abstract Class
//abstract class Shape {
//Abstract Method declaration
// abstract void draw();
//}
//
//Subclass extending the Abstract Class
//class Circle extends Shape {
//Implementation of the abstract method
// void draw() {
//     System.out.println("Drawing Circle");
// }
//}
//
//public class HelloWorld {
// public static void main(String[] args) {
//Creating the object
//     Shape s = new Circle(); // abstraction
//     s.draw();// Calling the method
// }
//}	
