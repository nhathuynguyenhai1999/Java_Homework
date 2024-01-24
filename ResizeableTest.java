package Main;

import java.util.Random;

// Step 2: Define Resizeable interface
interface Resizeable {
    void resize(double percent);
}

// Step 4: Implement Resizeable interface in Circle, Rectangle, Square
class Circle1 implements Resizeable {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Rectangle1 implements Resizeable {
    private double width;
    private double height;

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}

class Square1 implements Resizeable {
    private double side;

    public Square1(double side) {
        this.side = side;
    }

    public Square1(int side, String red, boolean b) {
    }

    public Square1() {
        
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }
}

public class ResizeableTest {
    public static void main(String[] args) {
        // Step 1: Test Resizeable interface
        Resizeable circle = new Circle1(5);
        Resizeable rectangle = new Rectangle1(3, 4);
        Resizeable square = new Square1(2);

        // Resize with random percentages
        Random rand = new Random();
        double percent1 = rand.nextInt(100) + 1;
        double percent2 = rand.nextInt(100) + 1;
        double percent3 = rand.nextInt(100) + 1;

        // Resize and print areas before and after
        System.out.println("Original Circle Area: " + ((Circle1) circle).getArea());
        ((Circle1) circle).resize(percent1);
        System.out.println("Resized Circle Area: " + ((Circle1) circle).getArea());

        System.out.println("Original Rectangle Area: " + ((Rectangle1) rectangle).getArea());
        ((Rectangle1) rectangle).resize(percent2);
        System.out.println("Resized Rectangle Area: " + ((Rectangle1) rectangle).getArea());

        System.out.println("Original Square Area: " + ((Square1) square).getArea());
        ((Square1) square).resize(percent3);
        System.out.println("Resized Square Area: " + ((Square1) square).getArea());
    }
}

