import java.util.Scanner;

public class MinValueArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Size = 5;
        int [] arr = new int[Size];

        for (int i = 0; i < Size; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int minValue = arr[0];

        for (int i = 1; i < Size; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Phần tử có giá trị nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}
