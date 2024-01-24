package Main;

import java.util.Arrays;

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
        super(); // Call the default constructor of the superclass
    }

    public ComparableCircle(double radius) {
        super(radius); // Call the constructor of the superclass with a parameter
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled); // Call the constructor of the superclass with parameters
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
