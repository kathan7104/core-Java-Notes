package oops;
import java.util.Scanner;

// ============================================================================
// PART A1: Method Overloading (Compile-time Polymorphism)
// ============================================================================

//1. Create a class Calculator with an add() method
class Calcula1tor {
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
}

//2. Create a class Printer with method print()
class Printer {
	void print(String msg) {
		System.out.println("Printing String: " + msg);
	}
	void print(int number) {
		System.out.println("Printing Integer: " + number);
	}
}

//3. Write a class Area with overloaded methods to calculate
class Area {
	// Area of square
	double calculateArea(double side) {
		return side * side;
	}
	// Area of rectangle
	double calculateArea(double length, double width) {
		return length * width;
	}
}

//4. Create a class Display with overloaded show() methods
class Display {
	void show(int value) {
		System.out.println("Integer: " + value);
	}
	void show(double value) {
		System.out.println("Double: " + value);
	}
	void show(String value) {
		System.out.println("String: " + value);
	}
}

// ============================================================================
// PART A2: Method Overriding (Runtime Polymorphism)
// ============================================================================

//5. Create a parent class Animal with method sound()
class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
//Dog overrides sound()
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
//Cat overrides sound()
class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

//6. Create class Vehicle with method run()
class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}
//Bike overrides run()
class Bike extends Vehicle {
	@Override
	void run() {
		System.out.println("Bike is running fast");
	}
}

//7. Create Employee class with method getSalary()
class Employee {
	double getSalary() {
		return 50000;
	}
}
//Manager overrides getSalary()
class Manager extends Employee {
	@Override
	double getSalary() {
		return 100000;
	}
}

//8. Write a program where parent reference holds child object
class ParentRef {
	void display() {
		System.out.println("Parent display method");
	}
}
class ChildRef extends ParentRef {
	@Override
	void display() {
		System.out.println("Child display method (called via parent reference)");
	}
}

// ============================================================================
// PART A3: Polymorphism using Parent Reference
// ============================================================================

//9. Create a parent class Shape and child classes Circle and Rectangle
class Shape {
	void draw() {
		System.out.println("Drawing a shape");
	}
}
//Circle extends Shape
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}
//Rectangle extends Shape
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}

//10. Create a class Bank with method getInterest()
class Bank {
	int getInterest() {
		return 4;
	}
}
//SBI overrides getInterest()
class SBI extends Bank {
	@Override
	int getInterest() {
		return 6;
	}
}
//HDFC overrides getInterest()
class HDFC extends Bank {
	@Override
	int getInterest() {
		return 7;
	}
}

// ============================================================================
// PART B1: Abstract Class Basics
// ============================================================================

//11. Create an abstract class Animal with abstract method eat()
abstract class AbstractAnimal {
	abstract void eat();
}
//Dog implements eat()
class DogAbstract extends AbstractAnimal {
	@Override
	void eat() {
		System.out.println("Dog is eating");
	}
}

//12. Create abstract class Vehicle with method start()
abstract class AbstractVehicle {
	abstract void start();
}
//Car implements start()
class CarAbstract extends AbstractVehicle {
	@Override
	void start() {
		System.out.println("Car is starting");
	}
}

//13. Create abstract class Shape with abstract method area()
abstract class AbstractShape {
	abstract double area();
}
//Square implements area()
class SquareAbstract extends AbstractShape {
	double side;
	SquareAbstract(double side) {
		this.side = side;
	}
	@Override
	double area() {
		return side * side;
	}
}

//14. Create abstract class Employee with abstract method calculateSalary()
abstract class AbstractEmployee {
	abstract double calculateSalary();
}

// ============================================================================
// PART B2: Abstract Class with Concrete Method
// ============================================================================

//15. Create abstract class Bank with concrete and abstract methods
abstract class AbstractBank {
	// Concrete method
	void branch() {
		System.out.println("Bank branch information");
	}
	// Abstract method
	abstract int interestRate();
}
//Implementation
class BankImpl extends AbstractBank {
	@Override
	int interestRate() {
		return 5;
	}
}

