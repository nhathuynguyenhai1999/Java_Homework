import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Nhập giá trị cần tìm:");
        int value = scanner.nextInt();
        int result = binarySearch(array, 0, n - 1, value);
        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng.");
        } else {
            System.out.println("Giá trị" + value + "được tìm thấy tại vị trí" + result);
        }
        scanner.close();
    }
    public static int binarySearch(int[] array, int left, int right, int value){
        if(left <= right){
            int middle = (left + right)/2;

            if(array[middle] == value){
                return middle;
            }
            else if(value > array[middle]){
                return binarySearch(array,middle + 1,right,value);
            }
            else {
                return binarySearch(array,left, middle - 1,value);
            }
        }
        return -1;
    }
}
