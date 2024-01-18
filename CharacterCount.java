import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        // Bước 1: Khai báo một chuỗi và gán giá trị
        String inputString = "Hello, World!"; // Bạn có thể thay đổi giá trị theo mong muốn

        // Bước 2: Khai báo một biến ký tự và nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char targetChar = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0
        int count = 0;

        // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi
        for (int i = 0; i < inputString.length(); i++) {
            // So sánh nếu ký tự trong chuỗi bằng ký tự nhập vào, tăng biến đếm lên 1
            if (inputString.charAt(i) == targetChar) {
                count++;
            }
        }

        // In kết quả
        System.out.println("Số lần xuất hiện của ký tự '" + targetChar + "' trong chuỗi là: " + count);
    }
}
