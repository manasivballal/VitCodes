package Module1;
/*Write a Java program to find complex addition using method overloading
a . Create a class complex
b. Create a parameterized constructor to get the real and imaginary part of the number.
C. Create a parameterized constructor which initializes
the real and imaginary part of the complex number
d. Create a add method to pass the parameter as real and imaginary part of the number,
do the addition and it returns complex number.
e. Create another add method to pass the object of complex class perform
the addition and it returns complex number.
f. Display the output.
*/
// Complex.java
public class Complex {
    private double real;
    private double imag;

    // Parameterized constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add using real and imaginary parts
    public Complex add(double real, double imag) {
        return new Complex(this.real + real, this.imag + imag);
    }

    // Overloaded method to add using another Complex object
    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    // Display method
    public void display() {
        System.out.println(this.real + " + " + this.imag + "i");
    }

    // Main method for testing
    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 2.5);  // First complex number
        Complex c2 = new Complex(1.5, 4.5);  // Second complex number

        // Using add method with real and imaginary parts
        Complex result1 = c1.add(2.0, 3.0);
        System.out.print("Addition using real and imaginary values: ");
        result1.display();

        // Using add method with Complex object
        Complex result2 = c1.add(c2);
        System.out.print("Addition using Complex object: ");
        result2.display();
    }
}
