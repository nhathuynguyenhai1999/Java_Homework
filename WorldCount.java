package thamtrivathamchieu;

import java.util.Scanner;
import java.util.TreeMap;

public class WorldCount {
    public static void main(String[] args) {
        // Nhập chuỗi từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        scanner.close();
        // Sử dụng TreeMap để lưu trữ từ và số lần xuất hiện
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Tách từng từ từ chuỗi
        String[] words = inputString.split("\\s+");

        // Duyệt qua mỗi từ và cập nhật TreeMap
        for (String word : words) {
            // Chuyển đổi từ thành chữ thường để đảm bảo không phân biệt chữ hoa chữ thường
            String cleanedWord = word.toLowerCase();

            // Kiểm tra xem từ đã tồn tại trong TreeMap hay chưa
            if (wordCountMap.containsKey(cleanedWord)) {
                // Nếu đã tồn tại, tăng giá trị (số lần xuất hiện) lên 1
                wordCountMap.put(cleanedWord, wordCountMap.get(cleanedWord) + 1);
            } else {
                // Nếu chưa tồn tại, thêm từ mới vào TreeMap với giá trị là 1
                wordCountMap.put(cleanedWord, 1);
            }
        }

        // Hiển thị kết quả
        System.out.println("Kết quả đếm số lần xuất hiện của từng từ:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
