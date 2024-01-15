import java.util.Scanner;

public class BMICalculatorBodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight;
        int height;
        double bmi;
        System.out.println("Nhập cân nặng (tính bằng kilogram): ");
        weight = scanner.nextInt();
        System.out.println("Nhập chiều cao (tính bằng m): ");
        height = scanner.nextInt();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        bmi =  weight / Math.pow(height,2);
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
        //
        String interpretation;
        switch ((int) bmi / 5) {
            case 0:
                interpretation = "Underweight";
                break;
            case 1:
                interpretation = "Normal";
                break;
            case 2:
                interpretation = "Overweight";
                break;
            default:
                interpretation = "Obese";
                break;
        }

        System.out.printf("%-20.2f%s\n", bmi, interpretation);
    }
}
