package oops;
import java.util.Scanner;
import java.io.*;

// ============================================================================
// PART A: Checked Exception (IOException)
// ============================================================================

//1. Demonstrate Checked Exception using IOException
class CheckedExceptionDemo {
	void readFile() {
		try {
			FileReader file = new FileReader("nonexistent.txt");
			file.read();
			file.close();
		} catch (IOException e) {
			System.out.println("Checked Exception (IOException) caught: " + e.getMessage());
		}
	}
}

// ============================================================================
// PART B: Unchecked Exception (ArithmeticException)
// ============================================================================

//2. Demonstrate Unchecked Exception using ArithmeticException
class UncheckedExceptionDemo {
	void divide(int a, int b) {
		try {
			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Unchecked Exception (ArithmeticException) caught: " + e.getMessage());
		}
	}
}

// ============================================================================
// PART C: Difference between Checked and Unchecked Exceptions
// ============================================================================

//3. Show difference between Checked and Unchecked Exceptions
class ExceptionDifference {
	// Checked Exception - must be handled or declared
	void checkedExample() {
		try {
			FileInputStream file = new FileInputStream("test.txt");
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("Checked Exception: " + e.getClass().getSimpleName());
			System.out.println("Must be handled with try-catch or declared with throws");
		} catch (IOException e) {
			System.out.println("Checked Exception: " + e.getMessage());
		}
	}
	
	// Unchecked Exception - not required to handle
	void uncheckedExample() {
		try {
			int[] arr = new int[5];
			arr[10] = 100; // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Unchecked Exception: " + e.getClass().getSimpleName());
			System.out.println("Not required to handle, but good practice");
		}
	}
}

// ============================================================================
// PART D: ArrayIndexOutOfBoundsException
// ============================================================================

//4. Handle ArrayIndexOutOfBoundsException using try-catch
class ArrayExceptionDemo {
	void accessArray(int index) {
		int[] arr = {1, 2, 3, 4, 5};
		try {
			System.out.println("Array element at index " + index + ": " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException caught!");
			System.out.println("Index " + index + " is out of bounds. Array size is " + arr.length);
		}
	}
}

// ============================================================================
// PART E: Multiple Catch Blocks
// ============================================================================

//5. Use multiple catch blocks to handle different exceptions
class MultipleCatchDemo {
	void multipleCatchExample(int choice, int value) {
		try {
			switch(choice) {
				case 1:
					int result = 10 / value; // ArithmeticException if value is 0
					System.out.println("Division result: " + result);
					break;
				case 2:
					int[] arr = new int[5];
					arr[value] = 100; // ArrayIndexOutOfBoundsException if value >= 5
					System.out.println("Array element set successfully");
					break;
				case 3:
					String str = null;
					int len = str.length(); // NullPointerException
					break;
			}
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught general Exception: " + e.getClass().getSimpleName());
		}
	}
}

// ============================================================================
// PART F: Finally Block
// ============================================================================

//6. Demonstrate finally block
class FinallyDemo {
	void finallyExample(boolean throwException) {
		try {
			System.out.println("Inside try block");
			if (throwException) {
				throw new RuntimeException("Exception thrown intentionally");
			}
			System.out.println("No exception occurred");
		} catch (RuntimeException e) {
			System.out.println("Caught exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed - This always runs!");
		}
	}
	
	// Show that finally executes even when exception occurs
	void finallyWithException() {
		try {
			int result = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero");
		} finally {
			System.out.println("Finally block executed even after exception!");
		}
	}
}

// ============================================================================
// PART G: Throw Keyword
// ============================================================================

//7. Demonstrate throw keyword - manually throw exception for invalid age
class ThrowDemo {
	void validateAge(int age) {
		try {
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative: " + age);
			}
			if (age > 150) {
				throw new IllegalArgumentException("Age cannot be greater than 150: " + age);
			}
			System.out.println("Valid age: " + age);
		} catch (IllegalArgumentException e) {
			System.out.println("Invalid age input: " + e.getMessage());
		}
	}
}

// ============================================================================
// PART H: Throws Keyword
// ============================================================================

//8. Demonstrate throws keyword - declare exception in method
class ThrowsDemo {
	// Method declares that it throws IOException
	void readFileMethod(String filename) throws IOException {
		FileReader file = new FileReader(filename);
		file.read();
		file.close();
	}
	
	// Calling method handles the exception
	void callReadFile(String filename) {
		try {
			readFileMethod(filename);
			System.out.println("File read successfully");
		} catch (IOException e) {
			System.out.println("Exception handled in calling method: " + e.getMessage());
		}
	}
}

// ============================================================================
// PART I: Exception Not Handled
// ============================================================================

//9. Exception occurs but is not handled - program termination
class UnhandledExceptionDemo {
	void unhandledException() {
		System.out.println("Before exception...");
		int result = 10 / 0; // ArithmeticException - not handled
		System.out.println("After exception (this won't execute)");
	}
}

// ============================================================================
// PART J: Combined Program
// ============================================================================

//10. Combined program with all exception handling concepts
class CombinedExceptionDemo {
	// Checked Exception
	void checkedException() throws IOException {
		FileReader file = new FileReader("test.txt");
		file.close();
	}
	
	// Unchecked Exception
	void uncheckedException() {
		int result = 10 / 0;
	}
	
	// Try-catch-finally
	void tryCatchFinally() {
		try {
			System.out.println("Inside try block");
			int[] arr = new int[5];
			arr[10] = 100; // Will throw exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught: " + e.getClass().getSimpleName());
		} finally {
			System.out.println("Finally block executed");
		}
	}
	
