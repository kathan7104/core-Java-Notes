package oops;
import java.util.Scanner;

// ============================================================================
// PART A: Basic Inheritance (Single Inheritance) - 10 Tasks
// ============================================================================

//1. Create a class Animal and a child class Dog. Add one method in each.
class Animal {
	void speak() {
		System.out.println("Animal makes a sound");
	}
}
//Dog class inherits the Animal class
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

//2. Create a class Vehicle and inherit it in Car.
class Vehicle {
	void start() {
		System.out.println("Vehicle started");
	}
}
//Car inherits Vehicle class
class Car extends Vehicle {
	void accelerate() {
		System.out.println("Car accelerating");
	}
}

//3. Write a program where a child class uses a method of the parent class.
class Parent {
	void parentMethod() {
		System.out.println("Parent method called");
	}
}
//Child uses parent method
class Child extends Parent {
	void childMethod() {
		parentMethod(); // Using parent class method
		System.out.println("Child method called");
	}
}

//4. Create a parent class with a variable and access it in child class.
class ParentWithVar {
	String name = "Parent";
}
//Child accesses parent variable
class ChildWithVar extends ParentWithVar {
	void display() {
		System.out.println("Accessing parent variable: " + name);
	}
}

//5. Create a class Person and inherit it in Student.
class Person {
	String name;
	Person(String name) {
		this.name = name;
	}
	void introduce() {
		System.out.println("I am " + name);
	}
}
//Student inherits Person
class Student extends Person {
	int rollNo;
	Student(String name, int rollNo) {
		super(name);
		this.rollNo = rollNo;
	}
	void showDetails() {
		introduce();
		System.out.println("Roll Number: " + rollNo);
	}
}

//6. Write a program to show constructor calling in inheritance.
class ParentConstructor {
	ParentConstructor() {
		System.out.println("Parent constructor called");
	}
}
//Child constructor calls parent constructor
class ChildConstructor extends ParentConstructor {
	ChildConstructor() {
		super(); // Parent constructor called first
		System.out.println("Child constructor called");
	}
}

//7. Create a parent class with a display() method and call it from child.
class ParentDisplay {
	void display() {
		System.out.println("Parent display method");
	}
}
//Child calls parent display method
class ChildDisplay extends ParentDisplay {
	void show() {
		display(); // Calling parent display method
		System.out.println("Child show method");
	}
}

//8. Write a program using super keyword to call parent method.
class ParentSuper {
	void method() {
		System.out.println("Parent method using super");
	}
}
//Child uses super to call parent method
class ChildSuper extends ParentSuper {
	void method() {
		super.method(); // Using super to call parent method
		System.out.println("Child method");
	}
}

//9. Write a program using super keyword to access parent variable.
class ParentVar {
	String color = "Red";
}
//Child uses super to access parent variable
class ChildVar extends ParentVar {
	String color = "Blue";
	void showColors() {
		System.out.println("Child color: " + color);
		System.out.println("Parent color: " + super.color); // Using super to access parent variable
	}
}

//10. Create a class Employee and inherit it in Manager.
class Employee {
	String empId;
	double salary;
	Employee(String empId, double salary) {
		this.empId = empId;
		this.salary = salary;
	}
	void work() {
		System.out.println("Employee " + empId + " is working");
	}
}
//Manager inherits Employee
class Manager extends Employee {
	String department;
	Manager(String empId, double salary, String department) {
		super(empId, salary);
		this.department = department;
	}
	void manage() {
		work();
		System.out.println("Managing " + department + " department");
	}
}

// ============================================================================
// PART B: Method Overriding (Runtime Polymorphism) - 10 Tasks
// ============================================================================

//11. Create a parent class Bank with method getInterest() and override it.
class Bank {
	int getInterest() {
		return 4;
	}
}
//MyBank overrides getInterest() method
class MyBank extends Bank {
	@Override
	int getInterest() {
		return 7; // Overriding parent method
	}
}

//12. Create a parent class Shape with method draw() and override it.
class Shape {
	void draw() {
		System.out.println("Drawing a shape");
	}
}
//Circle overrides draw() method
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

