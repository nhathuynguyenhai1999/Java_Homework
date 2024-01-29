package James_Module2;

import java.util.Scanner;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

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

        // Sử dụng phương thức calculate
        char operator = getOperator(scanner);
        int result = calculate(num1, num2, operator);
        System.out.println("Kết quả phép tính: " + result);

        // Đóng Scanner
        scanner.close();
    }

    // Phương thức để nhận toán tử từ người dùng
    private static char getOperator(Scanner scanner) {
        System.out.print("Nhập toán tử (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // Phương thức tính toán
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Không thể chia cho 0");
            default:
                throw new RuntimeException("Phép toán không được hỗ trợ");
        }
    }
}
