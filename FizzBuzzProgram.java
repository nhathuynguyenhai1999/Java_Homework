package James_Module2;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static javax.swing.UIManager.getString;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzProgram {

    public static void main(String[] args) {
        // Thử nghiệm chương trình với một số nguyên
        int testNumber = 15;
        String result = fizzBuzz(testNumber);
        System.out.println("Kết quả cho số " + testNumber + ": " + result);
    }

    public static String fizzBuzz(int number) {
        // Tách biến
        return getString(number);
    }

    @Nested
    class FizzBuzzTranslateTest {

        @Test
        void testTranslate() {
            assertEquals("một", FizzBuzzTranslate.translate(1));
            assertEquals("Fizz", FizzBuzzTranslate.translate(3));
            assertEquals("Buzz", FizzBuzzTranslate.translate(5));
            assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
            assertEquals("hai mươi một", FizzBuzzTranslate.translate(21));
            assertEquals("bảy mươi tám", FizzBuzzTranslate.translate(78));
            assertEquals("Fizz", FizzBuzzTranslate.translate(99));
        }

        @Test
        void testTranslateInvalidNumber() {
            IllegalArgumentException exception = org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> {
                FizzBuzzTranslate.translate(0);
            });

            assertEquals("Số phải lớn hơn 0 và nhỏ hơn 100", exception.getMessage());
        }
    }

    static class FizzBuzzTranslate {

        public static String translate(int number) {
            if (number < 1 || number > 100) {
                throw new IllegalArgumentException("Số phải lớn hơn 0 và nhỏ hơn 100");
            }

            String result = fizzBuzz(number);

            if (result.equals(String.valueOf(number))) {
                result = readNumberInVietnamese(number);
            }

            return result;
        }

        private static String readNumberInVietnamese(int number) {
            String[] units = {"", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
            String[] teens = {"", "mười", "hai mươi", "ba mươi", "bốn mươi", "năm mươi", "sáu mươi", "bảy mươi", "tám mươi", "chín mươi"};

            if (number < 10) {
                return units[number];
            } else if (number < 20) {
                return "mười " + units[number % 10];
            } else {
                return teens[number / 10] + " " + units[number % 10];
            }
        }

        private static String fizzBuzz(int number) {
            return getString(number);
        }

        @NotNull
        private static String getString(int number) {
            boolean isFizz = number % 3 == 0;
            boolean isBuzz = number % 5 == 0;

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
}
