import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] predefinedArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] squareMatrix = {
                {2, 4, 6},
                {1, 3, 5},
                {7, 9, 11}
        };

        // Bước 1: Tính tổng của cột trong mảng predefinedArray
        System.out.print("Nhập số cột muốn tính tổng (mảng predefinedArray): ");
        int columnIndex = scanner.nextInt();
        int columnSumPredefinedArray = calculateColumnSum(predefinedArray, columnIndex);
        System.out.println("Tổng của cột " + columnIndex + " trong mảng predefinedArray là: " + columnSumPredefinedArray);

        // Bước 2: Nhập mảng từ người dùng và tính tổng các phần tử của mảng vuông
        System.out.print("Nhập số hàng và cột của mảng vuông: ");
        int matrixSize = scanner.nextInt();
        int[][] userMatrix = new int[matrixSize][matrixSize];

        // Nhập giá trị cho mảng từ người dùng
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print("Nhập giá trị cho phần tử [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // In mảng vuông vừa nhập
        System.out.println("Mảng vuông đã nhập là:");
        printArray(userMatrix);

        // Tính tổng các phần tử của mảng vuông vừa nhập
        int userMatrixSum = calculateMatrixSum(userMatrix);
        System.out.println("Tổng của các phần tử trong mảng vuông là: " + userMatrixSum);

        // In mảng predefinedArray
        System.out.println("Mảng predefinedArray là:");
        printArray(predefinedArray);
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

    private static int calculateMatrixSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

