package com.alexanderschelchere;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 1.5% interest = " + calculateInterest(10000.0, 1.5));
        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        // challenge, reverse the previous loop
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
        // Create a for statement using any range of numbers.
        // Determine if the number is a prime number using the isPrime method.
        // if it is a prime number, print it out and increment a count of the
        // number of prime numbers found.
        // if that count is 3, exit the for loop
        // use the break; statement to exit.
        int primeNumbersFound = 0;
        for (int i = 10; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeNumbersFound ++;
                System.out.println(primeNumbersFound + " prime number(s) detected!");
            }
            if (primeNumbersFound == 7) {
                break;
            }

        }
    }

    // is the number a prime number?
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
