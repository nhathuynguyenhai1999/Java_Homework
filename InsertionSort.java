package James_Module2;

public class InsertionSort {
    public static void insertionSortSteps(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
            printArray(arr, i);
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }
    public static void printArray(int[] arr, int step) {
        System.out.print("Bước " + step + ": ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Thay đổi mảng đầu vào tại đây
        int[] inputArray = {12, 11, 13, 5, 6};

        System.out.print("Mảng ban đầu: ");
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        insertionSortSteps(inputArray);

        System.out.print("Mảng đã sắp xếp: ");
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
        // Gọi phương thức insertionSort để sắp xếp mảng
        insertionSort(inputArray);

        System.out.print("\nMảng đã sắp xếp (sử dụng insertionSort): ");
        for (int value : inputArray) {
            System.out.print(value + " ");
        }
    }
}

