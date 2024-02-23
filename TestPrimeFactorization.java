package Threading;

import java.util.ArrayList;
import java.util.List;

class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Lazy Prime Factorization: " + i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("Optimized Prime Factorization: " + i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}

public class TestPrimeFactorization {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimizedThread = new Thread(optimizedPrimeFactorization);

        lazyThread.start();
        optimizedThread.start();
    }
}

