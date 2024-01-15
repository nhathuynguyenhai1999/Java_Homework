import java.util.Scanner;

public class NumberToWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số cần đọc
        System.out.print("Nhập số cần đọc: ");
        int number = scanner.nextInt();

        // Bước 2: Đọc số có một chữ số
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if (number < 20) { // Bước 3: Đọc số có hai chữ số nhỏ hơn 20
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number < 100) { // Bước 4: Đọc số có hai chữ số lớn hơn hoặc bằng 20
            int tens = number / 10;
            int ones = number % 10;

            String tensString = "";
            String onesString = "";

            switch (tens) {
                case 2:
                    tensString = "Twenty";
                    break;
                case 3:
                    tensString = "Thirty";
                    break;
                case 4:
                    tensString = "Forty";
                    break;
                case 5:
                    tensString = "Fifty";
                    break;
                case 6:
                    tensString = "Sixty";
                    break;
                case 7:
                    tensString = "Seventy";
                    break;
                case 8:
                    tensString = "Eighty";
                    break;
                case 9:
                    tensString = "Ninety";
                    break;
            }

            switch (ones) {
                case 1:
                    onesString = "One";
                    break;
                case 2:
                    onesString = "Two";
                    break;
                case 3:
                    onesString = "Three";
                    break;
                case 4:
                    onesString = "Four";
                    break;
                case 5:
                    onesString = "Five";
                    break;
                case 6:
                    onesString = "Six";
                    break;
                case 7:
                    onesString = "Seven";
                    break;
                case 8:
                    onesString = "Eight";
                    break;
                case 9:
                    onesString = "Nine";
                    break;
            }

            if (ones == 0) {
                System.out.println(tensString);
            } else {
                System.out.println(tensString + " " + onesString);
            }
        } else if (number < 1000) { // Bước 5: Đọc số có ba chữ số
            int hundreds = number / 100;
            int remaining = number % 100;

            String hundredsString = "";
            String remainingString = "";

            switch (hundreds) {
                case 1:
                    hundredsString = "One Hundred";
                    break;
                case 2:
                    hundredsString = "Two Hundred";
                    break;
                case 3:
                    hundredsString = "Three Hundred";
                    break;
                case 4:
                    hundredsString = "Four Hundred";
                    break;
                case 5:
                    hundredsString = "Five Hundred";
                    break;
                case 6:
                    hundredsString = "Six Hundred";
                    break;
                case 7:
                    hundredsString = "Seven Hundred";
                    break;
                case 8:
                    hundredsString = "Eight Hundred";
                    break;
                case 9:
                    hundredsString = "Nine Hundred";
                    break;
            }

            if (remaining != 0) {
                if (remaining < 10) {
                    switch (remaining) {
                        case 1:
                            remainingString = "One";
                            break;
                        case 2:
                            remainingString = "Two";
                            break;
                        case 3:
                            remainingString = "Three";
                            break;
                        case 4:
                            remainingString = "Four";
                            break;
                        case 5:
                            remainingString = "Five";
                            break;
                        case 6:
                            remainingString = "Six";
                            break;
                        case 7:
                            remainingString = "Seven";
                            break;
                        case 8:
                            remainingString = "Eight";
                            break;
                        case 9:
                            remainingString = "Nine";
                            break;
                    }
                } else if (remaining < 20) {
                    int ones = remaining % 10;
                    switch (ones) {
                        case 0:
                            remainingString = "Ten";
                            break;
                        case 1:
                            remainingString = "Eleven";
                            break;
                        case 2:
                            remainingString = "Twelve";
                            break;
                        case 3:
                            remainingString = "Thirteen";
                            break;
                        case 4:
                            remainingString = "Fourteen";
                            break;
                        case 5:
                            remainingString = "Fifteen";
                            break;
                        case 6:
                            remainingString = "Sixteen";
                            break;
                        case 7:
                            remainingString = "Seventeen";
                            break;
                        case 8:
                            remainingString = "Eighteen";
                            break;
                        case 9:
                            remainingString = "Nineteen";
                            break;
                    }
                } else {
                    int tens = remaining / 10;
                    int ones = remaining % 10;

                    String tensString = "";
                    String onesString = "";

                    switch (tens) {
                        case 2:
                            tensString = "Twenty";
                            break;
                        case 3:
                            tensString = "Thirty";
                            break;
                        case 4:
                            tensString = "Forty";
                            break;
                        case 5:
                            tensString = "Fifty";
                            break;
                        case 6:
                            tensString = "Sixty";
                            break;
                        case 7:
                            tensString = "Seventy";
                            break;
                        case 8:
                            tensString = "Eighty";
                            break;
                        case 9:
                            tensString = "Ninety";
                            break;
                    }

                    switch (ones) {
                        case 1:
                            onesString = "One";
                            break;
                        case 2:
                            onesString = "Two";
                            break;
                        case 3:
                            onesString = "Three";
                            break;
                        case 4:
                            onesString = "Four";
                            break;
                        case 5:
                            onesString = "Five";
                            break;
                        case 6:
                            onesString = "Six";
                            break;
                        case 7:
                            onesString = "Seven";
                            break;
                        case 8:
                            onesString = "Eight";
                            break;
                        case 9:
                            onesString = "Nine";
                            break;
                    }

                    if (ones == 0) {
                        remainingString = tensString;
                    } else {
                        remainingString = tensString + " " + onesString;
                    }
                }
            }

            if (remainingString.equals("")) {
                System.out.println(hundredsString);
            } else {
                System.out.println(hundredsString + " and " + remainingString);
            }
        } else {
            System.out.println("Out of ability");
        }
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {
            String result = convertToWords(number);
            System.out.println(result);
        }
    }

    // Hàm chuyển đổi số thành chữ
    public static String convertToWords(int number) {
        if (number < 10) {
            return convertSingleDigit(number);
        } else if (number < 20) {
            return convertTeen(number);
        } else if (number < 100) {
            return convertTens(number / 10) + " " + convertSingleDigit(number % 10);
        } else {
            return convertSingleDigit(number / 100) + " Hundred and " + convertToWords(number % 100);
        }
    }

    // Hàm chuyển đổi số có một chữ số
    public static String convertSingleDigit(int digit) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return words[digit];
    }

    // Hàm chuyển đổi số từ 10 đến 19
    public static String convertTeen(int number) {
        String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        return teens[number - 10];
    }

    // Hàm chuyển đổi hàng chục
    public static String convertTens(int tens) {
        String[] tensWords = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        return tensWords[tens];
    }
}

