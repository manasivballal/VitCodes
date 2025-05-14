package Module1;
/*Write a Java program to create a class called
Student with three overloaded constructors:
a. The default constructor initializes the register number and name fields
b. The parameterized constructor initializes the register number, name, mark fields.
c. Copy constructor that takes an object of type student and
   copies its value into the new object.
*/

// Student.java
public class Student {
    private int regNo;
    private String name;
    private float mark;

    // Default constructor
    public Student() {
        this.regNo = 0;
        this.name = "Unknown";
        this.mark = 0.0f;
    }

    // Parameterized constructor
    public Student(int regNo, String name, float mark) {
        this.regNo = regNo;
        this.name = name;
        this.mark = mark;
    }

    // Copy constructor
    public Student(Student other) {
        this.regNo = other.regNo;
        this.name = other.name;
        this.mark = other.mark;
    }

    // Method to display student details
    public void display() {
        System.out.println("Register Number: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("-------------------------");
    }

    // Main method to demonstrate constructors
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student(101, "Alice", 89.5f);
        System.out.println("Parameterized Constructor:");
        s2.display();

        // Using copy constructor
        Student s3 = new Student(s2);
        System.out.println("Copy Constructor:");
        s3.display();
    }
}
