import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interace = 1.0;

        System.out.println("Nhập số tiền gửi: ");
        money = input.nextDouble();

        System.out.println("Nhập số tháng gửi: ");
        month = input.nextInt();

        System.out.println("Nhập lãi suất : ");
        interace = input.nextDouble();

        double totalinterace = 0;
        for (int i = 0 ; i < month; i++) {
            totalinterace += money * (interace/100)/12 * month;
        }

        System.out.println("Tổng số tiền lãi: " + totalinterace);
    }
}
