package LopVaMangDoituong;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return Double.NaN; // No real roots
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return Double.NaN; // No real roots
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào các hệ số a, b, c của phương trình ax^2 + bx + c = 0:");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("Nghiệm 1: " + equation.getRoot1());
            System.out.println("Nghiệm 2: " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("Phương trình có 1 nghiệm kép: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
    }
}
