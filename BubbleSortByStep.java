package James_Module2;

import java.util.Scanner;

public class BubbleSortByStep {
    static Scanner scanner = new Scanner(System.in);
    public static void bubbleSortByStep(int[] list){
        boolean needNextpass = true;
        for (int k = 1; k < list.length; k++) {
            needNextpass = false;
            for (int i = 0; i < list.length - k; i++) {
                if(list[i] > list[i + 1]){
                    System.out.println("Swap" + list[i] + "with" + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextpass = true;
                }
            }
            if(!needNextpass){
                System.out.println("Mảng có thể được sắp xếp và không cần vượt qua tiếp theo.");
                break;
            }
            System.out.println("List after the " + k + " sort: ");
            for (int i : list) {
                System.out.println(i + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter" + list.length + "values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Your input list: ");
        for (int j : list) {
            System.out.println(j + "\t");
        }
    }
}
