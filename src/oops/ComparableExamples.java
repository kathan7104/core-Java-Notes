/**
 * Comprehensive Comparable Interface Examples
 * This file demonstrates all aspects of the Comparable interface
 */
package oops;

import java.util.*;

/**
 * Question 1: Student class implementing Comparable to sort by id
 */
class StudentById implements Comparable<StudentById> {
    int id;
    String name;
    double marks;

    public StudentById(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentById other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

/**
 * Question 2: Student class implementing Comparable to sort by marks
 */
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

/**
 * Question 3: Employee class implementing Comparable to sort by salary
 */
class Employee implements Comparable<Employee> {
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

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + department + "]";
    }
}

/**
 * Question 4: Student class for name sorting using Comparable
 */
class StudentByName implements Comparable<StudentByName> {
    int id;
    String name;
    double marks;

    public StudentByName(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(StudentByName other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }
}

/**
 * Question 9: Class without Comparable implementation (for ClassCastException demo)
 */
class StudentWithoutComparable {
    int id;
    String name;

    public StudentWithoutComparable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}

/**
 * Question 7: Student class for TreeMap key using Comparable
 */
class StudentForTreeMap implements Comparable<StudentForTreeMap> {
    int id;
    String name;

    public StudentForTreeMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(StudentForTreeMap other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentForTreeMap that = (StudentForTreeMap) obj;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class ComparableExamples {

    public static void main(String[] args) {
        System.out.println("=== COMPARABLE INTERFACE EXAMPLES ===\n");

        // Question 1: Sort students by id using Comparable
        System.out.println("1. Sorting Students by ID using Comparable:");
        List<StudentById> studentsById = new ArrayList<>();
        studentsById.add(new StudentById(103, "Alice", 85.5));
        studentsById.add(new StudentById(101, "Bob", 92.0));
        studentsById.add(new StudentById(102, "Charlie", 78.5));
        System.out.println("Before sorting: " + studentsById);
        Collections.sort(studentsById);
        System.out.println("After sorting by ID: " + studentsById);
        System.out.println();

        // Question 2: Sort students by marks using Comparable
        System.out.println("2. Sorting Students by Marks using Comparable:");
        List<StudentByMarks> studentsByMarks = new ArrayList<>();
        studentsByMarks.add(new StudentByMarks(1, "Alice", 85.5));
        studentsByMarks.add(new StudentByMarks(2, "Bob", 92.0));
        studentsByMarks.add(new StudentByMarks(3, "Charlie", 78.5));
        System.out.println("Before sorting: " + studentsByMarks);
        Collections.sort(studentsByMarks);
        System.out.println("After sorting by Marks: " + studentsByMarks);
        System.out.println();

        // Question 3: Sort employees by salary using Comparable
        System.out.println("3. Sorting Employees by Salary using Comparable:");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 50000, "IT"));
        employees.add(new Employee(2, "Jane", 75000, "HR"));
        employees.add(new Employee(3, "Mike", 60000, "Finance"));
        System.out.println("Before sorting: " + employees);
        Collections.sort(employees);
        System.out.println("After sorting by Salary: " + employees);
        System.out.println();

        // Question 4: Why compareTo() is required - Demonstration
        System.out.println("4. Why compareTo() method is required in Comparable:");
        System.out.println("   - Collections.sort() needs to know HOW to compare objects");
        System.out.println("   - Without compareTo(), Java doesn't know the natural ordering");
        System.out.println("   - compareTo() defines the 'natural' or 'default' sorting order");
        System.out.println("   - Example: Collections.sort() calls compareTo() internally");
        System.out.println("   - If compareTo() is not implemented, ClassCastException occurs");
        System.out.println();

        // Question 5: Sort strings using natural ordering
        System.out.println("5. Sorting Strings using Natural Ordering (String implements Comparable):");
        List<String> names = new ArrayList<>();
        names.add("Zebra");
        names.add("Apple");
        names.add("Banana");
        names.add("Mango");
        System.out.println("Before sorting: " + names);
        Collections.sort(names); // String already implements Comparable
        System.out.println("After sorting (natural order): " + names);
        System.out.println();

        // Question 6: Demonstrate what happens if compareTo() returns 0
        System.out.println("6. What happens when compareTo() returns 0:");
        System.out.println("   - When compareTo() returns 0, objects are considered EQUAL for sorting");
        System.out.println("   - They maintain their relative order (stable sort)");
        System.out.println("   - Example with duplicate marks:");
        List<StudentByMarks> duplicateMarks = new ArrayList<>();
        duplicateMarks.add(new StudentByMarks(1, "Alice", 85.0));
        duplicateMarks.add(new StudentByMarks(2, "Bob", 85.0));
        duplicateMarks.add(new StudentByMarks(3, "Charlie", 90.0));
        System.out.println("Before sorting: " + duplicateMarks);
        Collections.sort(duplicateMarks);
        System.out.println("After sorting (both with 85.0 marks): " + duplicateMarks);
        System.out.println("   Note: Alice and Bob have same marks (compareTo returns 0)");
        System.out.println("   They maintain insertion order relative to each other");
        System.out.println();

        // Question 7: TreeMap with user-defined class as key using Comparable
        System.out.println("7. TreeMap with User-defined Class as Key using Comparable:");
        TreeMap<StudentForTreeMap, String> studentMap = new TreeMap<>();
        studentMap.put(new StudentForTreeMap(103, "Alice"), "Grade A");
        studentMap.put(new StudentForTreeMap(101, "Bob"), "Grade B");
        studentMap.put(new StudentForTreeMap(102, "Charlie"), "Grade A");
        System.out.println("TreeMap (automatically sorted by key - Student ID):");
        for (Map.Entry<StudentForTreeMap, String> entry : studentMap.entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();

        // Question 8: Sort students by name using Comparable
        System.out.println("8. Sorting Students by Name using Comparable:");
        List<StudentByName> studentsByName = new ArrayList<>();
        studentsByName.add(new StudentByName(1, "Zara", 85.5));
        studentsByName.add(new StudentByName(2, "Alice", 92.0));
        studentsByName.add(new StudentByName(3, "Bob", 78.5));
        System.out.println("Before sorting: " + studentsByName);
        Collections.sort(studentsByName);
        System.out.println("After sorting by Name: " + studentsByName);
        System.out.println();

        // Question 9: ClassCastException when Comparable is not implemented
        System.out.println("9. ClassCastException when Comparable is NOT implemented:");
        try {
            List<StudentWithoutComparable> students = new ArrayList<>();
            students.add(new StudentWithoutComparable(1, "Alice"));
            students.add(new StudentWithoutComparable(2, "Bob"));
            System.out.println("Attempting to sort without Comparable implementation...");
            Collections.sort(students); // This will throw ClassCastException
        } catch (ClassCastException e) {
            System.out.println("   ERROR: " + e.getClass().getSimpleName());
            System.out.println("   Message: " + e.getMessage());
            System.out.println("   Reason: StudentWithoutComparable does not implement Comparable");
            System.out.println("   Solution: Implement Comparable interface or use Comparator");
        }
        System.out.println();

        System.out.println("=== All Comparable Examples Completed ===");
    }
}
