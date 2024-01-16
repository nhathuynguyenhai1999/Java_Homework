import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();


            if (choice == 1 || choice == 2 || choice == 3) {
                printShape(choice);
            } else if (choice == 0) {
                System.out.println("Exiting Program. Goodbye!!!");
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 0);

        scanner.close();
    }

    public static void printShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Printing the rectangle:");
                System.out.println("********");
                System.out.println("********");
                System.out.println("********");
                break;
            case 2:
                System.out.println("Printing the square triangle:");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                break;
            case 3:
                System.out.println("Printing the isosceles triangle:");
                System.out.println("   *");
                System.out.println("  ***");
                System.out.println(" *****");
                System.out.println("*******");
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }

    private static void printRectangle() {
        System.out.println("Printing the rectangle:");
        System.out.println("********");
        System.out.println("********");
        System.out.println("********");
    }

    private static void printSquareTriangle() {
        System.out.println("Printing the square triangle:");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }

    private static void printIsoscelesTriangle() {
        System.out.println("Printing the isosceles triangle:");
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
    }
}
