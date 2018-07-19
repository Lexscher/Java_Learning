public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    // Write a method, getEvenDigitSum with one int parameter, number.
    // Return the sum of the even digits within the number.
    // If the number is negative, return -1 (invalid value).
    public static int getEvenDigitSum(int number) {
        // Validate
        if (number < 0) {
            return -1;
        }
        // initialize sum. initialize the last digit.
        int sum = 0;
        int lastDigit = number % 10;
        // Loop through the number.
        while (number > 0) {
            // conditional
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
            lastDigit = number % 10;
        }
        return sum;
    }
}
