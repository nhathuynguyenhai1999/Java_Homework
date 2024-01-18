import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] predefinedArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print("Nhập số cột muốn tính tổng: ");
        int columnIndex = scanner.nextInt();

        int columnSum = calculateColumnSum(predefinedArray, columnIndex);

        System.out.println("Tổng của cột " + columnIndex + " là: " + columnSum);
        System.out.print("Nhập số hàng của mảng: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int numCols = scanner.nextInt();

        int[][] userArray = new int[numRows][numCols];

        // Nhập giá trị cho mảng từ người dùng
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                userArray[i][j] = scanner.nextInt();
            }
        }

        // In mảng vừa nhập
        System.out.println("Mảng đã nhập là:");
        printArray(userArray);
    }
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int calculateColumnSum(int[][] array, int columnIndex) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][columnIndex];
        }
        return sum;
    }
}