//13. Write a program showing method overriding.
class ParentOverride {
	void show() {
		System.out.println("Parent show method");
	}
}
//Child overrides show() method
class ChildOverride extends ParentOverride {
	@Override
	void show() {
		System.out.println("Child show method (overridden)");
	}
}

//14. Create a parent reference pointing to child object.
class ParentRef {
	void display() {
		System.out.println("Parent display");
	}
}
//Child class
class ChildRef extends ParentRef {
	@Override
	void display() {
		System.out.println("Child display");
	}
}

//15. Override a method and call it using parent reference.
class ParentCall {
	void method() {
		System.out.println("Parent method");
	}
}
//Child overrides method
class ChildCall extends ParentCall {
	@Override
	void method() {
		System.out.println("Child method (called via parent reference)");
	}
}

//16. Write a program showing runtime polymorphism.
class AnimalPoly {
	void sound() {
		System.out.println("Animal makes sound");
	}
}
//Dog overrides sound() - runtime polymorphism
class DogPoly extends AnimalPoly {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}
}
//Cat overrides sound() - runtime polymorphism
class CatPoly extends AnimalPoly {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

//17. Create a parent class Mobile and override method in SmartPhone.
class Mobile {
	void call() {
		System.out.println("Making a call from Mobile");
	}
}
//SmartPhone overrides call() method
class SmartPhone extends Mobile {
	@Override
	void call() {
		System.out.println("Making a call from SmartPhone with video");
	}
}

//18. Override toString() method in child class.
class PersonToString {
	String name;
	PersonToString(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person: " + name;
	}
}
//Student overrides toString()
class StudentToString extends PersonToString {
	int id;
	StudentToString(String name, int id) {
		super(name);
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student: " + name + ", ID: " + id;
	}
}

//19. Write a program showing method overriding with super.
class ParentSuperOverride {
	void display() {
		System.out.println("Parent display");
	}
}
//Child overrides with super
class ChildSuperOverride extends ParentSuperOverride {
	@Override
	void display() {
		super.display(); // Calling parent method using super
		System.out.println("Child display");
	}
}

//20. Create a parent class with method show() and override it in two child classes.
class ParentShow {
	void show() {
		System.out.println("Parent show method");
	}
}
//First child overrides show()
class Child1Show extends ParentShow {
	@Override
	void show() {
		System.out.println("Child1 show method");
	}
}
//Second child overrides show()
class Child2Show extends ParentShow {
	@Override
	void show() {
		System.out.println("Child2 show method");
	}
}

// ============================================================================
// PART C: Hierarchical Inheritance - 10 Tasks
// ============================================================================

//21. Create a parent class Animal and child classes Dog and Cat.
class AnimalHier {
	void eat() {
		System.out.println("Animal is eating");
	}
}
//Dog inherits Animal
class DogHier extends AnimalHier {
	void bark() {
		System.out.println("Dog barks");
	}
}
//Cat inherits Animal
class CatHier extends AnimalHier {
	void meow() {
		System.out.println("Cat meows");
	}
}

//22. Create a parent class Vehicle and child classes Car and Bike.
class VehicleHier {
	void start() {
		System.out.println("Vehicle started");
	}
}
//Car inherits Vehicle
class CarHier extends VehicleHier {
	void drive() {
		System.out.println("Car is driving");
	}
}
//Bike inherits Vehicle
class BikeHier extends VehicleHier {
	void ride() {
		System.out.println("Bike is riding");
	}
}

//23. Write a program showing hierarchical inheritance.
class ParentHier {
	void parentMethod() {
		System.out.println("Parent method");
	}
}
//Child1 inherits Parent
class Child1Hier extends ParentHier {
	void child1Method() {
		System.out.println("Child1 method");
	}
}
//Child2 inherits Parent
class Child2Hier extends ParentHier {
	void child2Method() {
		System.out.println("Child2 method");
	}
}

//24. Create a class Employee with child classes Developer and Tester.
class EmployeeHier {
	String name;
	EmployeeHier(String name) {
		this.name = name;
	}
	void work() {
		System.out.println(name + " is working");
	}
}
//Developer inherits Employee
class Developer extends EmployeeHier {
	Developer(String name) {
		super(name);
	}
	void code() {
		work();
		System.out.println(name + " is coding");
	}
}
//Tester inherits Employee
class Tester extends EmployeeHier {
	Tester(String name) {
		super(name);
	}
	void test() {
		work();
		System.out.println(name + " is testing");
	}
}

//25. Create one parent class and two child classes with different methods.
class ParentDiff {
	void common() {
		System.out.println("Common method in parent");
	}
}
//Child1 with unique method
class Child1Diff extends ParentDiff {
	void method1() {
		System.out.println("Child1 unique method");
	}
}
//Child2 with unique method
class Child2Diff extends ParentDiff {
	void method2() {
		System.out.println("Child2 unique method");
	}
}

//26. Write a program where multiple child classes use same parent method.
class ParentSame {
	void sharedMethod() {
		System.out.println("Shared method from parent");
	}
}
//Child1 uses shared method
class Child1Same extends ParentSame {
	void useShared() {
		sharedMethod();
		System.out.println("Child1 using shared method");
	}
}
//Child2 uses shared method
class Child2Same extends ParentSame {
	void useShared() {
		sharedMethod();
		System.out.println("Child2 using shared method");
	}
}

//27. Demonstrate variable inheritance in hierarchical inheritance.
class ParentVarHier {
	String parentVar = "Parent variable";
}
//Child1 inherits variable
class Child1VarHier extends ParentVarHier {
	void showVar1() {
		System.out.println("Child1 accessing: " + parentVar);
	}
}
//Child2 inherits variable
class Child2VarHier extends ParentVarHier {
	void showVar2() {
		System.out.println("Child2 accessing: " + parentVar);
	}
}

//28. Use method overriding in hierarchical inheritance.
class ParentOverrideHier {
	void display() {
		System.out.println("Parent display");
	}
}
//Child1 overrides display()
class Child1OverrideHier extends ParentOverrideHier {
	@Override
	void display() {
		System.out.println("Child1 display (overridden)");
	}
}
//Child2 overrides display()
class Child2OverrideHier extends ParentOverrideHier {
	@Override
	void display() {
		System.out.println("Child2 display (overridden)");
	}
}

//29. Write a program using parent reference for different child objects.
class ParentRefHier {
	void show() {
		System.out.println("Parent show");
	}
}
//Child1
class Child1RefHier extends ParentRefHier {
	@Override
	void show() {
		System.out.println("Child1 show");
	}
}
//Child2
class Child2RefHier extends ParentRefHier {
	@Override
	void show() {
		System.out.println("Child2 show");
	}
}

//30. Create three child classes from one parent class.
class ParentThree {
	void parentMethod() {
		System.out.println("Parent method");
	}
}
//First child
class Child1Three extends ParentThree {
	void child1Method() {
		System.out.println("Child1 method");
	}
}
//Second child
class Child2Three extends ParentThree {
	void child2Method() {
		System.out.println("Child2 method");
	}
}
//Third child
class Child3Three extends ParentThree {
	void child3Method() {
		System.out.println("Child3 method");
	}
}

// ============================================================================
// PART D: Multilevel Inheritance (Easy) - 10 Tasks
// ============================================================================

//31. Create classes A, B, and C where C inherits from B and B from A.
class A {
	void methodA() {
		System.out.println("Method from A");
	}
}
//B inherits A
class B extends A {
	void methodB() {
		System.out.println("Method from B");
	}
}
//C inherits B (so C has access to A and B)
class C extends B {
	void methodC() {
		System.out.println("Method from C");
	}
}

//32. Write a program to show multilevel inheritance.
class GrandParent {
	void grandParentMethod() {
		System.out.println("GrandParent method");
	}
}
//Parent inherits GrandParent
class ParentMulti extends GrandParent {
	void parentMethod() {
		System.out.println("Parent method");
	}
}
//Child inherits Parent (so Child has access to GrandParent and Parent)
class ChildMulti extends ParentMulti {
	void childMethod() {
		System.out.println("Child method");
	}
}

//33. Create Person → Employee → Manager inheritance.
class PersonMulti {
	String name;
	PersonMulti(String name) {
		this.name = name;
	}
	void introduce() {
		System.out.println("I am " + name);
	}
}
//Employee inherits Person
class EmployeeMulti extends PersonMulti {
	String empId;
	EmployeeMulti(String name, String empId) {
		super(name);
		this.empId = empId;
	}
	void work() {
		introduce();
		System.out.println("Employee ID: " + empId);
	}
}
//Manager inherits Employee (so Manager has access to Person and Employee)
class ManagerMulti extends EmployeeMulti {
	String department;
	ManagerMulti(String name, String empId, String department) {
		super(name, empId);
		this.department = department;
	}
	void manage() {
		work();
		System.out.println("Managing " + department);
	}
}

//34. Access grandparent method from child class.
class GrandParentAccess {
	void grandParentMethod() {
		System.out.println("GrandParent method accessed from child");
	}
}
//Parent inherits GrandParent
class ParentAccess extends GrandParentAccess {
	void parentMethod() {
		System.out.println("Parent method");
	}
}
//Child inherits Parent (can access GrandParent method)
class ChildAccess extends ParentAccess {
	void accessGrandParent() {
		grandParentMethod(); // Accessing grandparent method
		parentMethod();
		System.out.println("Child method");
	}
}

//35. Write a program showing constructor calling order.
class GrandParentConstructor {
	GrandParentConstructor() {
		System.out.println("GrandParent constructor");
	}
}
//Parent constructor
class ParentConstructorMulti extends GrandParentConstructor {
	ParentConstructorMulti() {
		super(); // Calls GrandParent constructor
		System.out.println("Parent constructor");
	}
}
//Child constructor
class ChildConstructorMulti extends ParentConstructorMulti {
	ChildConstructorMulti() {
		super(); // Calls Parent constructor (which calls GrandParent)
		System.out.println("Child constructor");
	}
}

//36. Use super keyword in multilevel inheritance.
class Level1 {
	void method1() {
		System.out.println("Level1 method");
	}
}
//Level2
class Level2 extends Level1 {
	void method2() {
		super.method1(); // Using super to call Level1
		System.out.println("Level2 method");
	}
}
//Level3
class Level3 extends Level2 {
	void method3() {
		super.method2(); // Using super to call Level2
		System.out.println("Level3 method");
	}
}

//37. Create variables in all three classes and access them.
class Level1Var {
	String var1 = "Variable from Level1";
}
//Level2 with variable
class Level2Var extends Level1Var {
	String var2 = "Variable from Level2";
}
//Level3 with variable (can access var1 and var2)
class Level3Var extends Level2Var {
	String var3 = "Variable from Level3";
	void showAll() {
		System.out.println(var1); // Accessing Level1 variable
		System.out.println(var2); // Accessing Level2 variable
		System.out.println(var3); // Accessing Level3 variable
	}
}

//38. Override a method in multilevel inheritance.
class BaseOverride {
	void display() {
		System.out.println("Base display");
	}
}
//Middle overrides display()
class MiddleOverride extends BaseOverride {
	@Override
	void display() {
		System.out.println("Middle display (overridden)");
	}
}
//Top overrides display() again
class TopOverride extends MiddleOverride {
	@Override
	void display() {
		System.out.println("Top display (overridden again)");
	}
}

//39. Use parent reference to call child object method.
class BaseRef {
	void show() {
		System.out.println("Base show");
	}
}
//Middle
class MiddleRef extends BaseRef {
	@Override
	void show() {
		System.out.println("Middle show");
	}
}
//Top
class TopRef extends MiddleRef {
	@Override
	void show() {
		System.out.println("Top show");
	}
}

//40. Write a simple multilevel inheritance example.
class Simple1 {
	void method1() {
		System.out.println("Simple1 method");
	}
}
//Simple2
class Simple2 extends Simple1 {
	void method2() {
		method1();
		System.out.println("Simple2 method");
	}
}
//Simple3
class Simple3 extends Simple2 {
	void method3() {
		method2();
		System.out.println("Simple3 method");
	}
}

// ============================================================================
// PART E: Hybrid Inheritance (Using Interfaces) - 10 Tasks
// ============================================================================

//41. Create an interface and implement it in one class.
interface Drawable {
	void draw();
}
//Circle implements Drawable interface
class CircleImpl implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

//42. Create an interface implemented by two classes (hierarchical).
interface Flyable {
	void fly();
}
//Bird implements Flyable
class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("Bird is flying");
	}
}
//Airplane implements Flyable
class Airplane implements Flyable {
	@Override
	public void fly() {
		System.out.println("Airplane is flying");
	}
}

