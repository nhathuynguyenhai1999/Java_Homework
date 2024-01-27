package James_Module2;

public class FizzBuzzProgram {

    public static void main(String[] args) {
        // Thử nghiệm chương trình với một số nguyên
        int testNumber = 15;
        String result = fizzBuzz(testNumber);
        System.out.println("Kết quả cho số " + testNumber + ": " + result);
    }

    public static String fizzBuzz(int number) {
        // Tách biến
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        // Tách biến
        String result = "";

        if (isFizz && isBuzz) {
            result = "FizzBuzz";
        } else if (isFizz) {
            result = "Fizz";
        } else if (isBuzz) {
            result = "Buzz";
        } else {
            result = String.valueOf(number);
        }

        return result;
    }
}

