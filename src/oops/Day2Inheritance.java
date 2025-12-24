package oops;

// Demonstrations covering one example from each inheritance topic.
class Animal {
	void speak() {
		System.out.println("Animal makes a sound");
	}
}

// PART A: Basic single inheritance
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}

// PART B: Method overriding / runtime polymorphism
class Bank {
	int getInterest() {
		return 4;
	}
}
class MyBank extends Bank {
	@Override
	int getInterest() {
		return 7;
	}
}

// PART C: Hierarchical inheritance
class Vehicle {
	void honk() {
		System.out.println("Vehicle honks");
	}
}
class Car extends Vehicle {
	void drive() {
		System.out.println("Car drives");
	}
}
class Bike extends Vehicle {
	void ride() {
		System.out.println("Bike rides");
	}
}

// PART D: Multilevel inheritance
class A {
	void fromA() {
		System.out.println("Method from A");
	}
}
class B extends A {
	void fromB() {
		System.out.println("Method from B");
	}
}
class C extends B {
	void fromC() {
		System.out.println("Method from C");
	}
}

// PART E: Hybrid inheritance (via interfaces)
interface Playable {
	void play();
	default void stop() {
		System.out.println("Default stop from Playable");
	}
}
class MusicPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("MusicPlayer playing");
	}
	@Override
	public void stop() {
		System.out.println("MusicPlayer stopped (override)");
	}
}

public class Day2Inheritance {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n--- Inheritance Menu ---");
			System.out.println("1. Part A - Single Inheritance (Animal -> Dog)");
			System.out.println("2. Part B - Method Overriding (Bank -> MyBank)");
			System.out.println("3. Part C - Hierarchical (Vehicle -> Car/Bike)");
			System.out.println("4. Part D - Multilevel (A -> B -> C)");
			System.out.println("5. Part E - Hybrid via Interface (Playable -> MusicPlayer)");
			System.out.println("6. Exit");
			System.out.print("Choose an option (1-6): ");

			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					Dog dog = new Dog();
					dog.speak();
					dog.bark();
					break;
				}
				case 2: {
					Bank bankRef = new MyBank(); // parent reference to child object
					System.out.println("Interest rate: " + bankRef.getInterest());
					break;
				}
				case 3: {
					Vehicle v1 = new Car();
					Vehicle v2 = new Bike();
					v1.honk();
					v2.honk();
					break;
				}
				case 4: {
					C cObj = new C();
					cObj.fromA();
					cObj.fromB();
					cObj.fromC();
					break;
				}
				case 5: {
					Playable player = new MusicPlayer();
					player.play();
					player.stop();
					break;
				}
				case 6: {
					System.out.println("Exiting...");
					running = false;
					break;
				}
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
		sc.close();
	}
}
