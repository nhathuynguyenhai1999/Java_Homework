import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class XoaPhanTu {
    public static void main (String[] args) {
        int[] arr = {5, -3, 8, -2, 0, 7, 1, -4, 5, 8, 0};

        System.out.println("Mảng trước khi xóa: " + Arrays.toString(arr));

        // Xóa tất cả số âm trong mảng
        arr = xoaSoAm(arr);
        System.out.println("Mảng sau khi xóa số âm: " + Arrays.toString(arr));

        // Xóa tất cả số chẵn trong mảng
        arr = xoaSoChan(arr);
        System.out.println("Mảng sau khi xóa số chẵn: " + Arrays.toString(arr));

        // Xóa tất cả phần tử trùng nhau trong mảng
        arr = xoaPhanTuTrung(arr);
        System.out.println("Mảng sau khi xóa phần tử trùng: " + Arrays.toString(arr));
    }

    // Xóa tất cả số âm trong mảng
    private static int[] xoaSoAm(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Xóa tất cả số chẵn trong mảng
    private static int[] xoaSoChan(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Xóa tất cả phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
    private static int[] xoaPhanTuTrung(int[] arr) {
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (set.add(num)) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
