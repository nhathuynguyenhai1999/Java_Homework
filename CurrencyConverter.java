import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// Nhập giá trị tiền USD
        System.out.print("Nhập giá trị tiền USD: ");
        double usdAmount = scanner.nextDouble();

        // Nhập tỉ giá chuyển đổi
        System.out.print("Nhập tỉ giá chuyển đổi (1 USD = ? VND): ");
        double exchangeRate = scanner.nextDouble();

        // Tính toán giá trị tiền VNĐ
        double vndAmount = usdAmount * exchangeRate;

        // Hiển thị kết quả
        System.out.println("Giá trị tiền VNĐ tương ứng: " + vndAmount + " VND");

        // Đóng Scanner
        scanner.close();
    }
}
