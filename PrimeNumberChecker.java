import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int number = 2; number <= 100; number++){
            if (isPrime(number)) {
                System.out.println(number + " là số nguyên tố.");
        }
            do {
                if (isPrime(number)) {
                    System.out.println(number + " là số nguyên tố.");
                }
                number++;
            } while (number <= 100);
    }
}
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        do {
            if (number < 2) {
                // Do nothing for numbers less than 2
            } else {
                int i = 2;
                boolean isPrime = true;

                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                    i++;
                }

                if (isPrime) {
                    System.out.println(number + " là số nguyên tố.");
                }
            }

            number++;
        } while (number <= 100);
        return true;
    }
}