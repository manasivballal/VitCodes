package Module1;
// Write a Java program to get the name, age,
// designation and salary of the person from the user and
// display the output in standard output device.

import java.util.Scanner;

public class Person_Details {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Designation");
        String Designation = sc.nextLine();

        System.out.println("Enter your Salary");
        int salary = sc.nextInt();

        System.out.println("----Person Details-----");

        System.out.println("Name=" + name);
        System.out.println("Age=" + age);
        System.out.println("Designation=" + Designation);
        System.out.println("Salary="+salary);



    }
}
