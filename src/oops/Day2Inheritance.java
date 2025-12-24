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
		// Part A
		Dog dog = new Dog();
		dog.speak();
		dog.bark();

		// Part B
		Bank bankRef = new MyBank(); // parent reference to child object
		System.out.println("Interest rate: " + bankRef.getInterest());

		// Part C
		Vehicle v1 = new Car();
		Vehicle v2 = new Bike();
		v1.honk();
		v2.honk();

		// Part D
		C cObj = new C();
		cObj.fromA();
		cObj.fromB();
		cObj.fromC();

		// Part E
		Playable player = new MusicPlayer();
		player.play();
		player.stop();
	}
}
