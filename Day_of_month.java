import java.util.Scanner;

public class Day_of_month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bạn muốn đếm ngày vào tháng nào?");
        int month = scanner.nextInt();

        String daysInMonth = "";

        // if/else
        if (month == 2) {
            daysInMonth = "28 or 29";
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            daysInMonth = "31";
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = "30";
        }

        if (!daysInMonth.equals("")) {
            System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        } else {
            System.out.print("Invalid input!");
        }
        //switch/case
        switch (month) {
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }

        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!", month, daysInMonth);
        else System.out.print("Invalid input!");

    }
}