//16. Create abstract class Mobile with concrete and abstract methods
abstract class AbstractMobile {
	// Concrete method
	void call() {
		System.out.println("Making a call");
	}
	// Abstract method
	abstract void camera();
}
//Implementation
class MobileImpl extends AbstractMobile {
	@Override
	void camera() {
		System.out.println("Taking a photo with camera");
	}
}

//17. Create abstract class Appliance with abstract and concrete methods
abstract class AbstractAppliance {
	// Abstract method
	abstract void turnOn();
	// Concrete method
	void plugIn() {
		System.out.println("Appliance plugged in");
	}
}
//Implementation
class ApplianceImpl extends AbstractAppliance {
	@Override
	void turnOn() {
		System.out.println("Appliance turned on");
	}
}

// ============================================================================
// PART B3: Constructor in Abstract Class
// ============================================================================

//18. Create an abstract class with a constructor
abstract class AbstractWithConstructor {
	AbstractWithConstructor() {
		System.out.println("Abstract class constructor called");
	}
	abstract void display();
}
//Implementation
class ConcreteClass extends AbstractWithConstructor {
	ConcreteClass() {
		super(); // Calls abstract class constructor
		System.out.println("Concrete class constructor called");
	}
	@Override
	void display() {
		System.out.println("Display method implemented");
	}
}

// ============================================================================
// PART C1: Interface Basics
// ============================================================================

//19. Create an interface Printable with method print()
interface Printable {
	void print();
}
//Document implements Printable
class Document implements Printable {
	@Override
	public void print() {
		System.out.println("Document is being printed");
	}
}

//20. Create an interface Playable with method play()
interface Playable {
	void play();
}
//MusicPlayer implements Playable
class MusicPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("Music is playing");
	}
}

//21. Create an interface Drawable and implement it in class Circle
interface Drawable {
	void draw();
}
//Circle implements Drawable
class CircleDrawable implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle using Drawable interface");
	}
}

// ============================================================================
// PART C2: Multiple Inheritance using Interface
// ============================================================================

//22. Create two interfaces Readable and Writable
interface Readable {
	void read();
}
interface Writable {
	void write();
}
//Book implements both interfaces
class Book implements Readable, Writable {
	@Override
	public void read() {
		System.out.println("Reading a book");
	}
	@Override
	public void write() {
		System.out.println("Writing in a book");
	}
}

//23. Create interfaces USB and Bluetooth
interface USB {
	void connectUSB();
}
interface Bluetooth {
	void connectBluetooth();
}
//Mobile implements both
class MobileDevice implements USB, Bluetooth {
	@Override
	public void connectUSB() {
		System.out.println("USB connected");
	}
	@Override
	public void connectBluetooth() {
		System.out.println("Bluetooth connected");
	}
}

// ============================================================================
// PART C3: Interface with Default Method (Java 8)
// ============================================================================

//24. Create an interface with a default method
interface Device {
	void turnOn();
	default void turnOff() {
		System.out.println("Device turned off (default method)");
	}
}
//Implementation
class TVDevice implements Device {
	@Override
	public void turnOn() {
		System.out.println("TV turned on");
	}
	// Uses default turnOff() method
}

//25. Create an interface Vehicle with default method fuelType()
interface VehicleInterface {
	default void fuelType() {
		System.out.println("Vehicle uses fuel (default method)");
	}
	void start();
}
//Implementation
class CarInterface implements VehicleInterface {
	@Override
	public void start() {
		System.out.println("Car started");
	}
	// Uses default fuelType() method
}

// ============================================================================
// PART C4: Interface as Reference
// ============================================================================

//26. Create an interface reference pointing to implementing class object
interface Displayable {
	void display();
}
//Implementation
class Screen implements Displayable {
	@Override
	public void display() {
		System.out.println("Screen displaying content");
	}
}

//27. Write a program showing interface reference calling implemented method
interface Movable {
	void move();
}
//Implementation
class Robot implements Movable {
	@Override
	public void move() {
		System.out.println("Robot is moving");
	}
}

// ============================================================================
// PART D: Mixed Concepts
// ============================================================================

