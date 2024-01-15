import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Trình phân giải phương trình tuyến tính");
        System.out.println("Cho một phương trình là 'a * x + b = c', vui lòng nhập hằng số:");
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Phương trình vượt qua với x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("Giải pháp là tất cả x!");
            } else {
                System.out.print("Không có giải pháp");
            }
        }
    }
}
