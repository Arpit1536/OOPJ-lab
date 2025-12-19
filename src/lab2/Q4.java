package lab2;

import java.util.Scanner;

class Q4{
    double length;
    double breadth;

    // Method to read values
    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    // Method to calculate and print area
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    // Method to calculate and print perimeter
    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle = " + perimeter);
    }


    public static void main(String[] args) {
        Q4 r = new Q4();
        r.read();
        r.calculateArea();
        r.calculatePerimeter();
    }
}