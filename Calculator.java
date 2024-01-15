import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();

        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();

        // Thực hiện các phép toán
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Kiểm tra nếu số thứ hai là 0 để tránh chia cho 0
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            System.out.println("Kết quả phép chia: " + quotient);
        } else {
            System.out.println("Không thể chia cho 0.");
        }

        // Hiển thị kết quả
        System.out.println("Kết quả phép cộng: " + sum);
        System.out.println("Kết quả phép trừ: " + difference);
        System.out.println("Kết quả phép nhân: " + product);

        // Đóng Scanner
        scanner.close();
    }
}