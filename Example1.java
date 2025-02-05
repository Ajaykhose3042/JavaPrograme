package signimus;

import java.util.Scanner;

abstract class Shape {
    abstract public void calculateArea(Scanner sc); // Modified to accept Scanner as parameter
}

class Circle extends Shape {

    @Override
    public void calculateArea(Scanner sc) {
        System.out.println("Enter radius: ");
        int r = sc.nextInt();
        double p = 3.14;
        double area = p * (r * r);
        System.out.println("The area of circle is: " + area);
    }
}

class Rectangle extends Shape {

    int length;
    int width;

    public void takeInput(Scanner sc) {
        System.out.println("Enter the length: ");
        length = sc.nextInt();
        System.out.println("Enter the width: ");
        width = sc.nextInt();
    }

    @Override
    public void calculateArea(Scanner sc) {
        System.out.println("The area of rectangle is: " + length * width);
    }
}

public class Example1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object once in main

        Circle c = new Circle();
        c.calculateArea(sc);  // Pass the Scanner object to calculateArea method

        Rectangle r = new Rectangle();
        r.takeInput(sc);  // Pass the Scanner object to takeInput method
        r.calculateArea(sc);  // Pass the Scanner object to calculateArea method

        sc.close();  // Close Scanner at the end after use
    }
}