	// Throw
	void throwExample(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("Value cannot be negative");
		}
		System.out.println("Value is valid: " + value);
	}
	
	// Throws
	void throwsExample() throws IOException {
		FileReader file = new FileReader("nonexistent.txt");
		file.close();
	}
	
	// Combined demonstration
	void demonstrateAll() {
		System.out.println("=== Combined Exception Handling Demo ===");
		
		// 1. Try-catch-finally
		System.out.println("\n1. Try-Catch-Finally:");
		tryCatchFinally();
		
		// 2. Throw
		System.out.println("\n2. Throw keyword:");
		try {
			throwExample(-5);
		} catch (IllegalArgumentException e) {
			System.out.println("Caught: " + e.getMessage());
		}
		
		// 3. Throws
		System.out.println("\n3. Throws keyword:");
		try {
			throwsExample();
		} catch (IOException e) {
			System.out.println("Caught IOException from throws: " + e.getMessage());
		}
		
		// 4. Unchecked Exception
		System.out.println("\n4. Unchecked Exception:");
		try {
			uncheckedException();
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}
		
		// 5. Checked Exception
		System.out.println("\n5. Checked Exception:");
		try {
			checkedException();
		} catch (IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		}
	}
}

// ============================================================================
// Main Class with Menu-Driven Program
// ============================================================================

public class Day4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n==========================================");
			System.out.println("    EXCEPTION HANDLING PRACTICE MENU");
			System.out.println("==========================================");
			System.out.println("PART A: Checked Exception");
			System.out.println("  1. Checked Exception using IOException");
			System.out.println("\nPART B: Unchecked Exception");
			System.out.println("  2. Unchecked Exception using ArithmeticException");
			System.out.println("\nPART C: Difference between Checked and Unchecked");
			System.out.println("  3. Show difference with examples");
			System.out.println("\nPART D: ArrayIndexOutOfBoundsException");
			System.out.println("  4. Handle ArrayIndexOutOfBoundsException");
			System.out.println("\nPART E: Multiple Catch Blocks");
			System.out.println("  5. Multiple catch blocks for different exceptions");
			System.out.println("\nPART F: Finally Block");
			System.out.println("  6. Demonstrate finally block");
			System.out.println("  7. Finally executes even when exception occurs");
			System.out.println("\nPART G: Throw Keyword");
			System.out.println("  8. Manually throw exception for invalid age");
			System.out.println("\nPART H: Throws Keyword");
			System.out.println("  9. Declare exception in method, handle in calling method");
			System.out.println("\nPART I: Unhandled Exception");
			System.out.println(" 10. Exception not handled - program termination");
			System.out.println("\nPART J: Combined Program");
			System.out.println(" 11. Combined: Checked, Unchecked, try-catch-finally, throw, throws");
			System.out.println("\n  0. Exit");
			System.out.println("==========================================");
			System.out.print("Choose an option (0-11): ");

			int choice = sc.nextInt();
			System.out.println();

			switch (choice) {
				case 1: {
					CheckedExceptionDemo demo = new CheckedExceptionDemo();
					demo.readFile();
					break;
				}
				case 2: {
					UncheckedExceptionDemo demo = new UncheckedExceptionDemo();
					System.out.print("Enter first number: ");
					int a = sc.nextInt();
					System.out.print("Enter second number (0 to trigger exception): ");
					int b = sc.nextInt();
					demo.divide(a, b);
					break;
				}
				case 3: {
					ExceptionDifference demo = new ExceptionDifference();
					System.out.println("--- Checked Exception Example ---");
					demo.checkedExample();
					System.out.println("\n--- Unchecked Exception Example ---");
					demo.uncheckedExample();
					break;
				}
				case 4: {
					ArrayExceptionDemo demo = new ArrayExceptionDemo();
					System.out.print("Enter array index to access (0-4 is valid, >4 will throw exception): ");
					int index = sc.nextInt();
					demo.accessArray(index);
					break;
				}
				case 5: {
					MultipleCatchDemo demo = new MultipleCatchDemo();
					System.out.println("Choose exception type:");
					System.out.println("1. ArithmeticException (enter 0 for value)");
					System.out.println("2. ArrayIndexOutOfBoundsException (enter >=5 for value)");
					System.out.println("3. NullPointerException");
					System.out.print("Enter choice (1-3): ");
					int ch = sc.nextInt();
					System.out.print("Enter value: ");
					int val = sc.nextInt();
					demo.multipleCatchExample(ch, val);
					break;
				}
				case 6: {
					FinallyDemo demo = new FinallyDemo();
					System.out.print("Throw exception? (true/false): ");
					boolean throwEx = sc.nextBoolean();
					demo.finallyExample(throwEx);
					break;
				}
				case 7: {
					FinallyDemo demo = new FinallyDemo();
					demo.finallyWithException();
					break;
				}
				case 8: {
					ThrowDemo demo = new ThrowDemo();
					System.out.print("Enter age (negative or >150 to trigger exception): ");
					int age = sc.nextInt();
					demo.validateAge(age);
					break;
				}
				case 9: {
					ThrowsDemo demo = new ThrowsDemo();
					System.out.print("Enter filename (will throw IOException if file doesn't exist): ");
					String filename = sc.next();
					demo.callReadFile(filename);
					break;
				}
				case 10: {
					UnhandledExceptionDemo demo = new UnhandledExceptionDemo();
					System.out.println("Demonstrating unhandled exception...");
					System.out.println("Program will terminate after this exception!");
					try {
						demo.unhandledException();
					} catch (ArithmeticException e) {
						System.out.println("Exception caught in main: " + e.getMessage());
						System.out.println("(In real scenario without catch, program would terminate)");
					}
					break;
				}
				case 11: {
					CombinedExceptionDemo demo = new CombinedExceptionDemo();
					demo.demonstrateAll();
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