//43. Create two interfaces implemented by one class (multiple inheritance).
interface Readable {
	void read();
}
interface Writable {
	void write();
}
//Document implements both interfaces (multiple inheritance)
class Document implements Readable, Writable {
	@Override
	public void read() {
		System.out.println("Reading document");
	}
	@Override
	public void write() {
		System.out.println("Writing document");
	}
}

//44. Create hybrid inheritance using class and interface.
class AnimalHybrid {
	void eat() {
		System.out.println("Animal is eating");
	}
}
interface Swimmable {
	void swim();
}
//Duck inherits Animal and implements Swimmable (hybrid inheritance)
class Duck extends AnimalHybrid implements Swimmable {
	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}
}

//45. Write a program using interface reference.
interface Playable {
	void play();
}
//MusicPlayer implements Playable
class MusicPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("MusicPlayer playing");
	}
}

//46. Use default method in interface.
interface Device {
	void turnOn();
	default void turnOff() {
		System.out.println("Device turned off (default method)");
	}
}
//TV implements Device
class TV implements Device {
	@Override
	public void turnOn() {
		System.out.println("TV turned on");
	}
	// Uses default turnOff() method
}

//47. Override default method in implementing class.
interface VehicleInterface {
	default void start() {
		System.out.println("Vehicle started (default)");
	}
}
//Car overrides default method
class CarInterface implements VehicleInterface {
	@Override
	public void start() {
		System.out.println("Car started (overridden)");
	}
}

