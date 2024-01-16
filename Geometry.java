import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice != 0){
            System.out.println("Menu");
            System.out.println("1. Vẽ hình tam giác");
            System.out.println("2. Vẽ hình vuông");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Nhập số lựa chọn của bạn: ");
            choice = scanner.nextInt();
        }
        switch (choice){
            case 1:
                System.out.println("Vẽ hình tam giác");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Vẽ hình vuông");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Vẽ hình chữ nhật");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
        if (choice == 1) {
            System.out.println("Vẽ hình tam giác");
            System.out.println("******");
            System.out.println("*****");
            System.out.println("****");
            System.out.println("***");
            System.out.println("**");
            System.out.println("*");
        } else if (choice == 2) {
            System.out.println("Vẽ hình vuông");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
        } else if (choice == 3) {
            System.out.println("Vẽ hình chữ nhật");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
            System.out.println("* * * * * *");
        } else if (choice == 0) {
            System.exit(0);
        } else {
            System.out.println("No choice!");
        }
    }
}