//28. Write a program using abstract class + polymorphism
abstract class AbstractShapePoly {
	abstract void draw();
}
//Circle implementation
class CirclePoly extends AbstractShapePoly {
	@Override
	void draw() {
		System.out.println("Drawing circle (polymorphism with abstract class)");
	}
}
//Rectangle implementation
class RectanglePoly extends AbstractShapePoly {
	@Override
	void draw() {
		System.out.println("Drawing rectangle (polymorphism with abstract class)");
	}
}

//29. Write a program using interface + polymorphism
interface Soundable {
	void makeSound();
}
//Dog implementation
class DogSound implements Soundable {
	@Override
	public void makeSound() {
		System.out.println("Dog barks (polymorphism with interface)");
	}
}
//Cat implementation
class CatSound implements Soundable {
	@Override
	public void makeSound() {
		System.out.println("Cat meows (polymorphism with interface)");
	}
}

//30. Identify and correct errors - Example with proper implementation
abstract class AbstractExample {
	abstract void method();
}
//Correct implementation (no errors)
class CorrectImplementation extends AbstractExample {
	@Override
	void method() {
		System.out.println("Method properly implemented - no errors");
	}
}

// ============================================================================
// Main Class with Menu-Driven Program
// ============================================================================

public class Day3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n==========================================");
			System.out.println("    POLYMORPHISM & ABSTRACTION MENU");
			System.out.println("==========================================");
			System.out.println("PART A1: Method Overloading");
			System.out.println("  1. Calculator with add() methods");
			System.out.println("  2. Printer with print() methods");
			System.out.println("  3. Area class with overloaded methods");
			System.out.println("  4. Display with overloaded show() methods");
			System.out.println("\nPART A2: Method Overriding");
			System.out.println("  5. Animal with sound() - Dog and Cat override");
			System.out.println("  6. Vehicle with run() - Bike overrides");
			System.out.println("  7. Employee with getSalary() - Manager overrides");
			System.out.println("  8. Parent reference holds child object");
			System.out.println("\nPART A3: Polymorphism using Parent Reference");
			System.out.println("  9. Shape -> Circle and Rectangle with draw()");
			System.out.println(" 10. Bank -> SBI and HDFC with getInterest()");
			System.out.println("\nPART B1: Abstract Class Basics");
			System.out.println(" 11. Abstract Animal with eat() - Dog implements");
			System.out.println(" 12. Abstract Vehicle with start() - Car implements");
			System.out.println(" 13. Abstract Shape with area() - Square implements");
			System.out.println(" 14. Abstract Employee with calculateSalary()");
			System.out.println("\nPART B2: Abstract Class with Concrete Method");
			System.out.println(" 15. Abstract Bank with branch() and interestRate()");
			System.out.println(" 16. Abstract Mobile with call() and camera()");
			System.out.println(" 17. Abstract Appliance with turnOn() and plugIn()");
			System.out.println("\nPART B3: Constructor in Abstract Class");
			System.out.println(" 18. Abstract class with constructor");
			System.out.println("\nPART C1: Interface Basics");
			System.out.println(" 19. Printable interface - Document implements");
			System.out.println(" 20. Playable interface - MusicPlayer implements");
			System.out.println(" 21. Drawable interface - Circle implements");
			System.out.println("\nPART C2: Multiple Inheritance using Interface");
			System.out.println(" 22. Readable and Writable - Book implements both");
			System.out.println(" 23. USB and Bluetooth - Mobile implements both");
			System.out.println("\nPART C3: Interface with Default Method");
			System.out.println(" 24. Interface with default method");
			System.out.println(" 25. Vehicle interface with default fuelType()");
			System.out.println("\nPART C4: Interface as Reference");
			System.out.println(" 26. Interface reference pointing to implementing class");
			System.out.println(" 27. Interface reference calling implemented method");
			System.out.println("\nPART D: Mixed Concepts");
			System.out.println(" 28. Abstract class + polymorphism");
			System.out.println(" 29. Interface + polymorphism");
			System.out.println(" 30. Correct implementation (no errors)");
			System.out.println("\n  0. Exit");
			System.out.println("==========================================");
			System.out.print("Choose an option (0-30): ");

			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
				case 1: {
					Calculator calc = new Calculator();
					System.out.println("add(5, 3) = " + calc.add(5, 3));
					System.out.println("add(5, 3, 2) = " + calc.add(5, 3, 2));
					break;
				}
				case 2: {
					Printer printer = new Printer();
					printer.print("Hello World");
					printer.print(42);
					break;
				}
				case 3: {
					Area area = new Area();
					System.out.println("Area of square (side=5): " + area.calculateArea(5));
					System.out.println("Area of rectangle (length=5, width=3): " + area.calculateArea(5, 3));
					break;
				}
				case 4: {
					Display display = new Display();
					display.show(10);
					display.show(3.14);
					display.show("Hello");
					break;
				}
				case 5: {
					Animal dog = new Dog();
					Animal cat = new Cat();
					dog.sound();
					cat.sound();
					break;
				}
				case 6: {
					Vehicle bike = new Bike();
					bike.run();
					break;
				}
				case 7: {
					Employee manager = new Manager();
					System.out.println("Manager Salary: " + manager.getSalary());
					break;
				}
				case 8: {
					ParentRef parentRef = new ChildRef();
					parentRef.display();
					break;
				}
				case 9: {
					Shape circle = new Circle();
					Shape rectangle = new Rectangle();
					circle.draw();
					rectangle.draw();
					break;
				}
				case 10: {
					Bank sbi = new SBI();
					Bank hdfc = new HDFC();
					System.out.println("SBI Interest Rate: " + sbi.getInterest() + "%");
					System.out.println("HDFC Interest Rate: " + hdfc.getInterest() + "%");
					break;
				}
				case 11: {
					AbstractAnimal dog = new DogAbstract();
					dog.eat();
					break;
				}
				case 12: {
					AbstractVehicle car = new CarAbstract();
					car.start();
					break;
				}
				case 13: {
					AbstractShape square = new SquareAbstract(5);
					System.out.println("Area of square (side=5): " + square.area());
					break;
				}
				case 14: {
					System.out.println("Abstract Employee class created with calculateSalary() method");
					System.out.println("(Implementation class needed to create object)");
					break;
				}
				case 15: {
					AbstractBank bank = new BankImpl();
					bank.branch();
					System.out.println("Interest Rate: " + bank.interestRate() + "%");
					break;
				}
				case 16: {
					AbstractMobile mobile = new MobileImpl();
					mobile.call();
					mobile.camera();
					break;
				}
				case 17: {
					AbstractAppliance appliance = new ApplianceImpl();
					appliance.plugIn();
					appliance.turnOn();
					break;
				}
				case 18: {
					AbstractWithConstructor obj = new ConcreteClass();
					obj.display();
					break;
				}
				case 19: {
					Printable doc = new Document();
					doc.print();
					break;
				}
				case 20: {
					Playable player = new MusicPlayer();
					player.play();
					break;
				}
				case 21: {
					Drawable circle = new CircleDrawable();
					circle.draw();
					break;
				}
				case 22: {
					Book book = new Book();
					book.read();
					book.write();
					break;
				}
				case 23: {
					MobileDevice mobile = new MobileDevice();
					mobile.connectUSB();
					mobile.connectBluetooth();
					break;
				}
				case 24: {
					Device tv = new TVDevice();
					tv.turnOn();
					tv.turnOff();
					break;
				}
				case 25: {
					VehicleInterface car = new CarInterface();
					car.start();
					car.fuelType();
					break;
				}
				case 26: {
					Displayable screen = new Screen();
					screen.display();
					break;
				}
				case 27: {
					Movable robot = new Robot();
					robot.move();
					break;
				}
				case 28: {
					AbstractShapePoly circle = new CirclePoly();
					AbstractShapePoly rectangle = new RectanglePoly();
					circle.draw();
					rectangle.draw();
					break;
				}
				case 29: {
					Soundable dog = new DogSound();
					Soundable cat = new CatSound();
					dog.makeSound();
					cat.makeSound();
					break;
				}
				case 30: {
					AbstractExample obj = new CorrectImplementation();
					obj.method();
					break;
				}
				case 0: {
					System.out.println("Thanks for using the program!");
					running = false;
					break;
				}
				default:
					System.out.println("Invalid choice. Please try again.");
			}
		}
		sc.close();
	}
}