//48. Create interface with variables and access them.
interface Constants {
	int MAX_SPEED = 120; // public static final by default
	String UNIT = "km/h";
}
//SpeedLimit implements Constants
class SpeedLimit implements Constants {
	void showLimit() {
		System.out.println("Max speed: " + MAX_SPEED + " " + UNIT);
	}
}

//49. Create interface with multiple abstract methods.
interface Calculator {
	int add(int a, int b);
	int subtract(int a, int b);
	int multiply(int a, int b);
}
//BasicCalc implements Calculator
class BasicCalc implements Calculator {
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		return a - b;
	}
	@Override
	public int multiply(int a, int b) {
		return a * b;
	}
}

//50. Write a program combining inheritance and interface.
class AnimalCombined {
	void eat() {
		System.out.println("Animal eating");
	}
}
interface Runnable {
	void run();
}
//DogCombined inherits AnimalCombined and implements Runnable
class DogCombined extends AnimalCombined implements Runnable {
	@Override
	public void run() {
		System.out.println("Dog running");
	}
}

// ============================================================================
// Main Class with Menu-Driven Program
// ============================================================================

public class Day2Inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n==========================================");
			System.out.println("    INHERITANCE PRACTICE MENU");
			System.out.println("==========================================");
			System.out.println("PART A: Basic Inheritance (Single)");
			System.out.println("  1. Animal and Dog");
			System.out.println("  2. Vehicle and Car");
			System.out.println("  3. Child uses parent method");
			System.out.println("  4. Access parent variable in child");
			System.out.println("  5. Person and Student");
			System.out.println("  6. Constructor calling");
			System.out.println("  7. Parent display() called from child");
			System.out.println("  8. super to call parent method");
			System.out.println("  9. super to access parent variable");
			System.out.println(" 10. Employee and Manager");
			System.out.println("\nPART B: Method Overriding");
			System.out.println(" 11. Bank with getInterest() override");
			System.out.println(" 12. Shape with draw() override");
			System.out.println(" 13. Method overriding demo");
			System.out.println(" 14. Parent reference to child object");
			System.out.println(" 15. Override and call using parent reference");
			System.out.println(" 16. Runtime polymorphism");
			System.out.println(" 17. Mobile and SmartPhone");
			System.out.println(" 18. Override toString()");
			System.out.println(" 19. Method overriding with super");
			System.out.println(" 20. Parent show() overridden in two children");
			System.out.println("\nPART C: Hierarchical Inheritance");
			System.out.println(" 21. Animal -> Dog and Cat");
			System.out.println(" 22. Vehicle -> Car and Bike");
			System.out.println(" 23. Hierarchical inheritance demo");
			System.out.println(" 24. Employee -> Developer and Tester");
			System.out.println(" 25. One parent, two children with different methods");
			System.out.println(" 26. Multiple children use same parent method");
			System.out.println(" 27. Variable inheritance in hierarchical");
			System.out.println(" 28. Method overriding in hierarchical");
			System.out.println(" 29. Parent reference for different child objects");
			System.out.println(" 30. Three child classes from one parent");
			System.out.println("\nPART D: Multilevel Inheritance");
			System.out.println(" 31. A -> B -> C");
			System.out.println(" 32. Multilevel inheritance demo");
			System.out.println(" 33. Person -> Employee -> Manager");
			System.out.println(" 34. Access grandparent method");
			System.out.println(" 35. Constructor calling order");
			System.out.println(" 36. super in multilevel");
			System.out.println(" 37. Variables in all three classes");
			System.out.println(" 38. Override method in multilevel");
			System.out.println(" 39. Parent reference to call child object method");
			System.out.println(" 40. Simple multilevel example");
			System.out.println("\nPART E: Hybrid Inheritance (Interfaces)");
			System.out.println(" 41. Interface implemented in one class");
			System.out.println(" 42. Interface implemented by two classes");
			System.out.println(" 43. Two interfaces implemented by one class");
			System.out.println(" 44. Hybrid inheritance (class + interface)");
			System.out.println(" 45. Interface reference");
			System.out.println(" 46. Default method in interface");
			System.out.println(" 47. Override default method");
			System.out.println(" 48. Interface with variables");
			System.out.println(" 49. Interface with multiple abstract methods");
			System.out.println(" 50. Combining inheritance and interface");
			System.out.println("\n  0. Exit");
			System.out.println("==========================================");
			System.out.print("Choose an option (0-50): ");

			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
				case 1: {
					Dog dog = new Dog();
					dog.speak();
					dog.bark();
					break;
				}
				case 2: {
					Car car = new Car();
					car.start();
					car.accelerate();
					break;
				}
				case 3: {
					Child child = new Child();
					child.childMethod();
					break;
				}
				case 4: {
					ChildWithVar child = new ChildWithVar();
					child.display();
					break;
				}
				case 5: {
					Student student = new Student("John", 101);
					student.showDetails();
					break;
				}
				case 6: {
					ChildConstructor child = new ChildConstructor();
					break;
				}
				case 7: {
					ChildDisplay child = new ChildDisplay();
					child.show();
					break;
				}
				case 8: {
					ChildSuper child = new ChildSuper();
					child.method();
					break;
				}
				case 9: {
					ChildVar child = new ChildVar();
					child.showColors();
					break;
				}
				case 10: {
					Manager manager = new Manager("M001", 50000, "IT");
					manager.manage();
					break;
				}
				case 11: {
					Bank bankRef = new MyBank();
					System.out.println("Interest rate: " + bankRef.getInterest() + "%");
					break;
				}
				case 12: {
					Shape shape = new Circle();
					shape.draw();
					break;
				}
				case 13: {
					ParentOverride parent = new ChildOverride();
					parent.show();
					break;
				}
				case 14: {
					ParentRef parentRef = new ChildRef();
					parentRef.display();
					break;
				}
				case 15: {
					ParentCall parentCall = new ChildCall();
					parentCall.method();
					break;
				}
				case 16: {
					AnimalPoly animal1 = new DogPoly();
					AnimalPoly animal2 = new CatPoly();
					animal1.sound();
					animal2.sound();
					break;
				}
				case 17: {
					Mobile mobile = new SmartPhone();
					mobile.call();
					break;
				}
				case 18: {
					StudentToString student = new StudentToString("Alice", 123);
					System.out.println(student.toString());
					break;
				}
				case 19: {
					ChildSuperOverride child = new ChildSuperOverride();
					child.display();
					break;
				}
				case 20: {
					ParentShow parent1 = new Child1Show();
					ParentShow parent2 = new Child2Show();
					parent1.show();
					parent2.show();
					break;
				}
				case 21: {
					DogHier dog = new DogHier();
					CatHier cat = new CatHier();
					dog.eat();
					dog.bark();
					cat.eat();
					cat.meow();
					break;
				}
				case 22: {
					CarHier car = new CarHier();
					BikeHier bike = new BikeHier();
					car.start();
					car.drive();
					bike.start();
					bike.ride();
					break;
				}
				case 23: {
					Child1Hier child1 = new Child1Hier();
					Child2Hier child2 = new Child2Hier();
					child1.parentMethod();
					child1.child1Method();
					child2.parentMethod();
					child2.child2Method();
					break;
				}
				case 24: {
					Developer dev = new Developer("Alice");
					Tester tester = new Tester("Bob");
					dev.code();
					tester.test();
					break;
				}
				case 25: {
					Child1Diff child1 = new Child1Diff();
					Child2Diff child2 = new Child2Diff();
					child1.common();
					child1.method1();
					child2.common();
					child2.method2();
					break;
				}
				case 26: {
					Child1Same child1 = new Child1Same();
					Child2Same child2 = new Child2Same();
					child1.useShared();
					child2.useShared();
					break;
				}
				case 27: {
					Child1VarHier child1 = new Child1VarHier();
					Child2VarHier child2 = new Child2VarHier();
					child1.showVar1();
					child2.showVar2();
					break;
				}
				case 28: {
					ParentOverrideHier parent1 = new Child1OverrideHier();
					ParentOverrideHier parent2 = new Child2OverrideHier();
					parent1.display();
					parent2.display();
					break;
				}
				case 29: {
					ParentRefHier ref1 = new Child1RefHier();
					ParentRefHier ref2 = new Child2RefHier();
					ref1.show();
					ref2.show();
					break;
				}
				case 30: {
					Child1Three child1 = new Child1Three();
					Child2Three child2 = new Child2Three();
					Child3Three child3 = new Child3Three();
					child1.parentMethod();
					child1.child1Method();
					child2.parentMethod();
					child2.child2Method();
					child3.parentMethod();
					child3.child3Method();
					break;
				}
				case 31: {
					C cObj = new C();
					cObj.methodA();
					cObj.methodB();
					cObj.methodC();
					break;
				}
				case 32: {
					ChildMulti child = new ChildMulti();
					child.grandParentMethod();
					child.parentMethod();
					child.childMethod();
					break;
				}
				case 33: {
					ManagerMulti manager = new ManagerMulti("John", "E001", "IT");
					manager.manage();
					break;
				}
				case 34: {
					ChildAccess child = new ChildAccess();
					child.accessGrandParent();
					break;
				}
				case 35: {
					ChildConstructorMulti child = new ChildConstructorMulti();
					break;
				}
				case 36: {
					Level3 level3 = new Level3();
					level3.method3();
					break;
				}
				case 37: {
					Level3Var level3 = new Level3Var();
					level3.showAll();
					break;
				}
				case 38: {
					BaseOverride base = new TopOverride();
					base.display();
					break;
				}
				case 39: {
					BaseRef base = new TopRef();
					base.show();
					break;
				}
				case 40: {
					Simple3 simple = new Simple3();
					simple.method3();
					break;
				}
				case 41: {
					Drawable drawable = new CircleImpl();
					drawable.draw();
					break;
				}
				case 42: {
					Flyable bird = new Bird();
					Flyable airplane = new Airplane();
					bird.fly();
					airplane.fly();
					break;
				}
				case 43: {
					Document doc = new Document();
					doc.read();
					doc.write();
					break;
				}
				case 44: {
					Duck duck = new Duck();
					duck.eat();
					duck.swim();
					break;
				}
				case 45: {
					Playable player = new MusicPlayer();
					player.play();
					break;
				}
				case 46: {
					Device tv = new TV();
					tv.turnOn();
					tv.turnOff();
					break;
				}
				case 47: {
					VehicleInterface vehicle = new CarInterface();
					vehicle.start();
					break;
				}
				case 48: {
					SpeedLimit speed = new SpeedLimit();
					speed.showLimit();
					break;
				}
				case 49: {
					Calculator calc = new BasicCalc();
					System.out.println("Add: " + calc.add(10, 5));
					System.out.println("Subtract: " + calc.subtract(10, 5));
					System.out.println("Multiply: " + calc.multiply(10, 5));
					break;
				}
				case 50: {
					DogCombined dog = new DogCombined();
					dog.eat();
					dog.run();
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
