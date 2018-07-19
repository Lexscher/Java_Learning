public class DigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of the digits in your number of choice is " +  sumDigits(125));
        System.out.println("The sum of the digits in your number of choice is " +  sumDigits(5876));
        System.out.println("The sum of the digits in your number of choice is " +  sumDigits(23));
    }

    // Write a method with the name sumDigits that has one parameter, number (int).
    // If number is greater than or equal to 10, then the method should
    // process the number and return the sum of all digits, otherwise return -1.
    // Example: sumDigits(125) should return 8 (this is 1 + 2 + 5).

    private static int sumDigits(int number) {
        // Validation.
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
