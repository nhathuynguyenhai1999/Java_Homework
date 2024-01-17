import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Nhập giá trị cho mảng 1:\n");
        inputArrayValues(array1);

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.print("Nhập giá trị cho mảng 2:\n");
        inputArrayValues(array2);

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int[] array3 = new int[size1 + size2];

        // Bước 4: Duyệt mảng 1 và gán giá trị vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Duyệt mảng 2 và gán giá trị vào mảng 3 từ vị trí cuối của mảng 1
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // Hiển thị mảng 3 sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        displayArray(array3);
    }

    // Phương thức để nhập giá trị cho mảng
    private static void inputArrayValues(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    // Phương thức để hiển thị mảng
    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
