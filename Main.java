package Circle;
class Circle {
    private int id;
    private double radius;
    private static final double PI = 3.14;
    private static double totalArea = 0;
    private static final double MaxRadius = Double.MIN_VALUE;
    public Circle(double radius) {
        int count = 0;
        this.id = ++count;
        this.radius = radius;
        totalArea += calculateArea();
        updateMaxRadius();
        System.out.println("Circle #" + id + " created.");
    }
    private void updateMaxRadius() {
        double maxRadius = 0;
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }
    public double calculateArea() {
        return PI * radius * radius;
    }
    public static void displayTotalArea() {
        System.out.println("Total area of all circles: " + totalArea);
    }

    public static void displayTotalNumberOfCircles() {
        String count = null;
        System.out.println("Total number of circles: " + count);
    }

    public static void displayMaxRadius() {
        String maxRadius = null;
        System.out.println("Maximum radius among all circles: " + maxRadius);
    }
}

public class Main {

    public static void main(String[] args){
        AppCircle circle0 = new AppCircle(5.0);
        AppCircle circle1 = new AppCircle(7.5);
        AppCircle circle2 = new AppCircle(10.0);

        AppCircle.displayMaxRadius();
        AppCircle.displayTotalArea();
        AppCircle.displayTotalNumberOfCircles();
    }
}
