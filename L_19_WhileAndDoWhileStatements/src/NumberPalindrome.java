public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-12211);
        isPalindrome(707);
        isPalindrome(123454321);
    }

    // Write a method, isPalindrome, with one int parameter, number.
    // The method needs to return a boolean.
    // It should return true if the number is a palindrome number,
        // otherwise, return false
    private static boolean isPalindrome(int number) {
        // conditional will handle a negative number
        if (number < 0) {
            number *= -1;
        }
        // Number to destroy/alter
        int foo = number;
        // reversed number
        int reversed = 0;
        // loop through the altered number
        while (foo > 0) {
            // add the last value of foo to reversed number.
            reversed *= 10;
            reversed += foo % 10;
            // delete the last value of foo.
            foo /= 10;
        }
        System.out.println(reversed);
        // compare reversed number with initial number (the parameter).
        if (reversed == number) {
            // If it is a palindrome, return true
            System.out.println("yes.");
            return true;
            // else return false.
        } else {
            System.out.println("no.");
            return false;
        }
    }
}
