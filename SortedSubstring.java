package James_Module2;

import java.util.Arrays;
import java.util.Scanner;

public class SortedSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một chuỗi: ");
        String inputString = scanner.nextLine();

        String sortedSubstring = getSortedSubstring(inputString);

        System.out.println("Chuỗi con được sắp xếp: " + sortedSubstring);
    }

    private static String getSortedSubstring(String inputString) {
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}
