package James_Module2;

import java.util.Scanner;

public class LongestConsecutiveSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String input = scanner.nextLine();
        String longestSubstring = findLongestConsecutiveSubstring(input);
        System.out.println("Chuỗi con có độ dài lớn nhất là:" + longestSubstring);
    }
    public static String findLongestConsecutiveSubstring(String input){
        assert input != null;
        if(input.isEmpty()){
            return "";
        }
        int maxLength = 0;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1) + 1) {
                currentLength++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i;
                }
            } else {
                currentLength = 1;
            }
        }

        int startIndex = endIndex - maxLength + 1;
        return input.substring(startIndex, endIndex + 1);
    }
}
