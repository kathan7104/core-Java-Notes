/**
 * Comprehensive Comparator Interface Examples
 * This file demonstrates all aspects of the Comparator interface
 */
package oops;

import java.util.*;

/**
 * Student class for Comparator examples
 */
class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

/**
 * Employee class for Comparator examples
 */
class Employee {
    int id;
    String name;
    double salary;
    String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + department + "]";
    }
}

/**
 * Question 1: Comparator to sort students by name
 */
class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

/**
 * Question 2: Comparator to sort students by marks in descending order
 */
class StudentMarksDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getMarks(), s1.getMarks()); // Descending order
    }
}

/**
 * Question 4: Comparator to sort employees by name
 */
class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

/**
 * Question 4: Comparator to sort employees by salary
 */
class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

/**
 * Question 4: Comparator to sort employees by department
 */
class EmployeeDepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

/**
 * Question 7: Unmodifiable class (for demonstrating Comparator usefulness)
 */
final class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}

public class ComparatorExamples {

    public static void main(String[] args) {
        System.out.println("=== COMPARATOR INTERFACE EXAMPLES ===\n");

        // Question 1: Sort students by name using Comparator
        System.out.println("1. Sorting Students by Name using Comparator:");
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Zara", 85.5));
        students1.add(new Student(2, "Alice", 92.0));
        students1.add(new Student(3, "Bob", 78.5));
        System.out.println("Before sorting: " + students1);
        Collections.sort(students1, new StudentNameComparator());
        System.out.println("After sorting by Name: " + students1);
        System.out.println();

        // Question 2: Sort students by marks in descending order using Comparator
        System.out.println("2. Sorting Students by Marks (Descending) using Comparator:");
        List<Student> students2 = new ArrayList<>();
        students2.add(new Student(1, "Alice", 85.5));
        students2.add(new Student(2, "Bob", 92.0));
        students2.add(new Student(3, "Charlie", 78.5));
        System.out.println("Before sorting: " + students2);
        Collections.sort(students2, new StudentMarksDescComparator());
        System.out.println("After sorting by Marks (Descending): " + students2);
        System.out.println();

        // Question 3: Multiple Comparator classes for different sorting logic
        System.out.println("3. Multiple Comparator Classes for Different Sorting Logic:");
        List<Student> students3 = new ArrayList<>();
        students3.add(new Student(3, "Charlie", 78.5));
        students3.add(new Student(1, "Alice", 92.0));
        students3.add(new Student(2, "Bob", 85.5));

        System.out.println("Original list: " + students3);

        // Sort by ID
        Collections.sort(students3, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        System.out.println("Sorted by ID: " + students3);

        // Sort by Name
        Collections.sort(students3, new StudentNameComparator());
        System.out.println("Sorted by Name: " + students3);

        // Sort by Marks
        Collections.sort(students3, new StudentMarksDescComparator());
        System.out.println("Sorted by Marks (Desc): " + students3);
        System.out.println();

        // Question 4: Sort employees by name, salary, and department using separate Comparators
        System.out.println("4. Sorting Employees by Name, Salary, and Department:");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000, "IT"));
        employees.add(new Employee(2, "Alice", 75000, "HR"));
        employees.add(new Employee(3, "Bob", 60000, "Finance"));

        System.out.println("Original list: " + employees);

        // Sort by Name
        List<Employee> empByName = new ArrayList<>(employees);
        Collections.sort(empByName, new EmployeeNameComparator());
        System.out.println("Sorted by Name: " + empByName);

        // Sort by Salary
        List<Employee> empBySalary = new ArrayList<>(employees);
        Collections.sort(empBySalary, new EmployeeSalaryComparator());
        System.out.println("Sorted by Salary: " + empBySalary);

        // Sort by Department
        List<Employee> empByDept = new ArrayList<>(employees);
        Collections.sort(empByDept, new EmployeeDepartmentComparator());
        System.out.println("Sorted by Department: " + empByDept);
        System.out.println();

        // Question 5: Anonymous Comparator class
        System.out.println("5. Using Anonymous Comparator Class:");
        List<Student> students5 = new ArrayList<>();
        students5.add(new Student(1, "Alice", 85.5));
        students5.add(new Student(2, "Bob", 92.0));
        students5.add(new Student(3, "Charlie", 78.5));
        System.out.println("Before sorting: " + students5);

