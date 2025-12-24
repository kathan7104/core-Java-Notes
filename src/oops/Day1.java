package oops;
import java.util.Scanner;
/*even odd */
public class Day1 {
	
	public int sumOF2num(int n1,int n2) {
		return (n1+n2);
	}
	public int factorial(int n) {
		if (n <= 1) return 1;
		int res = 1;
		for (int i = 2; i <= n; i++) {
			res *= i;
		}
		return res;
	}
	public int square(int n) {
		return n * n;
	}
	public int maxOf2(int n1, int n2) {
		return (n1 > n2) ? n1 : n2;
	}
	public boolean isPrime(int n) {
		if (n <= 1) return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	public int reverseNumber(int n) {
		int rem, rev = 0;
		while(n != 0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n /= 10;
		}
		return rev;
	}
	//main method
	public static void main(String args[]) {
		Day1 obj=new Day1();//class object creation
		//calling display method using object 'obj'.
		
		Scanner sc=new Scanner(System.in);
		boolean x=true;
		while(x) {
			System.out.println("select an option:");
			int ch=sc.nextInt();
			
			switch (ch) {
				case 1: {
					System.out.println("Enter a number: ");
					int n1=sc.nextInt();
					
					if(n1%2==0) {
						System.out.println("Even");
						break;
					}
					else {
						System.out.println("Odd");
						break;
					}
				}
				case 2:{
					//to check whether a number is positive (IF STATEMENT - no else).
					System.out.println("Enter a number: ");
					int n1=sc.nextInt();
					if(n1>=0) {
						System.out.println("number is positive");
					}
					break;
				}
				case 3:{
					//person is eligible to vote
					System.out.println("Enter your Age: ");
					int age=sc.nextInt();
					if(age>=18) {
						System.out.println("Eligible to vote");
						break;
					} else {
					    System.out.println("Not eligible to vote");
					    break;
					}
				}
				case 4:{
					System.out.println("Enter a number: ");
					int num1=sc.nextInt();
					System.out.println("Enter a number: ");
					int num2=sc.nextInt();
					if(num1>num2) {
						System.out.println(num1+" is Largest");
						break;
					}else {
						System.out.println(num2+" is Largest");
						break;
					}
				}
				case 5:{
					//print numbers from 1 to 10.
		
					for(int i=1;i<=10;i++) {
						System.out.println(i);
					}
					break;
				}
				case 6:{
					//print even numbers from 1 to 50.
					for(int i=1;i<=50;i++) {
						if(i%2==0) {
							System.out.println(i);
						}
					}
					break;
				}
				case 7:{
					//reverse a number.
					System.out.println("enter a number");
					int n=sc.nextInt();
					System.out.println("Reversed number: "+obj.reverseNumber(n));
					break;
				}
				case 8:{
					//check whether a number is palindrome.
					System.out.println("enter a number");
					int n=sc.nextInt();
					int rev=obj.reverseNumber(n);
					if(n==rev) {
						System.out.println("number is palindrome.");
					} else {
						System.out.println("number is 'not' palindrome.");
					}
					break;
				}
				case 9:{
					//print numbers from 1 to 10 using do-while.
					int i=1;
					do {
						System.out.println(i);
						i++;
					}while(i<=10);
					break;
				}
				case 10:{
					//to display menu until user selects Exit.
					String str;
					do {
						System.out.print("select an option:");
						str=sc.next();
					}while(!str.equals("exit"));
					break;
				}
				case 11:{
					//to print all elements of an array.
					int[] arr= {1,2,3,4,5};
					for(int i:arr) {
						System.out.println(i);
					}
					break;
				}
				case 12:{
					//to calculate sum of array elements.
					int[] arr= {1,2,3,4,5};
					int total=0;
					for(int i:arr) {
						total+=i;
					}
					System.out.println(total);
					break;
				}
				case 13:{
					//to stop loop when number 5 is encountered.
					for(int i=0;i<10;i++) {
						if(i==5) {
							break;
						}
						System.out.println(i);
					}
					break;
				}
				case 14:{
					//to search an element and break when found.
					int[] arr= {1,2,3,4,5};
					int key=3;
					for(int i:arr) {
						if(i==key) {
							System.out.println("element is found");
							break;
						}
					}
					break;
				}
				case 15:{
					//skip printing even numbers.
					for(int i=1;i<=10;i++) {
						if(i%2==0) {
							continue;
						}
						System.out.println(i);
					}
					break;
				}
				case 16:{
					// to skip number 7 while printing 1 to 20.
					for(int i=1;i<=20;i++) {
						if(i==7) {
							continue;
						}
						System.out.println(i);
					}
					break;
				}
				case 17:{
					//a method returns sum of two numbers.
					int n1=sc.nextInt();
					int n2=sc.nextInt();
					
					System.out.println(obj.sumOF2num(n1, n2));
					break;
				}
				case 18:{
					//to return factorial of a number.
					int n=sc.nextInt();
					System.out.println(obj.factorial(n));
					break;
				}
				case 19:{
					//to print "Good Morning" if time is before 12.
					System.out.println("Enter time (0-23): ");
					int time=sc.nextInt();
					if(time<12) {
						System.out.println("Good Morning");
					}
					break;
				}
				case 20:{
					//to check if a number is greater than 100.
					System.out.println("Enter a number: ");
					int n1=sc.nextInt();
					if(n1>100) {
						System.out.println("Number is greater than 100");
					}
					break;
				}
				case 21:{
					//to check if a student has passed internal assessment (marks >= 20).
					System.out.println("Enter marks: ");
					int marks=sc.nextInt();
					if(marks>=20) {
						System.out.println("Student has passed internal assessment");
					}
					break;
				}
				case 22:{
					//to print "Eligible for exam" if attendance is >= 75%.
					System.out.println("Enter attendance percentage: ");
					int attendance=sc.nextInt();
					if(attendance>=75) {
						System.out.println("Eligible for exam");
					}
					break;
				}
				case 23:{
					//to check if a number is divisible by 3 (IF-THEN).
					System.out.println("Enter a number: ");
					int n1=sc.nextInt();
					if(n1%3==0) {
						System.out.println("Number is divisible by 3");
					}
					break;
				}
				case 24:{
					//to display "Discount Applied" if bill amount is above ₹5000.
					System.out.println("Enter bill amount: ");
					int bill=sc.nextInt();
					if(bill>5000) {
						System.out.println("Discount Applied");
					}
					break;
				}
				case 25:{
					//to check if a character is a vowel.
					System.out.println("Enter a character: ");
					char c=sc.next().charAt(0);
					if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
						System.out.println("Character is a vowel");
					}
					break;
				}
				case 26:{
					//to print "Welcome Admin" if user role is admin.
					System.out.println("Enter user role: ");
					String role=sc.next();
					if(role.equals("admin")) {
						System.out.println("Welcome Admin");
					}
					break;
				}
				case 27:{
					//to check whether a number is positive or negative.
					System.out.println("Enter a number: ");
					int n1=sc.nextInt();
					if(n1>=0) {
						System.out.println("Number is positive");
					} else {
						System.out.println("Number is negative");
					}
					break;
				}
				case 28:{
					//to check pass or fail based on marks.
					System.out.println("Enter marks: ");
					int marks=sc.nextInt();
					if(marks>=40) {
						System.out.println("Pass");
					} else {
						System.out.println("Fail");
					}
					break;
				}
				case 29:{
					//to check eligibility for driving license.
					System.out.println("Enter your Age: ");
					int age=sc.nextInt();
					if(age>=18) {
						System.out.println("Eligible for driving license");
					} else {
						System.out.println("Not eligible for driving license");
					}
					break;
				}
				case 30:{
					//to print day name based on day number.
					System.out.println("Enter day number (1-7): ");
					int day=sc.nextInt();
					switch(day) {
						case 1: System.out.println("Monday"); break;
						case 2: System.out.println("Tuesday"); break;
						case 3: System.out.println("Wednesday"); break;
						case 4: System.out.println("Thursday"); break;
						case 5: System.out.println("Friday"); break;
						case 6: System.out.println("Saturday"); break;
						case 7: System.out.println("Sunday"); break;
						default: System.out.println("Invalid day number"); break;
					}
					break;
				}
				case 31:{
					//simple calculator using switch.
					System.out.println("Enter first number: ");
					int num1=sc.nextInt();
					System.out.println("Enter second number: ");
					int num2=sc.nextInt();
					System.out.println("Enter operator (+, -, *, /): ");
					char op=sc.next().charAt(0);
					switch(op) {
						case '+': System.out.println("Result: "+(num1+num2)); break;
						case '-': System.out.println("Result: "+(num1-num2)); break;
						case '*': System.out.println("Result: "+(num1*num2)); break;
						case '/': System.out.println("Result: "+(num1/num2)); break;
						default: System.out.println("Invalid operator"); break;
					}
					break;
				}
				case 32:{
					//to display month name based on month number.
					System.out.println("Enter month number (1-12): ");
					int month=sc.nextInt();
					switch(month) {
						case 1: System.out.println("January"); break;
						case 2: System.out.println("February"); break;
						case 3: System.out.println("March"); break;
						case 4: System.out.println("April"); break;
						case 5: System.out.println("May"); break;
						case 6: System.out.println("June"); break;
						case 7: System.out.println("July"); break;
						case 8: System.out.println("August"); break;
						case 9: System.out.println("September"); break;
						case 10: System.out.println("October"); break;
						case 11: System.out.println("November"); break;
						case 12: System.out.println("December"); break;
						default: System.out.println("Invalid month number"); break;
					}
					break;
				}
				case 33:{
					//menu-driven food ordering system.
					System.out.println("Menu: 1-Pizza, 2-Burger, 3-Pasta, 4-Salad");
					System.out.println("Enter your choice: ");
					int choice=sc.nextInt();
					switch(choice) {
						case 1: System.out.println("You ordered Pizza"); break;
						case 2: System.out.println("You ordered Burger"); break;
						case 3: System.out.println("You ordered Pasta"); break;
						case 4: System.out.println("You ordered Salad"); break;
						default: System.out.println("Invalid choice"); break;
					}
					break;
				}
				case 34:{
					//to display grade (A/B/C/D) based on marks using switch.
					System.out.println("Enter marks: ");
					int marks=sc.nextInt();
					int gradeRange = (marks >= 90) ? 1 : (marks >= 75) ? 2 : (marks >= 60) ? 3 : 4;
					switch(gradeRange) {
						case 1: System.out.println("Grade: A"); break;
						case 2: System.out.println("Grade: B"); break;
						case 3: System.out.println("Grade: C"); break;
						case 4: System.out.println("Grade: D"); break;
					}
					break;
				}
				case 35:{
					//to calculate sum of first 10 numbers.
					int sum=0;
					for(int i=1;i<=10;i++) {
						sum+=i;
					}
					System.out.println("Sum of first 10 numbers: "+sum);
					break;
				}
				case 36:{
					//to print multiplication table of a given number.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					for(int i=1;i<=10;i++) {
						System.out.println(n+" x "+i+" = "+(n*i));
					}
					break;
				}
				case 37:{
					//to print numbers in reverse order.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					for(int i=n;i>=1;i--) {
						System.out.println(i);
					}
					break;
				}
				case 38:{
					//to print numbers from 1 to N.
					System.out.println("Enter N: ");
					int n=sc.nextInt();
					int i=1;
					while(i<=n) {
						System.out.println(i);
						i++;
					}
					break;
				}
				case 39:{
					//to calculate sum of digits of a number.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					int sum=0;
					while(n!=0) {
						sum+=n%10;
						n/=10;
					}
					System.out.println("Sum of digits: "+sum);
					break;
				}
				case 40:{
					//to count number of digits in a number.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					int count=0;
					while(n!=0) {
						count++;
						n/=10;
					}
					System.out.println("Number of digits: "+count);
					break;
				}
				case 41:{
					//to validate PIN number.
					int pin=1234;
					int enteredPin;
					do {
						System.out.println("Enter PIN: ");
						enteredPin=sc.nextInt();
						if(enteredPin==pin) {
							System.out.println("PIN validated successfully");
							break;
						} else {
							System.out.println("Invalid PIN. Try again.");
						}
					}while(true);
					break;
				}
				case 42:{
					//to keep asking input until correct password is entered.
					String password="admin123";
					String enteredPassword;
					do {
						System.out.println("Enter password: ");
						enteredPassword=sc.next();
						if(enteredPassword.equals(password)) {
							System.out.println("Password correct!");
							break;
						} else {
							System.out.println("Wrong password. Try again.");
						}
					}while(true);
					break;
				}
				case 43:{
					//to calculate factorial using do-while loop.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					int fact=1;
					int i=1;
					do {
						fact*=i;
						i++;
					}while(i<=n);
					System.out.println("Factorial: "+fact);
					break;
				}
				case 44:{
					//to find largest element in an array.
					int[] arr= {10,25,5,30,15};
					int max=arr[0];
					for(int i:arr) {
						if(i>max) {
							max=i;
						}
					}
					System.out.println("Largest element: "+max);
					break;
				}
				case 45:{
					//to print student names stored in an array.
					String[] names= {"Alice","Bob","Charlie","Diana"};
					for(String name:names) {
						System.out.println(name);
					}
					break;
				}
				case 46:{
					//to count even numbers in an array.
					int[] arr= {1,2,3,4,5,6,7,8,9,10};
					int count=0;
					for(int i:arr) {
						if(i%2==0) {
							count++;
						}
					}
					System.out.println("Count of even numbers: "+count);
					break;
				}
				case 47:{
					//to exit loop when user enters 0.
					int num;
					while(true) {
						System.out.println("Enter a number (0 to exit): ");
						num=sc.nextInt();
						if(num==0) {
							System.out.println("Exiting...");
							break;
						}
						System.out.println("You entered: "+num);
					}
					break;
				}
				case 48:{
					//to stop printing numbers after 50.
					for(int i=1;i<=100;i++) {
						if(i>50) {
							break;
						}
						System.out.println(i);
					}
					break;
				}
				case 49:{
					//to terminate loop on negative input.
					int num;
					while(true) {
						System.out.println("Enter a number (negative to exit): ");
						num=sc.nextInt();
						if(num<0) {
							System.out.println("Negative number entered. Exiting...");
							break;
						}
						System.out.println("You entered: "+num);
					}
					break;
				}
				case 50:{
					//to skip multiples of 5.
					for(int i=1;i<=20;i++) {
						if(i%5==0) {
							continue;
						}
						System.out.println(i);
					}
					break;
				}
				case 51:{
					//to skip printing negative numbers.
					int[] arr= {1,-2,3,-4,5,-6,7};
					for(int i:arr) {
						if(i<0) {
							continue;
						}
						System.out.println(i);
					}
					break;
				}
				case 52:{
					//to skip a particular student roll number.
					int[] rollNumbers= {1,2,3,4,5,6,7,8,9,10};
					int skipRoll=5;
					for(int roll:rollNumbers) {
						if(roll==skipRoll) {
							continue;
						}
						System.out.println("Roll Number: "+roll);
					}
					break;
				}
				case 53:{
					//to return square of a number.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					System.out.println("Square: "+obj.square(n));
					break;
				}
				case 54:{
					//to return maximum of two numbers.
					System.out.println("Enter first number: ");
					int n1=sc.nextInt();
					System.out.println("Enter second number: ");
					int n2=sc.nextInt();
					System.out.println("Maximum: "+obj.maxOf2(n1, n2));
					break;
				}
				case 55:{
					//to check prime number using return.
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					if(obj.isPrime(n)) {
						System.out.println("Number is prime");
					} else {
						System.out.println("Number is not prime");
					}
					break;
				}
				case 56:{
					//exit
					System.out.println("thanks for using the program...");
					x=false;
					break;
				}
				default:{
						System.out.println("invalid option");
						break;
					}
			}
		}
		
		
		

	}
}
