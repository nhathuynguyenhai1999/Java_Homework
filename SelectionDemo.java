package Stopwatch;

import java.util.Random;

public class SelectionDemo {
    public static void main(String[] args) {
        // Khởi tạo mảng ngẫu nhiên
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000000);
        }

        // Khởi tạo và bắt đầu đồng hồ
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        // Sắp xếp mảng bằng thuật toán sắp xếp chọn
        selectionSort(arr);

        // Dừng đồng hồ
        stopwatch.stop();

        // In thời gian thực thi
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopwatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên chưa được sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
