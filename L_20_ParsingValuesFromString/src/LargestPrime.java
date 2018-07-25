public class LargestPrime {
    public static void main(String[] args) {
        getLargestPrime(21);

        getLargestPrime(217);

        getLargestPrime(0);

        getLargestPrime(45);

        getLargestPrime(7);

        getLargestPrime(1);
    }

    // Write a method named getLargestPrime with one parameter, number(int).
    // If the number is negative or does not have any prime numbers, return -1.
    // The method should calculate the largest prime of a given number, then return it.
    public static int getLargestPrime(int number) {
        // validation
        if (number <= 1) {
            System.out.println("Invalid Input");
            return -1;
        }

        int count = number;
        // for loop will test every number from the prime number to 0
        for (int i = number; i > 0; i--) {
            // conditional inside a while loop for finding if current index
            // divided by our count number has no remainder.
            while (count < i + 1) {
                if (i % count == 0 && isItPrime(count)) {
                    System.out.println(i + " divided by " + i / count + " = " + count);
                    return count;
                }
                count--;
            }
            count = number;
        }
        System.out.println("no");
        return -1;
    }
    // method to check if a number is prime.
    public static boolean isItPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
