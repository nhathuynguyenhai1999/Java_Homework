import java.util.Arrays;
public class ThemPhanTu {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 12, 18, 25}; // Mảng tăng dần

        System.out.println("Mảng trước khi thêm phần tử (1): " + Arrays.toString(arr1));

        int x1 = 15; // Giá trị phần tử mới
        int k1 = 2; // Vị trí cần thêm phần tử

        // Thêm phần tử vào mảng tại vị trí k
        arr1 = themPhanTu(arr1, x1, k1);

        System.out.println("Mảng sau khi thêm phần tử (1): " + Arrays.toString(arr1));


        int[] arr2 = {2, 5, 8, 12, 18}; // Mảng tăng dần

        System.out.println("Mảng trước khi thêm phần tử (2): " + Arrays.toString(arr2));

        int x2 = 10; // Giá trị phần tử mới

        // Thêm phần tử vào mảng tăng dần, giữ tính tăng của mảng
        arr2 = themPhanTuTang(arr2, x2);

        System.out.println("Mảng sau khi thêm phần tử (2): " + Arrays.toString(arr2));
    }

    // Thêm phần tử vào mảng tại vị trí k
    private static int[] themPhanTu(int[] arr, int x, int k) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }

        result[k] = x;

        for (int i = k + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }

        return result;
    }

    // Thêm phần tử vào mảng tăng dần, giữ tính tăng của mảng
    private static int[] themPhanTuTang(int[] arr, int x) {
        int[] result = new int[arr.length + 1];
        int index = 0;

        // Tìm vị trí thích hợp để chèn phần tử mới
        while (index < arr.length && arr[index] < x) {
            result[index] = arr[index];
            index++;
        }

        result[index] = x;

        // Chép phần còn lại của mảng
        for (int i = index + 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }

        return result;
    }
}
