package matrix;

import java.util.Scanner;

public class MaxElementMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
        int rows = 3; // Số hàng của ma trận
        int cols = 3; // Số cột của ma trận

        // Khởi tạo ma trận có sẵn
        int[][] matrix = {
                {1, 5, 3},
                {8, 2, 4},
                {6, 7, 9}
        };

        double maxElement = matrix[0][0]; // Giả sử phần tử đầu tiên là lớn nhất
        int maxRow = 0;
        int maxCol = 0;

        // Duyệt qua từng phần tử của ma trận
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Phần tử lớn nhất của ma trận: " + maxElement);
        System.out.println("Tọa độ: hàng " + maxRow + ", cột " + maxCol);

        // Bước 2: Thu thập đầu vào từ người dùng
        System.out.println("\nNhập kích thước ma trận:");

        System.out.print("Nhập số hàng: ");
        rows = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        cols = scanner.nextInt();

        // Khởi tạo ma trận từ nhập liệu của người dùng
        int[][] userMatrix = new int[rows][cols];

        System.out.println("Nhập giá trị cho từng phần tử của ma trận:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập giá trị tại hàng " + i + ", cột " + j + ": ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // Hiển thị ma trận nhập liệu từ người dùng
        System.out.println("\nMa trận nhập liệu từ người dùng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Đóng Scanner
        scanner.close();
    }
}
