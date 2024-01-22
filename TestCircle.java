package Circle;

class AppCircle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static int count = 0;
    private static double totalArea = 0;
    private static double maxRadius = Double.MIN_VALUE;

    public AppCircle(double radius) {
        this.id = ++count;
        this.radius = radius;
        totalArea += calculateArea();
        updateMaxRadius();
        System.out.println("Circle #" + id + " created.");
    }

    private void updateMaxRadius() {
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public static void displayTotalArea() {
        System.out.println("Total area of all circles: " + totalArea);
    }

    public static void displayTotalNumberOfCircles() {
        System.out.println("Total number of circles: " + count);
    }

    public static void displayMaxRadius() {
        System.out.println("Maximum radius among all circles: " + maxRadius);
    }
}

public class TestCircle {
    public static void main(String[] args) {
        AppCircle circle1 = new AppCircle(5.0);
        AppCircle circle2 = new AppCircle(7.5);
        AppCircle circle3 = new AppCircle(10.0);

        AppCircle.displayTotalNumberOfCircles();
        AppCircle.displayTotalArea();
        AppCircle.displayMaxRadius();
    }
}