        Collections.sort(students5, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getId(), s2.getId());
            }
        });
        System.out.println("After sorting by ID (anonymous Comparator): " + students5);
        System.out.println();

        // Question 6: Lambda expression to implement Comparator
        System.out.println("6. Using Lambda Expression to Implement Comparator:");
        List<Student> students6 = new ArrayList<>();
        students6.add(new Student(3, "Charlie", 78.5));
        students6.add(new Student(1, "Alice", 92.0));
        students6.add(new Student(2, "Bob", 85.5));
        System.out.println("Before sorting: " + students6);

        // Lambda expression for sorting by marks
        Collections.sort(students6, (s1, s2) -> Double.compare(s1.getMarks(), s2.getMarks()));
        System.out.println("After sorting by Marks (lambda): " + students6);

        // Lambda expression for sorting by name
        Collections.sort(students6, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("After sorting by Name (lambda): " + students6);
        System.out.println();

        // Question 7: Show how Comparator helps when source class cannot be modified
        System.out.println("7. Comparator helps when Source Class Cannot be Modified:");
        System.out.println("   Example: Product class is final and unmodifiable");
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 50000));
        products.add(new Product(1, "Mouse", 500));
        products.add(new Product(2, "Keyboard", 2000));
        System.out.println("Original products: " + products);

        // We can't modify Product class, but we can use Comparator
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });
        System.out.println("Sorted by Price (using Comparator): " + products);
        System.out.println("   Note: Product class doesn't implement Comparable,");
        System.out.println("   but we can still sort it using Comparator!");
        System.out.println();

        // Question 8: Comparator with TreeMap
        System.out.println("8. Using Comparator with TreeMap:");
        // TreeMap with custom Comparator (sorting by value length in reverse)
        TreeMap<String, Integer> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length()); // Descending by length
            }
        });
        map1.put("Apple", 1);
        map1.put("Banana", 2);
        map1.put("Kiwi", 3);
        map1.put("Orange", 4);
        System.out.println("TreeMap sorted by key length (descending): " + map1);

        // TreeMap with Student as key using Comparator
        TreeMap<Student, String> studentMap = new TreeMap<>(new StudentNameComparator());
        studentMap.put(new Student(3, "Charlie", 78.5), "Grade C");
        studentMap.put(new Student(1, "Alice", 92.0), "Grade A");
        studentMap.put(new Student(2, "Bob", 85.5), "Grade B");
        System.out.println("TreeMap with Student as key (sorted by name):");
        for (Map.Entry<Student, String> entry : studentMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        // Question 9: Reverse sorting using Collections.reverseOrder() with Comparator
        System.out.println("9. Reverse Sorting using Collections.reverseOrder() with Comparator:");
        List<Student> students9 = new ArrayList<>();
        students9.add(new Student(1, "Alice", 85.5));
        students9.add(new Student(2, "Bob", 92.0));
        students9.add(new Student(3, "Charlie", 78.5));
        System.out.println("Original list: " + students9);

        // Normal sorting by marks
        Collections.sort(students9, new StudentMarksDescComparator());
        System.out.println("Sorted by Marks (Descending): " + students9);

        // Reverse the comparator
        Collections.sort(students9, Collections.reverseOrder(new StudentMarksDescComparator()));
        System.out.println("Reversed (now Ascending): " + students9);

        // Using reverseOrder with natural ordering
        List<String> names = new ArrayList<>(Arrays.asList("Zebra", "Apple", "Banana"));
        Collections.sort(names);
        System.out.println("Names sorted (natural): " + names);
        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Names sorted (reversed): " + names);
        System.out.println();

        // Question 10: Compare Comparable vs Comparator with same data
        System.out.println("10. Comparing Comparable vs Comparator with Same Data:");
        
        // Using Comparable (StudentByMarks from ComparableExamples)
        System.out.println("   Using Comparable (natural/default sorting):");
        List<StudentByMarks> compStudents = new ArrayList<>();
        compStudents.add(new StudentByMarks(1, "Alice", 85.5));
        compStudents.add(new StudentByMarks(2, "Bob", 92.0));
        compStudents.add(new StudentByMarks(3, "Charlie", 78.5));
        System.out.println("   Before sorting: " + compStudents);
        Collections.sort(compStudents); // Uses compareTo() from Comparable
        System.out.println("   After sorting (by marks - Comparable): " + compStudents);
        System.out.println("   Note: Can only sort by ONE criteria (marks)");

        // Using Comparator
        System.out.println("\n   Using Comparator (flexible sorting):");
        List<Student> compStudents2 = new ArrayList<>();
        compStudents2.add(new Student(1, "Alice", 85.5));
        compStudents2.add(new Student(2, "Bob", 92.0));
        compStudents2.add(new Student(3, "Charlie", 78.5));
        System.out.println("   Before sorting: " + compStudents2);
        
        Collections.sort(compStudents2, new StudentNameComparator());
        System.out.println("   After sorting by Name (Comparator): " + compStudents2);
        
        Collections.sort(compStudents2, new StudentMarksDescComparator());
        System.out.println("   After sorting by Marks Desc (Comparator): " + compStudents2);
        System.out.println("   Note: Can sort by MULTIPLE criteria (name, marks, id, etc.)");

        System.out.println("\n   Key Differences:");
        System.out.println("   - Comparable: Single natural ordering, modify source class");
        System.out.println("   - Comparator: Multiple orderings, no need to modify source class");
        System.out.println("   - Comparable: compareTo() method");
        System.out.println("   - Comparator: compare() method");
        System.out.println();

        System.out.println("=== All Comparator Examples Completed ===");
    }
}

// Helper class for Question 10 (referenced from ComparableExamples)
class StudentByMarks implements Comparable<StudentByMarks> {
    int id;
    String name;
    double marks;

    public StudentByMarks(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentByMarks other) {
        return Double.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}
