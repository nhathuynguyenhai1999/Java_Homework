import java.util.Scanner;

public class KiemTraUocSoChungLonNhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Nhập a: ");
        a = scanner.nextInt();

        System.out.println("Nhập b:");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất;");
        } else {
            int gcd = timUocSoChungLonNhat(a, b);
            System.out.println("Ước số chung lớn nhất: " + gcd);
        }
    }

    // Phương thức tìm ước số chung lớn nhất
    public static int timUocSoChungLonNhat(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
